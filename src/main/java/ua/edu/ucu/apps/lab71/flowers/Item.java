package ua.edu.ucu.apps.lab71.flowers;

import lombok.Getter;

@Getter
public abstract class Item {
    private String description;
    public abstract String getDescription();
    public abstract double getPrice();
}