package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Bridge bridge = context.getBean(Bridge.class);
        River river = context.getBean(River.class);

        bridge.connect();
        bridge.inspect();

        river.flow();
        river.measureDepth();

        System.out.println("Name of bridge: " + bridge.getName());
        System.out.println("Name of river: " + river.getName());
    }
}