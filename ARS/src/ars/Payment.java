package ars;

/**
 *
 * @author roshn
 */
public class Payment extends TicketBooking {

    //Payment amount
    private double amount;

    public Payment(double amount, String ticketNumber, String departureDate, String departureAirport, String destinationAirport, String departureTime, String arrivalTime, double price, int passengerID, String name, String address, String telephoneNumber, int age, Countries countries,SeatClass seatClass) {
        super(ticketNumber, departureDate, departureAirport, destinationAirport, departureTime, arrivalTime, price, passengerID, name, address, telephoneNumber, age, countries,seatClass);
        this.amount = amount;
    }

    //Constructor to initialize amount to 0
    /* public Payment()
    {
        amount = 0.0;
    }
    
    /**
    * Constructor to initialize payment amount
    /*
    public Payment(double paymentAmount)
    {
        amount = paymentAmount;
    } 
     */
    /**
     * Sets the payment amount
     */
    public void setPayment(double paymentAmount) {
        amount = paymentAmount;
    }

    /**
     * Returns the payment amount
     */
    public double getPayment() {
        return amount;
    }

    /**
     * Prints a description of the payment
     */
    public void paymentDetails() {
        System.out.println("The payment amount is " + amount);
    }

    @Override
    public String toString() {
        return "Payment{" + "amount=" + amount + '}';
    }

}
