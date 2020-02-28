package com.company;

public class Dog extends Animal {
    @Override
    protected String getTipe() {
        return "Собака";
    }

    @Override
    public String getAction() {
        return "охраняет дом";
    }

    @Override
    public String getVoice() {
        return "гав";
    }
}
