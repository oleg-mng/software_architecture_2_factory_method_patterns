package org.inwork.Classes;

public class SpellGenerator extends ItemFabric {
    @Override
    public SpellReward createItem() {
        return new SpellReward();
    }

}


