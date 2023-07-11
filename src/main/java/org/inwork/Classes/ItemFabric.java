package org.inwork.Classes;

public abstract class ItemFabric {
    public void openReward(){
        iGameItem gameItem = createItem();
        gameItem.open();
    }
    public abstract GoldReward createItem();
}
