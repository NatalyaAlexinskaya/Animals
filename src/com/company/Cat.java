package com.company;

public class Cat extends Animal {
    @Override
    protected String getTipe() {
        return "Кот";
    }

    @Override
    public String getAction() {
        return "ловит мышей";
    }

    @Override
    public String getVoice() {
        return "мяу";
    }
}
