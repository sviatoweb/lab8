package ua.edu.ucu.apps.lab71.delivery;
import ua.edu.ucu.apps.lab71.flowers.Item;

import java.util.List;

public class DHLDeliveryStrategy implements Delivery {
    @Override
    public String deliver(List<Item> items) {
        return "DHL delivery of " + items.size() + " items";
    }


    @Override
    public String getName() {
        return "DHL";
    }
}
