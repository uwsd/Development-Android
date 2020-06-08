package de.wlaschny.learnjava.inheritanceintro;

public class Manager extends Employee {
    @Override
    public double getAnnualSalary() {
        return super.getAnnualSalary() + 10000;
    }

    @Override
    public int getId() {
        return super.getId() + 100;
    }

    @Override
    public String toString() {
        return this.getFirstName() + ", " +
                getId() + ", " +
                getAnnualSalary();
    }
}
