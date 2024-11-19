package com.github.luizredig.design_pattern_exam.singleton;

import java.util.ArrayList;
import java.util.List;

public class GlobalConfig {
    private static volatile GlobalConfig instance;

    private GlobalConfig() {
        this.devices = new ArrayList<>();
        this.deviceCount = 0;
    }

    public static GlobalConfig getInstance() {
        if (instance == null) {
            synchronized (GlobalConfig.class) {
                if (instance == null) {
                    instance = new GlobalConfig();
                }
            }
        }
        return instance;
    }

    private List<Device> devices;
    private int deviceCount;

    public void addDevice(Device device) {
        devices.add(device);
        deviceCount = devices.size();
        System.out.println("Device added: " + device.getName());
    }


    public void removeDevice(Device device) {
        if (devices.remove(device)) {
            deviceCount = devices.size();
            System.out.println("Device removed: " + device.getName());
        } else {
            System.out.println("Device not found: " + device.getName());
        }
    }

    public int getConnectedDevicesCount() {
        return deviceCount;
    }

    public List<Device> getDevices() {
        return devices;
    }
}
