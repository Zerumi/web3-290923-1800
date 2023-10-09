package io.github.web32909231800.model;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Named;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;

@Named
@ApplicationScoped
public class CheckAreaBean implements Serializable {
    private long id;
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

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CheckAreaBean)) return false;
        CheckAreaBean bean = (CheckAreaBean) o;
        return getId() == bean.getId() && Double.compare(getX(), bean.getX()) == 0 && Double.compare(getY(), bean.getY()) == 0 && Double.compare(getR(), bean.getR()) == 0 && isResult() == bean.isResult() && getExecTime() == bean.getExecTime() && Objects.equals(getExecutedAt(), bean.getExecutedAt());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getX(), getY(), getR(), isResult(), getExecutedAt(), getExecTime());
    }

    @Override
    public String toString() {
        return "CheckAreaBean{" +
                "id=" + id +
                ", x=" + x +
                ", y=" + y +
                ", r=" + r +
                ", result=" + result +
                ", executedAt=" + executedAt +
                ", execTime=" + execTime +
                '}';
    }
}
