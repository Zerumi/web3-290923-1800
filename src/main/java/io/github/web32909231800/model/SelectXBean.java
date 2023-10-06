package io.github.web32909231800.model;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Named;

import java.io.Serializable;

@Named
@ApplicationScoped
public class SelectXBean implements Serializable {
    private boolean selectedM2;
    private boolean selectedM15;
    private boolean selectedM1;
    private boolean selectedM05;
    private boolean selected0;
    private boolean selected05;
    private int lastSelected;

    public boolean isSelectedM2() {
        return selectedM2;
    }

    public void setSelectedM2(boolean selectedM2) {
        this.selectedM2 = selectedM2;
    }

    public boolean isSelectedM15() {
        return selectedM15;
    }

    public void setSelectedM15(boolean selectedM15) {
        this.selectedM15 = selectedM15;
    }

    public boolean isSelectedM1() {
        return selectedM1;
    }

    public void setSelectedM1(boolean selectedM1) {
        this.selectedM1 = selectedM1;
    }

    public boolean isSelectedM05() {
        return selectedM05;
    }

    public void setSelectedM05(boolean selectedM05) {
        this.selectedM05 = selectedM05;
    }

    public boolean isSelected0() {
        return selected0;
    }

    public void setSelected0(boolean selected0) {
        this.selected0 = selected0;
    }

    public boolean isSelected05() {
        return selected05;
    }

    public void setSelected05(boolean selected05) {
        this.selected05 = selected05;
    }

    public int getLastSelected() {
        return lastSelected;
    }

    public void setLastSelected(int lastSelected) {
        this.lastSelected = lastSelected;
    }

    public void checkboxValueChanged() {
        if (isSelectedM2() && lastSelected == 1) setSelectedM2(false);
        if (isSelectedM15() && lastSelected == 2) setSelectedM15(false);
        if (isSelectedM1() && lastSelected == 3) setSelectedM1(false);
        if (isSelectedM05() && lastSelected == 4) setSelectedM05(false);
        if (isSelected0() && lastSelected == 5) setSelected0(false);
        if (isSelected05() && lastSelected == 6) setSelected05(false);

        if (isSelectedM2()) lastSelected = 1;
        if (isSelectedM15()) lastSelected = 2;
        if (isSelectedM1()) lastSelected = 3;
        if (isSelectedM05()) lastSelected = 4;
        if (isSelected0()) lastSelected = 5;
        if (isSelected05()) lastSelected = 6;
    }
}
