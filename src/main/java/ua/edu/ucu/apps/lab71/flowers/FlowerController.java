package ua.edu.ucu.apps.lab71.flowers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/flowers/")
public class FlowerController {
    public final FlowerService flowerService;
    
    @Autowired
    public FlowerController(FlowerService flowerService) {
        this.flowerService = flowerService;
    }

    @GetMapping("list")
    public List<Flower> getFlowers() {
        return flowerService.getFlowers();
    }

    @PostMapping("add")
    public void addFlower(@RequestBody Flower flower) {
        flowerService.addFlower(flower);
    }
}
