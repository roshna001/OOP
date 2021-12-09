package ars;

/**
 *
 * @author roshn
 */
public class FlightSearch extends TicketBooking {

    public FlightSearch(String ticketNumber, String departureDate, String departureAirport, String destinationAirport, String departureTime, String arrivalTime, double price, int passengerID, String name, String address, String telephoneNumber, int age, Countries countries,SeatClass seatClass) {
        super(ticketNumber, departureDate, departureAirport, destinationAirport, departureTime, arrivalTime, price, passengerID, name, address, telephoneNumber, age, countries,seatClass);
        
        
    }

    public void setCountries(Countries countries) {
        this.countries = countries;
    }

    public Countries getCountries() {
        return countries;
    }
    

    @Override
    public String toString() {
        return "FlightSearch{" + '}'  + "ticketNumber=" + getTicketNumber() +"\n "
                + " departureDate=" + getDepartureDate() + "\n " +" departureAirport=" + getDepartureAirport() +
                "\n " + " destinationAirport=" + getDestinationAirport() + "\n " +" departureTime=" + getDepartureTime() +
                "\n " + " arrivalTime=" + getArrivalTime() + "\n " +" price=" + getPrice() + '}';
    }
    
    
   

}
