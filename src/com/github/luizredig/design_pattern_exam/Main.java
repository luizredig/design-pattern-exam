package com.github.luizredig.design_pattern_exam;

import com.github.luizredig.design_pattern_exam.singleton.Device;
import com.github.luizredig.design_pattern_exam.singleton.GlobalConfig;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the IoT Device Management System!");

        GlobalConfig config = GlobalConfig.getInstance();

        Device device1 = new Device("Temperature Sensor", true);
        Device device2 = new Device("Smart Light", false);
        Device device3 = new Device("Security Camera", true);

        config.addDevice(device1);
        config.addDevice(device2);
        config.addDevice(device3);

        System.out.println("Connected Devices:");
        for (Device device : config.getDevices()) {
            System.out.println(device);
        }

        System.out.println("Total connected devices (Global Count): " + config.getConnectedDevicesCount());

        config.removeDevice(device2);

        System.out.println("Updated Connected Devices:");
        for (Device device : config.getDevices()) {
            System.out.println(device);
        }

        System.out.println("Total connected devices (Global Count): " + config.getConnectedDevicesCount());
    }
}
