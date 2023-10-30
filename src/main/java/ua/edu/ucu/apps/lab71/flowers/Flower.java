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
public class Flower {
    @Id
    private Long id;
    private double sepalLength;
    private double price;
    private FlowerColor color;
    
}
