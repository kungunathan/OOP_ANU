package org.example;

// Program 1
public class Main {
    public static void main(String[] args) {
        A a1 = new A();
        A a2 = new A();
        System.out.println(a1.equals(a2));
    }
}

class A {
    int x;

    public boolean equals(A a) {
        return this.x == a.x;
    }
}