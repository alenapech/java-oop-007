package org.alenapech.observer;

import java.util.Random;

public class Company {

    Publisher jobAgency;

    private String name;
    private int maxSalary;
    private Random rnd;

    public Company(String name, int maxSalary, Publisher publisher) {
        this.jobAgency = publisher;
        this.name = name;
        this.maxSalary = maxSalary;
        this.rnd = new Random();
    }

    public void needEmployee() {
        int salary = rnd.nextInt(maxSalary);
        jobAgency.sendOffer(name, salary);
    }
}
