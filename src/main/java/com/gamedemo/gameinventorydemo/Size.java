package com.gamedemo.gameinventorydemo;

public enum Size {
    SMALL(1),
    MEDIUM(2),
    LARGE(3);

    private int weight;

    Size(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }
}
