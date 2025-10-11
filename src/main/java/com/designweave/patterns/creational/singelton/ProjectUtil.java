package com.designweave.patterns.creational.singelton;

public final class ProjectUtil {
    private static final ProjectUtil instance = new ProjectUtil();

    private ProjectUtil() {}

    public static ProjectUtil getInstance() {
        return instance;
    }
}
