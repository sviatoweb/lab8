package ua.edu.ucu.apps.lab71.flowers;

import java.util.ArrayList;

public class FlowerBucket extends Item {
    private ArrayList<FlowerPack> packs = new ArrayList<FlowerPack>();

    public void add(FlowerPack pack) {
        packs.add(pack);
    }

    public double getPrice() {
        double price = 0.0;

        for (int i = 0; i < packs.size(); i++) {
            price += packs.get(i).getPrice();
        }

        return price;
    }

    public ArrayList<FlowerPack> getFlowers() {
        return packs;
    }

    @Override
    public String getDescription() {
        return "Flower bucket";
    }
}
