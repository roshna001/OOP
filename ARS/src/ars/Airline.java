package ars;

/**
 *
 * @author roshn
 */
public class Airline {
    private String airlineID;   //two-lettered ID
    private String airlineName;    //name of the airline
    
    public Airline() {
    
}
    public Airline(String airlineID, String name) {
        this.setAirlineID(airlineID);
        this.setAirlineName(name);
        
    }

    public void setAirlineID(String airlineID) {
       if(airlineID.matches("[a-zA-Z]+$") && airlineID.length()== 2){
           this.airlineID = airlineID.toUpperCase();
       }
       else{
           System.out.println("Invalid Airline ID !"); 
       }
       
    }

    public void setAirlineName(String airlineName) {
        
        if (airlineName.matches("[a-zA-Z ]+$")) {
            this.airlineName = airlineName;
        }
        else{
            System.out.println("Invalid Airline Name");
        
    }       
}

    public String getAirlineID() {
        return airlineID; // returns airile ID
    }

    public String getAirlineName() {
        return airlineName; //returns airline name
    }
     public String toString() {
        return this.getAirlineID() + "," + this.getAirlineName();
    }
     
    
}
//End of the class

