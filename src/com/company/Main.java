package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Branch> branches = new ArrayList<>();
        branches.add(new Branch("brown", true));
        branches.add(new Branch("brown", false));
        branches.add(new Branch("brown", false));
        branches.add(new Branch("brown", false));
        branches.add(new Branch("brown", false));

        ArrayList<Leaf> leaves = new ArrayList<>();
        leaves.add(new Leaf("green"));
        leaves.add(new Leaf("green"));
        leaves.add(new Leaf("green"));
        leaves.add(new Leaf("green"));
        leaves.add(new Leaf("green"));
        leaves.add(new Leaf("green"));

        Tree tree = new Tree("Дуб", 50, 15, branches, leaves);
        System.out.println("наш щойно створений об'єкт дерево: " + tree);
        tree.yellowingLeafs();
        System.out.println("дерево після пожовтіння листви: " + tree);
        tree.leafFall();
        System.out.println("дерево після опадання листви: " + tree);
        tree.createFrost();
        System.out.println("дерево покривється інієм: " + tree);
        tree.blooming();
        System.out.println("дерево зацвіло: " + tree);
        tree.withering();
        System.out.println("дерево зав'яло: " + tree);

    }
}
