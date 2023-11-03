package ua.edu.ucu.apps.lab71.order;

import lombok.AllArgsConstructor;
import lombok.Getter;
import ua.edu.ucu.apps.lab71.delivery.Delivery;
import ua.edu.ucu.apps.lab71.flowers.Item;
import ua.edu.ucu.apps.lab71.payment.Payment;

import java.util.List;

@AllArgsConstructor
public class Order {
    private List<Item> items;
    private Payment payment;
    private Delivery delivery;
    @Getter
    private double price;

    public void setPaymentStrategy(Payment paymentMethod) {
        this.payment = paymentMethod;
    }

    public void setDeliveryStrategy(Delivery deliveryMethod) {
        this.delivery = deliveryMethod;
    }

    void calculateTotalPrice() {
        double resultPrice = 0;

        for (Item item : items) {
            resultPrice += item.getPrice();
        }

        this.price = resultPrice;
    }

    void addItem(Item item) {
        items.add(item);
        calculateTotalPrice();
    }

    void removeItem(Item item) {
        items.remove(item);
        calculateTotalPrice();
    }

    void processOrder() {
        System.out.printf("You have ordered %d items\n", items.size());
        System.out.printf(
                "You have chosen %s payment strategy",
                payment.getClass().getSimpleName()
        );
        System.out.printf(
                "You have chosen %s delivery strategy",
                delivery.getClass().getSimpleName()
        );
        System.out.printf("Total price %f UAH", price);
    }
}