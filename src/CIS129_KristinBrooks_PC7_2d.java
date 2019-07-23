/***********************************************************************************
 * Kristin Brooks
 * CIS129
 * Module 7: Pseudocode 7.2
 *
 * This program uses the new superclass CIS129_KristinBrooks_PC7_2a,
 * subclass CIS129_KristinBrooks_PC7_2b, and subclass CIS129_KristinBrooks_PC7_2c
 * to create three new instances of the classes, one each. They will contain data
 * about one general house, one rental house, and one owned house.
 **********************************************************************************/

public class CIS129_KristinBrooks_PC7_2d {

    public static void main(String[] args) {
        // create instances of the new classes
        CIS129_KristinBrooks_PC7_2a house = new CIS129_KristinBrooks_PC7_2a();
        CIS129_KristinBrooks_PC7_2b rentalHouse = new CIS129_KristinBrooks_PC7_2b();
        CIS129_KristinBrooks_PC7_2c ownedHouse = new CIS129_KristinBrooks_PC7_2c();

        // set house details
        house.setNumRooms(5);
        house.setNumBathrooms(2);
        house.setOccupied(true);
        house.setAddress("1931 N Tucker Drive", "Tucson", "AZ", "85716");

        // print house details
        System.out.println("The house is located at " + house.getAddress() + ". It has " + house.getNumRooms()
                + " rooms and " + house.getNumBathrooms() + " bathrooms.");
        if (house.isOccupied()) {
                System.out.println("This house is currently occupied.");
        } else {
            System.out.println("This house is not currently occupied.");
        }

        System.out.println();
        System.out.println();

        // set rental house details
        rentalHouse.setNumRooms(3);
        rentalHouse.setNumBathrooms(1);
        rentalHouse.setAddress("1234 N. 5th Street", "Tucson", "AZ", "85712");
        rentalHouse.setCurrentlyRented(false);
        rentalHouse.setRent(900);

        // print rental house details
        System.out.println("The rental house is located at " + rentalHouse.getAddress() + ". It has " +
                rentalHouse.getNumRooms() + " rooms and " + rentalHouse.getNumBathrooms() + " bathrooms.");
        System.out.println("The rent is $" + rentalHouse.getRent() + " dollars a month.");
        if (rentalHouse.isRented()) {
            System.out.println("This house is currently rented out.");
        } else {
            System.out.println("This house is not currently available for rent.");
        }

        System.out.println();
        System.out.println();

        // set owned house details
        ownedHouse.setNumRooms(8);
        ownedHouse.setNumBathrooms(4);
        ownedHouse.setAddress("9876 S. 5th Street", "Tucson", "AZ", "85714");
        ownedHouse.setMortgage(460000);
        ownedHouse.setInsurance(2300);

        // print owned house details
        System.out.println("The owned house is located at " + ownedHouse.getAddress() + ". " + "It has " +
                ownedHouse.getNumRooms() + " rooms and " + ownedHouse.getNumBathrooms() + " bathrooms.");
        System.out.println("The insurance on the house is $" + ownedHouse.getInsurance() + " dollars a year.");
        if (ownedHouse.paidInFull(ownedHouse.getMortgage())) {
            System.out.println("This house is paid in full.");
        } else {
            System.out.println("This house is not paid off. Its remaining mortgage is $" +
                    ownedHouse.getMortgage() + ".");
        }

    }

}