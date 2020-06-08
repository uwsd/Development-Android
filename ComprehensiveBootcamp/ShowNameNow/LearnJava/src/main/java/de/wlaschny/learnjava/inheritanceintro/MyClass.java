package de.wlaschny.learnjava.inheritanceintro;

public class MyClass {
    public static void main(String[] args) {
        Person uwe = new Person("Mike", "Müller", 46);
        System.out.println(uwe.getFirstName());

        Employee employee = new Employee();
        employee.setFirstName("James");
        employee.setLastName("Bond");
        employee.setAge(45);
        employee.setId(4711);
        employee.setAnnualSalary(100000);

        System.out.println(employee.getFirstName() + " " +
                employee.getId() + " " + employee.getAnnualSalary());

        Manager manager = new Manager();
        manager.setFirstName("Manager George");
        manager.setLastName("Kilos");
        manager.setAge(35);
        manager.setAnnualSalary(45000);
        manager.setId(4711);

//        System.out.println(manager.getAnnualSalary() + ", " + manager.getFirstName());
        System.out.println(manager);

        int a = 12;
        String myString = "";
        boolean isEmpty = myString.isEmpty();

        if (!isEmpty) {
            System.out.println(myString);
        } else {
            System.out.println("Empty");
        }

        myString = "Hello";
        boolean contains = myString.contains("h");

        if (contains) {
            System.out.println(myString);
        } else {
            System.out.println("not contains a 'h'");
        }

    }
}
