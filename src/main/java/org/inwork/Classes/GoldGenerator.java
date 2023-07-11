package org.inwork.Classes;

public class GoldGenerator extends ItemFabric{
    @Override
    public GoldReward createItem() {
        return new GoldReward();
    }
}
