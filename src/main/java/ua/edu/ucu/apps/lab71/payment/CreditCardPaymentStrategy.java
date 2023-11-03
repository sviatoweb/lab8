package ua.edu.ucu.apps.lab71.payment;




public class CreditCardPaymentStrategy implements Payment{

    @Override
    public String pay(double price) {
        return "Paid " + price + " with credit card";
    }

    @Override
    public String getName() {
        return "CreditCard";
    }

}