package io.github.web32909231800.model;

import jakarta.inject.Named;
import jakarta.enterprise.context.ApplicationScoped;

import java.io.Serializable;

@Named
@ApplicationScoped
public class HelloBean implements Serializable {
    private String name;

    private String sayWelcome;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSayWelcome() {
        if (name == null || name.isEmpty()) {
            sayWelcome = "";
        } else sayWelcome = "Ajax message: welcome " + name;
        return sayWelcome;
    }

    public void setSayWelcome(String sayWelcome) {
        this.sayWelcome = sayWelcome;
    }
}
