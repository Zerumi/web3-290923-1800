package io.github.web32909231800.model;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Named;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;

@Named
@ApplicationScoped
public class CheckAreaBean implements Serializable {
    private double x;
    private double y;
    private double r;
    private boolean result;
    private LocalDateTime executedAt;
    private long execTime;

    public CheckAreaBean() {
        super();
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public boolean isResult() {
        return result;
    }

    public void setResult(boolean result) {
        this.result = result;
    }

    public LocalDateTime getExecutedAt() {
        return executedAt;
    }

    public void setExecutedAt(LocalDateTime executedAt) {
        this.executedAt = executedAt;
    }

    public long getExecTime() {
        return execTime;
    }

    public void setExecTime(long execTime) {
        this.execTime = execTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CheckAreaBean)) return false;
        CheckAreaBean that = (CheckAreaBean) o;
        return Double.compare(getX(), that.getX()) == 0 && Double.compare(getY(), that.getY()) == 0 && Double.compare(getR(), that.getR()) == 0 && isResult() == that.isResult() && getExecTime() == that.getExecTime() && Objects.equals(getExecutedAt(), that.getExecutedAt());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getX(), getY(), getR(), isResult(), getExecutedAt(), getExecTime());
    }

    @Override
    public String toString() {
        return "CheckAreaBean{" +
                "x=" + x +
                ", y=" + y +
                ", r=" + r +
                ", result=" + result +
                ", executedAt=" + executedAt +
                ", execTime=" + execTime +
                '}';
    }
}
