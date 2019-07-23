/*************************************************************************
 * Kristin Brooks
 * CIS129
 * Module 7: Pseudocode 7.2
 *
 * This file is the class definition for the Owned House subclass.
 *************************************************************************/

public class CIS129_KristinBrooks_PC7_2c extends CIS129_KristinBrooks_PC7_2a {
    // attributes
    private int mortgage;
    private int insurance;

    // constructors
    public CIS129_KristinBrooks_PC7_2c() {}

    public CIS129_KristinBrooks_PC7_2c(int mortgage, int insurance) {
        this.mortgage = mortgage;
        this.insurance = insurance;
    }

    // mutator methods
    public void setMortgage(int mortgage) {this.mortgage = mortgage;}

    public void setInsurance(int insurance) {this.insurance = insurance;}

    // accessor methods
    public int getMortgage() {return mortgage;}

    public int getInsurance() {return insurance;}

    public boolean paidInFull(int mortgage) {
        if (mortgage == 0) {
            return true;
        } else {
            return false;
        }
    }

}


