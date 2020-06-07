package de.wlaschny.learnjava;

public class MyClass {
    public static void main(String[] args) {
        int a = 12;
        double b = 12.0;

        int total = (int) (b + a);
        System.out.println("The total is: " + total);

        System.out.println(9 + total);
        System.out.println("9" + total);

        total = (int) (b - a);
        System.out.println("Substraction, the total is: " + total);

        total = (int) (b / a);
        System.out.println("Division (int), the total is: " + total);

        double total_d = (b / a);
        System.out.println("Division (double), the total is: " + total_d);

        total += 100;
        System.out.println("Division (int), the total is: " + total);

        double c = 12;
        double d = 6;
        int remainder = (int) (c % d);
        System.out.println("Modulo, the remainder is: " + remainder);

        d = 7;
        remainder = (int) (c % d);
        System.out.println("Modulo, the remainder is: " + remainder);

    }
}