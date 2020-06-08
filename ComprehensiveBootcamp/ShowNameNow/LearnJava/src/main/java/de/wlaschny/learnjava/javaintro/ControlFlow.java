package de.wlaschny.learnjava.javaintro;

public class ControlFlow {
    public static void main(String[] args) {
        double a = 13;
        double b = 11;

        if (a == b) {
            System.out.println("Indeed");
        } else {
            System.out.println("Not true");
        }

        boolean isAged = true;
        if (!isAged) {
            System.out.println("Indeed");
        } else {
            System.out.println("Not true");
        }

        double firstAge = 21;
        double secondAge = 17;
        isAged = true;

        if (firstAge >= 21) {
            System.out.println("Indeed");
        } else {
            System.out.println("Not true");
        }

        for (int i = 0; i < 10; i++) {
            System.out.println("Hello there");
        }

    }

}

