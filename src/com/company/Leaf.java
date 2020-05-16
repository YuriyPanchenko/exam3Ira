package com.company;

public class Leaf {
    private String color;

    public Leaf() {
    }

    public Leaf(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Leaf{" +
                ", color='" + color + '\'' +
                '}';
    }
}
