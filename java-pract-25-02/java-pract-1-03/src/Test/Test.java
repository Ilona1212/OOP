package Test;

import java.util.*;
import java.io.IOException;
import java.io.*;
import Main.Students;
import Main.Contact;
import Main.Order;
import Main.Delivery;

public class Test {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        
        System.out.println( "STUDENT's credentials: ID, First Name, Last Name: " );
        Students student = new Students(Integer.parseInt( scanner.nextLine() ), scanner.nextLine(), scanner.nextLine());
        ArrayList<Students> StudentsList = new ArrayList<Students>();
        StudentsList.add(0, student);
        System.out.println(student);
        System.out.println( "STUDENT IS DONE!" );
         
        System.out.println( "Enter contact Adress" );
        Contact contact = new Contact( student, scanner.nextLine() );
        ArrayList<Contact> ContactList = new ArrayList<Contact>();
        ContactList.add(0, contact);
        System.out.println( "Contact IS DONE!" );
        
        System.out.println( "Enter Order Courier and DateTime: " );
        Order order = new Order( contact, scanner.nextLine(), scanner.nextLine() );
        ArrayList<Order> OrderList = new ArrayList<Order>();
        OrderList.add(0, order);
        System.out.println( "Order IS DONE!" );
        
        Delivery delivery = new Delivery ( order, 1 );
        
        System.out.println( "###########################################" );
        System.out.println("ID of DELIVERY: " + delivery.getIdDelivery());
        System.out.println(StudentsList.get(0));
        System.out.println(ContactList.get(0));
        System.out.println(OrderList.get(0));
        System.out.println( "###########################################" );
        
        try (FileWriter writer = new FileWriter("test.txt")){
            writer.write( Integer.toString(delivery.getIdDelivery() ) );
            writer.append("\n");
            writer.write(contact.getAddress());
            writer.append("\n");
            writer.write( Integer.toString(student.getId() ) );
            writer.append("\n");
            writer.write(student.getFirstName());
            writer.append("\n");
            writer.write(student.getLastName());
            writer.append("\n");
            writer.write(order.getCourier());
            writer.append("\n");
            writer.write(order.getDateTime());
            writer.append("\n");
}
        catch (IOException ex){
        System.out.println("Error" + ex);
}
    }
}
