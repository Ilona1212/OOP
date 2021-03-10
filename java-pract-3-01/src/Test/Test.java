package Test;

import java.util.*;
import java.io.IOException;
import java.io.*;
import Main.Students;
import Main.Contact;
import Main.Order;
import Main.Delivery;

public class Test {
    
    static Scanner scanner = new Scanner (System.in);
    
    public static void menuPrint() {
        System.out.println("МЕНЮ");
        System.out.println("1 - Заполнить анкету данными и записать в файл;");
        System.out.println("2 - Вывести введенные данные на экран;");
        System.out.println("3 - Вывести данные из файла на экран; Введите имя файла: ");
        System.out.println("4 - Прекратить работу;");
        System.out.println("Введите цифру чтобы выполнить команду:");
    }
 
    public static void menuChoice(int numMenu) {
        switch (numMenu) {
            case 1: Input(); SetInFile(); break;
            case 2: Output(); break;
            case 3: GetFromFile( scanner.nextLine() ); break;
            case 4: System.exit(0); break;
            default: System.out.println("Такой пункт отсутствует!");
        }
    }
     static Students student = new Students();
     static Contact contact = new Contact();
     static Order order = new Order();
     static Delivery delivery = new Delivery();
     
     static ArrayList<Students> StudentsList = new ArrayList<Students>();
     static ArrayList<Contact> ContactList = new ArrayList<Contact>();
     static ArrayList<Order> OrderList = new ArrayList<Order>();
     
    public static void Input(){
        
        System.out.println( "Введите данные студента: ID, имя и фамилию: " );
        student = new Students( Integer.parseInt( scanner.nextLine() ), scanner.nextLine(), scanner.nextLine());
        
        StudentsList.add(0, student);
        System.out.println(student);
        System.out.println( "Данные о студенте записаны!" );
         
        System.out.println( "Введите адресс:" );
        contact = new Contact( student, scanner.nextLine() );
        
        ContactList.add(0, contact);
        System.out.println( "Данные об адрессе записаны!" );
        
        System.out.println( "Введите имя курьера и дату/время доставки: " );
        order = new Order( contact, scanner.nextLine(), scanner.nextLine() );
        
        OrderList.add(0, order);
        System.out.println( "Данные о курьере и дате/времени записаны!" );
        
        delivery = new Delivery ( order, 1 );  

        }
    
    public static void Output(){
        for (int i = 0; i < OrderList.size(); i++) {
            System.out.println( "###########################################" );
            System.out.println(StudentsList.get(i));
            System.out.println(ContactList.get(i));
            System.out.println(OrderList.get(i));
            System.out.println( "###########################################" ); 
        }
    }
    
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        menuPrint();
        while (userInput.hasNext()){
            menuChoice(userInput.nextInt());
        }
        SetInFile();
    }
    
    public static void SetInFile() {
    try (FileWriter writer = new FileWriter("output.txt")){
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
    
    public static void GetFromFile( String _pathToFile )
    {
        try {
            File myObj = new File(_pathToFile);
            Scanner myReader = new Scanner(myObj);
            System.out.println("Reading from file!");
            while (myReader.hasNextLine()) {
                System.out.println("Student's ID: " + Integer.parseInt( myReader.nextLine() ) );
                System.out.println("Student's First Name: " + myReader.nextLine() );
                System.out.println("Student's Last Name: " + myReader.nextLine() );
                System.out.println("Address: " + myReader.nextLine() );
                System.out.println("Curier's name: " + myReader.nextLine() );
                System.out.println("Date: " + myReader.nextLine() );
            }
        myReader.close();
    } catch (FileNotFoundException e) {
        System.out.println("An error occurred.");
        e.printStackTrace();
    }
    }
    
}


