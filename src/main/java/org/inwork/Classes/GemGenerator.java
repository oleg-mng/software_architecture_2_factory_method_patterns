package org.inwork.Classes;

public class GemGenerator extends ItemFabric {
    @Override
    public GemReward createItem() {
        return new GemReward();
    }

}


