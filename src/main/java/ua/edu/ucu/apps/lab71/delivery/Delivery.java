package ua.edu.ucu.apps.lab71.delivery;

import java.util.List;
import ua.edu.ucu.apps.lab71.flowers.Item;

public interface Delivery {
    String deliver(List<Item> items);
}

