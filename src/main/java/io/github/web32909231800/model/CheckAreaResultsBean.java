package io.github.web32909231800.model;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.faces.context.FacesContext;
import jakarta.inject.Inject;
import jakarta.inject.Named;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.LinkedList;
import java.util.Objects;

@Named
@ApplicationScoped
public class CheckAreaResultsBean implements Serializable {
    @Inject
    private SelectXBean selectXBean;
    @Inject
    private SelectYBean selectYBean;
    @Inject
    private SelectRBean selectRBean;

    private LinkedList<CheckAreaBean> results;

    public CheckAreaResultsBean() {
        super();
        results = new LinkedList<>();
    }

    @Named(value = "resultList")
    public LinkedList<CheckAreaBean> getResults() {
        return results;
    }

    public void setResults(LinkedList<CheckAreaBean> results) {
        this.results = results;
    }

    public void newResult() {
        final CheckAreaBean currentResult = new CheckAreaBean();
        final long startExec = System.nanoTime();
        final double x = selectXBean.getValue();
        final double y = selectYBean.getValue();
        final double r = selectRBean.getValue();
        final boolean result = AreaResultChecker.getResult(x, y, r);
        final long endExec = System.nanoTime();
        final long executionTime = endExec - startExec;
        currentResult.setX(x);
        currentResult.setY(y);
        currentResult.setR(r);
        currentResult.setResult(result);
        currentResult.setExecutedAt(LocalDateTime.now());
        currentResult.setExecTime(executionTime);
        // add to db
        FacesContext.getCurrentInstance().getPartialViewContext().getEvalScripts().add("drawPointXYRes(" + x + ", " + y + ", " + result + ");");
        results.addFirst(currentResult);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CheckAreaResultsBean)) return false;
        CheckAreaResultsBean that = (CheckAreaResultsBean) o;
        return Objects.equals(selectXBean, that.selectXBean) && Objects.equals(selectYBean, that.selectYBean) && Objects.equals(selectRBean, that.selectRBean) && Objects.equals(getResults(), that.getResults());
    }

    @Override
    public int hashCode() {
        return Objects.hash(selectXBean, selectYBean, selectRBean, getResults());
    }

    @Override
    public String toString() {
        return "CheckAreaResultsBean{" +
                "selectXBean=" + selectXBean +
                ", selectYBean=" + selectYBean +
                ", selectRBean=" + selectRBean +
                ", results=" + results +
                '}';
    }
}
