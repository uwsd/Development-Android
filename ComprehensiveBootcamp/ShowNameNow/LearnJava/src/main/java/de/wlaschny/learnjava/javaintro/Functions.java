package de.wlaschny.learnjava.javaintro;

public class Functions {
    public static void main(String[] args) {

        showName();
        anotherMethod("Mike");
        anotherMethod("Isabel");

        System.out.println(divideNumbers(9.0, 4));
        double item = divideNumbers(7.0, 3);
        System.out.println("Returned Value: " + item);
//        double item2 = divideNumbers(7.0, 3, 1);
//        System.out.println("Returned Value: " + item2);

        String bio = showBio("Uwe", "I was born in Krefeld.", 56);
        System.out.println(bio);

    }

//    private static int divideNumbers(double first, int second, int a) {
//        System.out.println("Result: " + (int) first / second);
//        return a;
//    }

    public static double divideNumbers(double first, int second) {
        System.out.println("Result: " + (int) first / second);
        return 1.0;
    }

    private static void anotherMethod(String something) {
        System.out.println("From Another Method. Parameter: " + something);
    }

    private static void showName() {
        System.out.println("From ShowName");
    }

    public static String showBio(String name, String bio, int age) {
        return "My name is " + name +
                " and I'm " + age + " years old. " + bio;
    }

}
