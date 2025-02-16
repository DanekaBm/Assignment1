package org.example;

import org.springframework.stereotype.Component;

@Component
public class River {

    private String name;

    public void flow() {
        System.out.println(name + " flows under the bridge.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void measureDepth() {
        System.out.println("The depth of the river '" + name + "' is 15 meters.");
    }
}
