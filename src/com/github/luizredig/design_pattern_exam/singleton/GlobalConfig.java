package com.github.luizredig.design_pattern_exam.singleton;

public class GlobalConfig {
    private static volatile GlobalConfig instance;

    private GlobalConfig() {
    }

    public static GlobalConfig getInstance() {
        if (instance == null) {
            instance = new GlobalConfig();
        }
        return instance;
    }

    private String designPattern;
    private String professor;
    private String student;

    public String getGlobalDesignPattern() {
        return designPattern;
    }

    public void setGlobalDesignPattern(String pattern) {
        this.designPattern = pattern;
    }

    public String getGlobalProfessor() {
        return professor;
    }

    public void setGlobalProfessor(String professor) {
        this.professor = professor;
    }

    public String getGlobalStudent() {
        return student;
    }

    public void setGlobalStudent(String student) {
        this.student = student;
    }
}