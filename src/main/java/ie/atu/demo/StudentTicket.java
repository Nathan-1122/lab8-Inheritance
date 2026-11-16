package ie.atu.demo;

public class StudentTicket extends Ticket{

    private int studentID;

    public StudentTicket(String holderName, String eventName, double basePrice, int studentID) {
        super(holderName, eventName, basePrice);
        this.studentID = studentID;
    }

    public int getStudentID() {
        return studentID;
    }

    @Override
    public double calculatePrice() {
        return super.calculatePrice() - 0.2 * super.calculatePrice();
    }
}
