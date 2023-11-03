package ua.edu.ucu.apps.lab71;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import ua.edu.ucu.apps.lab71.flowers.*;
import ua.edu.ucu.apps.lab71.delivery.*;
import ua.edu.ucu.apps.lab71.payment.*;
import ua.edu.ucu.apps.lab71.order.Order;
import java.util.ArrayList;
import java.util.List;



@SpringBootTest
class Lab71ApplicationTests {

	@Test
	void TestFlowerStore() {
        FlowerBucket flowerbucket = new FlowerBucket();

        Delivery dhldelivery = new DHLDeliveryStrategy();
        Delivery postdelivery = new PostDeliveryStrategy();

        
        List<Item> buckets = new ArrayList<Item>();
        buckets.add(flowerbucket);
        assertEquals(dhldelivery.deliver(buckets), "DHL delivery of 1 items");
        assertEquals(postdelivery.deliver(buckets), "Post delivering of 1 items");


        Payment creditcard = new CreditCardPaymentStrategy();
        Payment paypal = new PayPalPaymentStrategy();

        assertEquals(creditcard.pay(40), "Paid 40.0 with credit card");
        assertEquals(paypal.pay(40), "Paid 40.0 with paypal");


        Order order = new Order(buckets);
        order.setDeliveryStrategy(dhldelivery);
        order.setPaymentStrategy(new CreditCardPaymentStrategy());

        assertEquals(order.processOrder(), "Paid with CreditCard using DHL delivery of 1 items");


    
	}

    


}
