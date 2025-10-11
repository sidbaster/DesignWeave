package com.designweave.patterns.creational.singelton;

import java.util.ArrayList;
import java.util.List;

public class MultitoneProject {
    private static final List<MultitoneProject> instances = new ArrayList<>();
    private static int maxCount = 10;

    static {
        for (int i = 1; i <= maxCount; i++) {
            instances.add(new MultitoneProject());
        }
    }
    private  MultitoneProject() {}

    public static MultitoneProject getInstance() {
        return  instances.getFirst();
    }
}
