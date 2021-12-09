package ars;

/**
 *
 * @author roshn
 */
public class Seat extends TicketBooking {

    private String seatID; // row number + column character
    private boolean status; // shows whether a seat is booked or not, true is booked
    SeatClass seat;

    public Seat(String seatID, boolean status, SeatClass seat, String ticketNumber, String departureDate, String departureAirport, String destinationAirport, String departureTime, String arrivalTime, double price, int passengerID, String name, String address, String telephoneNumber, int age, Countries countries,SeatClass seatClass) {
        super(ticketNumber, departureDate, departureAirport, destinationAirport, departureTime, arrivalTime, price, passengerID, name, address, telephoneNumber, age, countries,seatClass);
        this.seatID = seatID;
        this.status = status;
        this.seat = seat;

    }

    /* public Seat(String seatID, boolean status){
       
        this.seatID = seatID;
        this.status = status;
        
    } */
    public void setSeatID(String seatID) {
        if (seatID.matches("[a-zA-Z0-9]+$") && seatID.length() == 3) {
            this.seatID = seatID.toUpperCase();
        } else {
            System.out.println("Invalid seat ID!");
        }
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getSeatID() {
        return seatID;
    }

    public boolean isStatus(boolean status) {
        if (status == false) {
            this.status = status;
        } else {
            System.out.println("This seat is booked");
        }
        return status;

    }

    @Override
    public String toString() {
        return "Seat{" + "seatID=" + seatID + ", status=" + status + '}';
    }

}
