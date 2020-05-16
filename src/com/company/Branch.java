package com.company;

public class Branch {
    private String color;
    private boolean isMain;

    public Branch() {
    }

    public Branch(String color, boolean isMain) {
        this.color = color;
        this.isMain = isMain;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isMain() {
        return isMain;
    }

    public void setMain(boolean main) {
        isMain = main;
    }

    @Override
    public String toString() {
        return "Branch{" +
                "color='" + color + '\'' +
                ", isMain=" + isMain +
                '}';
    }
}
