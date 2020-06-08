package de.wlaschny.learnjava.datastructuresintro;

import java.util.ArrayList;

public class myClass {
    public static void main(String[] args) {
        int[] myArray = {1, 33, 4, 12, 89, 98};
        String[] names = {"Uwe", "James", "Isabel", "Anne"};

        System.out.println(myArray[0]);
        System.out.println(names[1]);


//        for (int i = 0; i < myArray.length; i++) {
        for (int item : myArray) {
            System.out.println("Items: " + item);
        }

        int[] newArray = new int[4];
        String[] newNames = new String[5];

        newArray[0] = 12;
        newArray[1] = 42;
        newArray[2] = 101;
        newArray[3] = 113;

        for (int item : newArray) {
            System.out.println("Items: " + item);
        }

        ArrayList<String> name = new ArrayList();
        name.add("Bond");
        name.add("James");
        name.add("Bonni");
        name.add("Arnold");

        System.out.println(name.get(0));

        for (String n : name) {
            System.out.println(n);
        }
    }
}
