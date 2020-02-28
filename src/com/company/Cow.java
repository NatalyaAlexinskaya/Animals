package com.company;

public class Cow extends Animal {
    @Override
    protected String getTipe() {
        return "Корова";
    }

    @Override
    public String getAction() {
        return "дает молоко";
    }

    @Override
    public String getVoice() {
        return "муу";
    }
}
