package com.vv.buildstuff.displayroute.responseDirections;

/**
 * Created by vvennava on 10/4/14.
 */
public class Vehicle {
    private String name;
    private String type;
    private String icon;

    public Vehicle() {
    }

    public Vehicle(String name, String type, String icon) {
        this.name = name;
        this.type = type;
        this.icon = icon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    @Override
    public String toString() {
        return "Vehicle [" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", icon='" + icon + '\'' +
                ']';
    }
}

