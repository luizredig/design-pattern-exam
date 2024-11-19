package com.github.luizredig.design_pattern_exam;

import com.github.luizredig.design_pattern_exam.singleton.GlobalConfig;

public class Main {
    public static void main(String[] args) {
        GlobalConfig config = GlobalConfig.getInstance();

        config.setGlobalDesignPattern("Singleton");
        config.setGlobalProfessor("Escobar");
        config.setGlobalStudent("Redig");

        System.out.println(config.getGlobalDesignPattern());
        System.out.println(config.getGlobalProfessor());
        System.out.println(config.getGlobalStudent());
    }
}

