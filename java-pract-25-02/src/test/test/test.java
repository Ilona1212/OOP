package test.test;

import java.util.Scanner;
import java.io.IOException;
import java.io.*;
import Main.Students;
import Main.Contact;
import Main.Order;
import Main.Delivery;

public class test {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        
        Students student = new Students();
        
        System.out.println( "STUDENT's credentials: ID, First Name, Last Name: " );
        student.setStudId( Integer.parseInt( scanner.nextLine() ) );
        student.setFirstName( scanner.nextLine() );
        student.setLastName( scanner.nextLine() );
        System.out.println( "STUDENT IS DONE!" );
        
        Contact contact = new Contact( student );
        System.out.println( "Enter contact Adress" );
        contact.setAddress( scanner.nextLine() );
        System.out.println( "Contact IS DONE!" );
        
        Order order = new Order( contact );
        System.out.println( "Enter Order Courier and DateTime: " );
        order.setCourier( scanner.nextLine() );
        order.setDateTime( scanner.nextLine() );
        System.out.println( "Order IS DONE!" );
        
        Delivery delivery = new Delivery ( order, 1 );
        
        System.out.println( "###########################################" );
        System.out.println("ID of DELIVERY: " + delivery.getIdDelivery());
        System.out.println("Address: " + delivery.getAddress());
        System.out.println("ID of STUDENT " + delivery.getId());
        System.out.println("First Name: " + delivery.getFirstName());
        System.out.println("Last Name: " + delivery.getLastName());
        System.out.println("Date Time: " + delivery.getDateTime());
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
