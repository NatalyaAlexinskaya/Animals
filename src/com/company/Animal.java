package com.company;

public abstract class Animal implements Voice, Action {
    protected abstract String getTipe();

    String getDescription() {
        return getTipe() + " говорит " + getVoice() + " и " + getAction() + ".";
    }
}
