package org.alenapech;

import org.alenapech.decorator.CheeseDecorator;
import org.alenapech.decorator.PeperoniDecorator;
import org.alenapech.decorator.Pizza;
import org.alenapech.decorator.PizzaDough;
import org.alenapech.factorymethod.GameItem;
import org.alenapech.factorymethod.GemGen;
import org.alenapech.factorymethod.GoldGen;
import org.alenapech.factorymethod.ItemGen;
import org.alenapech.observer.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
//        decoratorTest();
//        factoryMethodTest();
//        observerTest();
;    }

    private static void observerTest() {
        Publisher jobAgency = new JobAgency();
        Company google = new Company("GOOGLE", 500, jobAgency);
        Company geekBrains = new Company("GB", 50, jobAgency);
        Student petrov = new Student("Petrov");
        Master ivanov = new Master("Ivanov");
        Junior sidorov = new Junior("Sidorov");
        jobAgency.registerObserver(petrov);
        jobAgency.registerObserver(ivanov);
        jobAgency.registerObserver(sidorov);

        for (int i = 0; i < 100; i++) {
            google.needEmployee();
            geekBrains.needEmployee();
        }

    }

    private static void factoryMethodTest() {
        List<ItemGen> itemGens = new ArrayList<>();
        itemGens.add(new GoldGen());
        itemGens.add(new GoldGen());
        itemGens.add(new GemGen());
        Random rnd = new Random();
        for (int i = 0; i < 10; i++) {
            int rndInt = rnd.nextInt(itemGens.size());
            GameItem gameItem = itemGens.get(rndInt).createItem();
            gameItem.open();
        }
    }

    private static void decoratorTest() {
        Pizza pizza = new PeperoniDecorator(new CheeseDecorator(new PizzaDough()));
        printPizza(pizza);
    }

    private static void printPizza(Pizza pizza) {
        System.out.println(pizza.getDescription() + "; " + pizza.getCost());
    }
}