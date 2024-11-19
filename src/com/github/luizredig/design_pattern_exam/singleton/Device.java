package com.github.luizredig.design_pattern_exam.singleton;

public class Device {
    private String name;
    private boolean isActive;

    public Device(String name, boolean isActive) {
        this.name = name;
        this.isActive = isActive;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    @Override
    public String toString() {
        return "Device{name='" + name + "', isActive=" + isActive + "}";
    }
}
