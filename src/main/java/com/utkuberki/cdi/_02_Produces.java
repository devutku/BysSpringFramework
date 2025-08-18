package com.utkuberki.cdi;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Produces;
import jakarta.inject.Named;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Named(value = "producetuto")
@ApplicationScoped
@Data

public class _02_Produces {
    @Produces
    public List<String> getList(){
        List<String> list = new ArrayList<>();
        list.add("HTML5");
        list.add("CSS3");
        list.add("JS");
        list.add("React");
        list.add("Angular");
        return list;
    }
}
