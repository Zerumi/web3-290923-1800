package io.github.web32909231800.model;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Named;

import java.io.Serializable;
import java.util.Objects;

@Named
@ApplicationScoped
public class SelectYBean implements Serializable {
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
        if (!(o instanceof SelectYBean)) return false;
        SelectYBean that = (SelectYBean) o;
        return Double.compare(getValue(), that.getValue()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getValue());
    }

    @Override
    public String toString() {
        return "SelectYBean{" +
                "value=" + value +
                '}';
    }
}
