package ua.edu.ucu.apps.lab71.flowers;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class FlowerPack{
    private Flower flower;
    private int quantity;

    public double getPrice() {
        return quantity*flower.getPrice();
    }

}
