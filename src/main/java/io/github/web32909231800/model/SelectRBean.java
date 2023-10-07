package io.github.web32909231800.model;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Named;

import java.io.Serializable;
import java.util.Objects;

@Named
@ApplicationScoped
public class SelectRBean implements Serializable {
    private double value;

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SelectRBean)) return false;
        SelectRBean that = (SelectRBean) o;
        return Double.compare(getValue(), that.getValue()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getValue());
    }

    @Override
    public String toString() {
        return "SelectRBean{" +
                "value=" + value +
                '}';
    }
}
