/******************************************************
 * Kristin Brooks
 * CIS129
 * Module 7: Pseudocode 7.1
 *
 * This file is the class definition for page 566,
 * number 3, Personal Information
 *****************************************************/

public class CIS129_KristinBrooks_PC7_1a {
    // field declarations
    private String name;
    private String address;
    private int age;
    private String phoneNumber;

    //constructor
    public CIS129_KristinBrooks_PC7_1a(String name, String streetAddress, String city, String state, String zip,
                                       int age, String phoneNumber) {
        this.name = name;
        address = streetAddress + "\n" + city + ", " + state + " " + zip;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }

    public CIS129_KristinBrooks_PC7_1a() { }

    // mutator methods
    public void setName(String name) {this.name = name;}

    public void setAddress(String streetAddress, String city, String state, String zip) {
        address = streetAddress + "\n" + city + ", " + state + " " + zip;
    }

    public void setAge(int age) {this.age = age;}

    public void setPhoneNumber(String phoneNumber) {this.phoneNumber = phoneNumber;}

    // accessor methods
    public String getName() {return name;}

    public String getAddress() {return address;}

    public int getAge() {return age;}

    public String getPhoneNumber() {return phoneNumber;}

}