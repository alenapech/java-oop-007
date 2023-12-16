package org.alenapech.observer;

public class Master implements Observer {

    private String name;

    public Master(String name) {
        this.name = name;
    }

    @Override
    public void receiveOffer(String newCompany, int salary) {
        if (salary < 80) {
            System.out.println(String.format("Master %s: I'm waiting for the better job! (company, salary) = %s, %d%n", name, newCompany, salary));
        } else {
            System.out.println(String.format("Master %s: Ok. I'm ready for this job! (company, salary) = %s, %d%n", name, newCompany, salary));
        }
    }
}
