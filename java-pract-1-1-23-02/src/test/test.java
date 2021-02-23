package test;

import main.Contact;
/**
 *
 * @author 38099
 */
public static void main(String[] args) {

        Contact Boris = new Contact("Boris", "Ivanov", "Krasina 15");
        Boris.Id = 1;
        String BorisfirstName = Boris.getfirstName();
        String BorislastName = Boris.getlastName();
        String Borisaddress = Boris.getaddress();

        System.out.println("ID: " + BorisfirstName);
        System.out.println("First name: " + BorisfirstName);
        System.out.println("Last name: " + BorislastName);
        System.out.println("Address: " + Borisaddress);

}
