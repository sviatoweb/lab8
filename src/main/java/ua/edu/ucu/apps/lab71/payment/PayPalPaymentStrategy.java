package ua.edu.ucu.apps.lab71.payment;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

public class PayPalPaymentStrategy implements Payment{

    @Override
    public String pay(double price) {
        return "Paid " + price + " with paypal";
    }

    @Override
    public String getName() {
        return "PayPal";
    }

}