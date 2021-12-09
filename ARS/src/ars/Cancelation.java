package ars;

/**
 *
 * @author roshn
 */
public class Cancelation extends TicketBooking {

    private String cancelationNumber;

    public Cancelation(String cancelationNumber, String ticketNumber, String departureDate, String departureAirport, String destinationAirport, String departureTime, String arrivalTime, double price, int passengerID, String name, String address, String telephoneNumber, int age, Countries countries,SeatClass seatClass) {
        super(ticketNumber, departureDate, departureAirport, destinationAirport, departureTime, arrivalTime, price, passengerID, name, address, telephoneNumber, age, countries,seatClass);
        this.cancelationNumber = cancelationNumber;
    }

    public void setCancelationNumber(String cancelationNumber) {

        this.cancelationNumber = cancelationNumber;
    }

    public String getCancelationNumber() {
        return cancelationNumber;
    }

    @Override
    public String toString() {
        return "Cancelation{" + "cancelationNumber=" + cancelationNumber +"ticketNumber=" + getTicketNumber() +"\n "
                + " departureDate=" + getDepartureDate() + "\n " +" departureAirport=" + getDepartureAirport() +
                "\n " + " destinationAirport=" + getDestinationAirport() + "\n " +" departureTime=" + getDepartureTime() +
                "\n " + " arrivalTime=" + getArrivalTime() + "\n " +" price=" + getPrice() +  '}';
    }

}
