/*************************************************************************
 * Kristin Brooks
 * CIS129
 * Module 7: Pseudocode 7.2
 *
 * This file is the class definition for the Rental House subclass.
 *************************************************************************/

public class CIS129_KristinBrooks_PC7_2b extends CIS129_KristinBrooks_PC7_2a {
    // attributes
    private int rent;
    private boolean currentlyRented;

    // constructors
    public CIS129_KristinBrooks_PC7_2b() {}

    public CIS129_KristinBrooks_PC7_2b(int rent, boolean currentlyRented) {
        this.rent = rent;
        this.currentlyRented = currentlyRented;
    }

    // mutator methods

    public void setRent(int rent) {this.rent = rent;}

    public void setCurrentlyRented(boolean currentlyRented) {this.currentlyRented = currentlyRented;}

    // accessor methods


    public int getRent() {return rent;}

    public boolean isRented() {return currentlyRented;}

}


