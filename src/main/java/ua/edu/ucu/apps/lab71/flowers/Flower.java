package ua.edu.ucu.apps.lab71.flowers;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Getter
@Entity
@NoArgsConstructor
public class Flower extends Item {

    public Flower(double sepalLength, double price, FlowerColor color) {
        this.sepalLength = sepalLength;
        this.price = price;
        this.color = color;
    }
    
    @Id
    private Long id;
    private double sepalLength;
    private double price;
    private FlowerColor color;

    @Override
    public String getDescription() {
        return String.format("%s flower with %.1f cm long sepals, color: %s, price: %.2f",
                color.toString(), sepalLength, color.toString(), price);
    }

}
