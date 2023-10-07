package io.github.web32909231800.model;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.LinkedList;

@Named
@ApplicationScoped
public class CheckAreaResultsBean implements Serializable {
    @Inject
    private CheckAreaBean currentResult;

    @Inject
    private SelectXBean selectXBean;
    //@Inject
    //private SelectYBean selectYBean;
    //@Inject
    //private SelectRBean selectRBean;

    private LinkedList<CheckAreaBean> results;

    public CheckAreaResultsBean() {
        super();
    }

    @Named(value = "resultList")
    public LinkedList<CheckAreaBean> getResults() {
        return results;
    }

    public void setResults(LinkedList<CheckAreaBean> results) {
        this.results = results;
    }

    public void newResult() {
        final long startExec = System.nanoTime();
        currentResult.setX(selectXBean.getLastSelected().getValue());
        currentResult.setY(0);
        currentResult.setR(0);
        currentResult.setExecutedAt(LocalDateTime.now());
    }
}
