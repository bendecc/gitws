package com.codecool.gitws;

public class GittingAround {
    public static void main(String[] args) {
        counter();
        sayHello();
        print();
        otherPrint();
    }

    public static void otherPrint() {
        System.out.println("other print");
    }

    public static int counter() {
        return 1;
    }

    public static void sayHello() {
        System.out.println("Hello");
    }

    public static void print() {
        System.out.println("otherBranch");
    }
}
