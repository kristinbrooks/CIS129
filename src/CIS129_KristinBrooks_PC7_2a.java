/***************************************************************
 * Kristin Brooks
 * CIS129
 * Module 7: Pseudocode 7.2
 *
 * This file is the class definition for the House superclass.
 **************************************************************/

public class CIS129_KristinBrooks_PC7_2a {
    // attributes
    private int numRooms;
    private int numBathrooms;
    private boolean occupied;
    private String address;

    //constructors
    public CIS129_KristinBrooks_PC7_2a(int numRooms, int numBathrooms, boolean occupied, String streetAddress,
                                       String city, String state, String zip) {
        this.numRooms = numRooms;
        this.numBathrooms = numBathrooms;
        this.occupied = occupied;
        address = streetAddress + ", " + city + ", " + state + " " + zip;
    }

    public CIS129_KristinBrooks_PC7_2a() { }

    // mutator methods
    public void setNumRooms(int numRooms) {this.numRooms = numRooms;}

    public void setNumBathrooms(int numBathrooms) {this.numBathrooms = numBathrooms;}

    public void setOccupied(boolean occupied) {this.occupied = occupied;}

    public void setAddress(String streetAddress, String city, String state, String zip) {
        address = streetAddress + ", " + city + ", " + state + " " + zip;
    }

    // accessor methods
    public int getNumRooms() {return numRooms;}

    public int getNumBathrooms() {return numBathrooms;}

    public boolean isOccupied() {return occupied;}

    public String getAddress() {return address;}

}