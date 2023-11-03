package ua.edu.ucu.apps.lab71.flowers;

import org.springframework.data.jpa.repository.JpaRepository;

public interface FlowerRepository  extends JpaRepository<Flower, Long>{
    
    
}
