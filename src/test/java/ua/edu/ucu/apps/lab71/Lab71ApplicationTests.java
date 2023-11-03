package ua.edu.ucu.apps.lab71;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import ua.edu.ucu.apps.lab71.flowers.*;
import ua.edu.ucu.apps.lab71.delivery.*;
import java.util.ArrayList;



@SpringBootTest
class Lab71ApplicationTests {

	@Test
	void TestFlowerStore() {
    Delivery dhldelivery = new DHLDeliveryStrategy();
    Flower flower = new Flower(5, 4.5, FlowerColor.RED);
    FlowerPack flowerpack = new FlowerPack(flower, 5);
    FlowerBucket flowerbucket = new FlowerBucket();
    flowerbucket.add(flowerpack);
    assertEquals(flowerbucket.getPrice(), 22.5);
    assertEquals(flowerbucket.getDescription(), "Flower bucket");
    assertEquals(flowerpack.getPrice(), 25);
    assertEquals(flower.getColor(), "red");
    assertEquals(flower.getPrice(), 5);
    
    ArrayList<Item> buckets = new ArrayList<Item>();
    buckets.add(flowerbucket);
    assertEquals(dhldelivery.deliver(buckets), "DHL delivery of 1 items");


    
	}

    


}
