package ie.atu.demo;

public class VIPTicket extends Ticket {
    public VIPTicket(String holderName, String eventName, double basePrice) {
        super(holderName, eventName, basePrice);
    }

    @Override
    public double calculatePrice() {
        return super.calculatePrice() + 25;

    }
    public String getBenefits(){
        String benefits = "Priority entry and reserved seating";

        return benefits;


    }
}
