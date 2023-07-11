package org.inwork;

import org.inwork.Classes.GemGenerator;
import org.inwork.Classes.GoldGenerator;
import org.inwork.Classes.GoldReward;
import org.inwork.Classes.ItemFabric;

public class Main {
    public static void main(String[] args) {
        ItemFabric generator = new GoldGenerator();
        generator.openReward();
        ItemFabric generator1 = new GemGenerator();
        generator1.openReward();


    }
}