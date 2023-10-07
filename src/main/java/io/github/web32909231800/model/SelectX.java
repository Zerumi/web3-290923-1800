package io.github.web32909231800.model;

import java.io.Serializable;

public enum SelectX implements Serializable {
    MINUS2(-2.0),
    MINUS15(-1.5),
    MINUS1(-1.0),
    MINUS05(-0.5),
    PLUS0(0),
    PLUS05(0.5),
    UNSELECTED(Double.NaN);
    private final double value;
    SelectX(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }
}
