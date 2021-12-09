package ars;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author roshn
 */
public class TicketBooking extends Passenger {

    private String ticketNumber;
    private String departureDate;
    private String departureAirport;
    private String destinationAirport;
    private String departureTime;
    private String arrivalTime;
    private double price;
    Countries countries;
    SeatClass seatClass;
    

    public TicketBooking(String ticketNumber, String departureDate, String departureAirport, String destinationAirport, String departureTime, String arrivalTime, double price, int passengerID, String name, String address, String telephoneNumber, int age, Countries countries,SeatClass seatClass) {
        super(passengerID, name, address, telephoneNumber, age);
        this.ticketNumber = ticketNumber;
        this.departureDate = departureDate;
        this.departureAirport = departureAirport;
        this.destinationAirport = destinationAirport;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.price = price;
        this.countries = countries;
        this.seatClass = seatClass;

    }

    public void setTicketNumber(String TicketNumber) {
        if (TicketNumber.matches("[0-9]+$") && TicketNumber.length() == 8) {
            this.ticketNumber = TicketNumber;
        } else {
            System.out.println("Invalid ticket number!");
        }
    }

    public void setDepartureDate(int day, int month, int year) {
        SimpleDateFormat sdf = new SimpleDateFormat("d MM yyyy"); // defines the date format needed
        Calendar calendar = new GregorianCalendar(year, month - 1, day);   //creates a date from Calendar class   
        this.departureDate = sdf.format(calendar.getTime()); // set the departure date
    }

    public void setDepartureAirport(String departureAirport) {
        if (departureAirport.matches("[a-zA-Z]+$")) {
            this.departureAirport = departureAirport.toUpperCase();
        } else {
            System.out.println("Invalid Airport ID");
        }
    }

    public void setDestinationAirport(String destinationAirport) {
        if (destinationAirport.matches("[a-zA-Z]+$")) {
            this.destinationAirport = destinationAirport.toUpperCase();
        } else {
            System.out.println("Invalid Airport ID");
        }

    }

    public void setDepartureTime(int hour, int minute) {
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm ");     //Defines the date format needed
        Calendar calendar = new GregorianCalendar(2021, 12, 5, hour, minute);   //creates a date from Calendar class
        this.departureTime = sdf.format(calendar.getTime());
    }

    public void setArrivalTime(int hour, int minute) {
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm ");     //Defines the date format needed
        Calendar calendar1 = new GregorianCalendar(2021, 12, 5, hour, minute);   //creates a date from Calendar class
        this.arrivalTime = sdf.format(calendar1.getTime());
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getTicketNumber() {
        return ticketNumber;
    }

    public String getDepartureDate() {
        return departureDate;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public String getDestinationAirport() {
        return destinationAirport;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "TicketBooking{" + "ticketNumber=" + ticketNumber + "\n " + "departureDate=" + departureDate + "\n "
                + " departureAirport=" + departureAirport + "\n " + " destinationAirport=" + destinationAirport + "\n "
                + "departureTime=" + departureTime + "\n " + " arrivalTime=" + arrivalTime + "\n " + " price=" + price
                + "\n " + " countries=" + countries + "\n " + getPassengerID() + "\n " + getName() + "\n " + getAddress() +
                "\n " + getTelephoneNumber() + "\n " + getAge() + '}';
    }

}
