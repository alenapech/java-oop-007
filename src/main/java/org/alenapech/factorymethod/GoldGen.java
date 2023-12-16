package org.alenapech.factorymethod;

public class GoldGen implements ItemGen {
    @Override
    public GameItem createItem() {
        return new GoldReward();
    }
}
