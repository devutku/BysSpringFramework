package com.utkuberki.bean;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Named;
import lombok.*;

@Named(value = "cdiBean")
@ApplicationScoped
@Getter
@Setter
public class JsfBean {
    private String message;

    public JsfBean() {
        this.message = "Spring Boot Hoşgeldin!";
    }
}
