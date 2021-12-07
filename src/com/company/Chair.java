package com.company;

public class Chair extends Furniture{

    @Override
    public String toString() {
        return "Стул";
    }

    public Chair() {
        super(300, 50, "wood", "chair");
    }
}
