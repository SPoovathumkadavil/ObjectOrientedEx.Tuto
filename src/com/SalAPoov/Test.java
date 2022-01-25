package com.SalAPoov;

public class Test {
    int appId;
    String appName;

    Test(int id, String name) {
        this.appId = id;
        this.appName = name;
    }

    void info() {
        System.out.println("Id: " + appId + " Name: " + appName);
    }
}