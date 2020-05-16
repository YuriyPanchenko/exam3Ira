package com.company;

import java.util.ArrayList;

public class Tree {
    private String name;
    private double height;
    private int age;
    private ArrayList<Branch> branches;
    private ArrayList<Leaf> leafs;
    private boolean isBloom = false;
    private boolean isFrost = false;

    public Tree(String name, double height, int age, ArrayList<Branch> branches, ArrayList<Leaf> leafs) {
        this.name = name;
        this.height = height;
        this.age = age;
        this.branches = branches;
        this.leafs = leafs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public ArrayList<Branch> getBranches() {
        return branches;
    }

    public void setBranches(ArrayList<Branch> branches) {
        this.branches = branches;
    }

    public ArrayList<Leaf> getLeafs() {
        return leafs;
    }

    public void setLeafs(ArrayList<Leaf> leafs) {
        this.leafs = leafs;
    }

    public boolean isFrost() {
        return isFrost;
    }

    public void setFrost(boolean frost) {
        isFrost = frost;
    }

    @Override
    public String toString() {
        return "Tree{" +
                "name='" + name + '\'' +
                ", height='" + height + '\'' +
                ", age=" + age +
                ", branches=" + branches +
                ", leafs=" + leafs +
                ", isBloom=" + isBloom +
                ", isFrost=" + isFrost +
                '}';
    }

    public void blooming(){
        if(this.isBloom == true){
            System.out.println("this tree is already bloomed");
        }
        else this.isBloom = true;
    }
    public void withering(){
        if(this.isBloom == false){
            System.out.println("this tree is already withered");
        }
        else this.isBloom = false;
    }
    public void createFrost(){
        this.isFrost = true;
    }

    public void leafFall(){
        this.leafs.clear();
    }
    public void yellowingLeafs(){
        for (Leaf leaf: this.leafs
             ) {
            leaf.setColor("yellow");
        }
    }
}
