package com.codecool.gitws;

public class GittingAround {
    public static void main(String[] args) {
        sayHello();
        print();
        otherPrint();
    }

    public static void otherPrint() {
        System.out.println("other print");
    }

    public static void sayHello() {
        System.out.println("Hello Git");
    }

    public static void print() {
        System.out.println("otherBranch");
    }
}
