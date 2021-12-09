package ars;

/**
 *
 * @author roshn
 */
public class Passenger {

    private int passengerID;
    private String name;
    private String address;
    private String telephoneNumber;
    private int age;

    public Passenger(int passengerID, String name, String address, String telephoneNumber, int age) {
        this.passengerID = passengerID;
        this.name = name;
        this.address = address;
        this.telephoneNumber = telephoneNumber;
        this.age = age;

    }

    public void setPassengerID(int passengerID) {
        this.passengerID = passengerID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public int getAge() {
        return age;
    }

    public int getPassengerID() {
        return passengerID;
    }

    //end of the class
    @Override
    public String toString() {
        return "Passenger{" + "passengerID=" + passengerID + ", name=" + name + ", address=" + address + ", telephoneNumber=" + telephoneNumber + ", age= " + age + '}';
    }

}
