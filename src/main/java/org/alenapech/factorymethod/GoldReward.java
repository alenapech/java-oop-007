package org.alenapech.factorymethod;

public class GoldReward implements GameItem {
    @Override
    public void open() {
        System.out.println("Gold Reward is opened");
    }
}
