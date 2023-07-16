package org.inwork;

import org.inwork.Classes.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {

        Random random = ThreadLocalRandom.current();
        List<ItemFabric> fabricList = new ArrayList<>();

        fabricList.add(new GoldGenerator());
        fabricList.add(new GemGenerator());
        fabricList.add(new SpellGenerator());
        fabricList.add(new CoinsGenerator());
        fabricList.add(new MagicScrollGenerator());

        for (int i = 0; i < 10; i++) {
            int index = (int) Math.round(Math.random() * (fabricList.size() - 1));
//            int index = Math.abs(random.nextInt() % 2 == 0 ? 0 : 1);
            ItemFabric fabric = fabricList.get(index);
            fabric.openReward();
        }
    }
}