package io.github.web32909231800.model;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Named;

import java.io.Serializable;

@Named
@ApplicationScoped
public class Bean implements Serializable {
    private double selectedValue;

    public double getSelectedValue() {
        return selectedValue;
    }

    public void setSelectedValue(double selectedValue) {
        this.selectedValue = selectedValue;
    }

    public void checkboxValueChanged() {
        // You can perform any logic here when a checkbox is clicked
    }
}
