package org.example;

import org.springframework.stereotype.Component;

@Component
public class Bridge {

    private String name;

    public void connect() {
        System.out.println(name + " соединяет берега реки.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void inspect() {
        System.out.println("Inspection of bridge: '" + name + "' - condition is ok.");
    }
}