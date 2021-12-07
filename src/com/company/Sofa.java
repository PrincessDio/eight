package com.company;

public class Sofa extends Furniture{

    @Override
    public String toString() {
        return "Диван";
    }

    public Sofa() {
        super(2000, 85, "wood", "sofa");
    }
}
