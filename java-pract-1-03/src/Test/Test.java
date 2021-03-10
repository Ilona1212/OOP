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
        
        System.out.println( "FIRST STUDENT's credentials: ID, First Name, Last Name: " );
        Students student = new Students(Integer.parseInt( scanner.nextLine() ), scanner.nextLine(), scanner.nextLine());
        ArrayList<Students> StudentsList = new ArrayList<Students>();
        StudentsList.add(0, student);
        System.out.println(student);
        System.out.println( "FIRST STUDENT IS DONE!" );
         
        System.out.println( "Enter FIRST contact Adress" );
        Contact contact = new Contact( student, scanner.nextLine() );
        ArrayList<Contact> ContactList = new ArrayList<Contact>();
        ContactList.add(0, contact);
        System.out.println( "FIRST Contact IS DONE!" );
        
        System.out.println( "Enter FIRST Order Courier and DateTime: " );
        Order order = new Order( contact, scanner.nextLine(), scanner.nextLine() );
        ArrayList<Order> OrderList = new ArrayList<Order>();
        OrderList.add(0, order);
        System.out.println( "FIRST Order IS DONE!" );
        
        Delivery delivery = new Delivery ( order, 1 );
        
        System.out.println( "###########################################" );
        System.out.println("ID of FIRST DELIVERY: " + delivery.getIdDelivery());
        System.out.println(StudentsList.get(0));
        System.out.println(ContactList.get(0));
        System.out.println(OrderList.get(0));
        System.out.println( "###########################################" );
        
        
        System.out.println( "SECOND STUDENT's credentials: ID, First Name, Last Name: " );
        Students student2 = new Students(Integer.parseInt( scanner.nextLine() ), scanner.nextLine(), scanner.nextLine());
        StudentsList.add(1, student2);
        System.out.println(student2);
        System.out.println( "SECOND STUDENT IS DONE!" );
         
        System.out.println( "Enter SECOND contact Adress" );
        Contact contact2 = new Contact( student, scanner.nextLine() );
        ContactList.add(1, contact2);
        System.out.println( "SECOND Contact IS DONE!" );
        
        System.out.println( "Enter SECOND Order Courier and DateTime: " );
        Order order2 = new Order( contact, scanner.nextLine(), scanner.nextLine() );
        OrderList.add(1, order2);
        System.out.println( "SECOND Order IS DONE!" );
        
        Delivery delivery2 = new Delivery ( order2, 2 );
        
        System.out.println( "###########################################" );
        System.out.println("ID of SECOND DELIVERY: " + delivery2.getIdDelivery());
        System.out.println(StudentsList.get(1));
        System.out.println(ContactList.get(1));
        System.out.println(OrderList.get(1));
        System.out.println( "###########################################" );
        
        OrderList.sort( Comparator.comparing( Order::getCourier).reversed() );
       
        for (int i = 0; i < OrderList.size(); i++) {
             System.out.println( OrderList.get(i) );
             System.out.println( "##########" );
        }
    }
}
