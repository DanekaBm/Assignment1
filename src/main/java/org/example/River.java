package org.example;

import org.springframework.stereotype.Component;

@Component
public class River {

    private String name;

    public void flow() {
        System.out.println(name + " течет под мостом.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}