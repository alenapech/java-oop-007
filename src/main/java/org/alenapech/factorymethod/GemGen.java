package org.alenapech.factorymethod;

public class GemGen implements ItemGen{
    @Override
    public GameItem createItem() {
        return new GemReward();
    }
}
