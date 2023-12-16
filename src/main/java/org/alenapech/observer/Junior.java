package org.alenapech.observer;

import java.util.Random;

public class Junior implements Observer {

    private String name;

    public Junior(String name) {
        this.name = name;
    }

    @Override
    public void receiveOffer(String newCompany, int salary) {
        if (new Random().nextBoolean()) {
            System.out.println(String.format("Junior %s: I accept this offer! (company, salary) = %s, %d%n", name, newCompany, salary));
        } else {
            System.out.println(String.format("Junior %s: Ok. I don't accept the offer! (company, salary) = %s, %d%n", name, newCompany, salary));
        }
    }
}
