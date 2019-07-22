/*****************************************************************
 * Kristin Brooks
 * CIS129
 * Module 7: Pseudocode 7.1
 *
 * This program uses the new class, CIS129_KristinBrooks_PC7_1a,
 * to create three new instances of the class. One hold the
 * author's information and the other two hold information of
 * their friends or family members.
 ****************************************************************/

public class CIS129_KristinBrooks_PC7_1b {

    public static void main(String[] args) {
        // create instances of the new class
        // one is declared with its data, the other two are given data below with 'set' functions
        CIS129_KristinBrooks_PC7_1a kristin = new CIS129_KristinBrooks_PC7_1a("Kristin Brooks",
                "1931 N Tucker Drive,", "Tucson", "AZ", "85916", 37,
                "5039614774");
        CIS129_KristinBrooks_PC7_1a chad = new CIS129_KristinBrooks_PC7_1a();
        CIS129_KristinBrooks_PC7_1a kt = new CIS129_KristinBrooks_PC7_1a();

        // setting Chad's info
        chad.setName("Chad Woolley");
        chad.setAddress("1234 East 1st Street", "Tucson", "AZ", "12345");
        chad.setAge(47);
        chad.setPhoneNumber("5201234567");

        // setting KT's info
        kt.setName("Katie Wylie");
        kt.setAddress("456 West 1st Street", "Louisville", "KY", "54321");
        kt.setAge(37);
        kt.setPhoneNumber("5021234567");

        // printing out everyone's info using the 'get' functions
        // this will verify the class is working as designed
        System.out.println(kristin.getName() + "\n" + kristin.getAddress() + "\n" +
                kristin.getAge() + "\n" + kristin.getPhoneNumber());
        System.out.println();
        System.out.println();
        System.out.println(chad.getName() + "\n" + chad.getAddress() + "\n" +
                chad.getAge() + "\n" + chad.getPhoneNumber());
        System.out.println();
        System.out.println();
        System.out.println(kt.getName() + "\n" + kt.getAddress() + "\n" +
                kt.getAge() + "\n" + kt.getPhoneNumber());
    }

}


