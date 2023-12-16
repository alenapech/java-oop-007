package org.alenapech.observer;

public class Student implements Observer{

    private String name;

    private int salary;

    public Student(String name) {
        this.name = name;
        this.salary = 0;
    }

    @Override
    public void receiveOffer(String newCompany, int salary) {
        if (salary < salary) {
            System.out.println(String.format("Student %s: I need this work! (company, salary) = %s, %d%n", name, newCompany, salary));
        } else {
            System.out.println(String.format("Student %s: I got better job! (company, salary) = %s, %d%n", name, newCompany, salary));
        }
    }
}
