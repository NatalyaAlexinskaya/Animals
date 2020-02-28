package com.company;

public class UnknownAnimal extends Animal {
    private String name;

    UnknownAnimal(String name) {
        this.name = name;
    }

    @Override
    protected String getTipe() {
        return name + " это неизвестное животное,";
    }

    @Override
    public String getAction() {
        return "неизвсетно что делает";
    }

    @Override
    public String getVoice() {
        return "неизвестно как";
    }
}
