package ie.atu.demo;

public class Ticket {
    private String eventName;
    private String holderName;
    private double basePrice;

    public Ticket(String holderName, String eventName, double basePrice) {
        this.holderName = holderName;
        this.eventName = eventName;
        this.basePrice = basePrice;
    }

    public String getEventName() {
        return eventName;
    }

    public String getHolderName() {
        return holderName;
    }

    public double getBasePrice() {
        return basePrice;
    }
    public double calculatePrice() {
        return basePrice;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "eventName='" + eventName + '\'' +
                ", holderName='" + holderName + '\'' +
                ", basePrice=" + basePrice +
                '}';
    }
}
