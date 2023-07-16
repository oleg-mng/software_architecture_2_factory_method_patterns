package org.inwork.Classes;

public class CoinsGenerator extends ItemFabric {
    @Override
    public CoinsReward createItem() {
        return new CoinsReward();
    }

}


