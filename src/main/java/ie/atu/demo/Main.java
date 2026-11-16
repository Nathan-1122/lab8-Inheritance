package ie.atu.demo;

public class Main {
    public static void main(String[] args) {
        Ticket firstTicket = new Ticket("Alice","Summer Concert",50);
        StudentTicket secondTicket = new StudentTicket("Bob","Summer Concert", 50,1234);
        VIPTicket thirdTicket =  new VIPTicket("Charlie","Summer Concert",50);

        System.out.println("Event: "+ firstTicket.getEventName() + "- " + firstTicket.getHolderName() + "  €" + firstTicket.getBasePrice());
        System.out.println("Event: "+ secondTicket.getEventName() + "- " + secondTicket.getHolderName() + "  €" + secondTicket.calculatePrice());
        System.out.println("Event: "+ thirdTicket.getEventName() + "- " + thirdTicket.getHolderName() + "  €" + thirdTicket.calculatePrice());
        System.out.println("Student ID: " + secondTicket.getStudentID());
        System.out.println("Benefits: " + thirdTicket.getBenefits());

    }
}
