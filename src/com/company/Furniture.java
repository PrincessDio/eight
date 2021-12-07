package com.company;

public abstract class Furniture {

    int cost;
    int comfort;
    String material;
    String name;

    public Furniture() {
    }

    public Furniture(int cost, int comfort, String material, String name) {
        this.cost = cost;
        this.comfort = comfort;
        this.material = material;
    }

    @Override
    public String toString() {
        return "Furniture{" +
                "cost=" + cost +
                ", comfort=" + comfort +
                ", material='" + material + '\'' +
                '}';
    }

    public int getCost() {
        return cost;
    }

    public int getComfort() {
        return comfort;
    }

    public String getMaterial() {
        return material;
    }

    public String getName() {
        return name;
    }
}
