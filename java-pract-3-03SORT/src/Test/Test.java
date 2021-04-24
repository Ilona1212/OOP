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
        System.out.println("4 - Отсортировать данные: ");
        System.out.println("5 - Прекратить работу;");
        System.out.println("Введите цифру чтобы выполнить команду:");
    }
   
    public static void printList( ArrayList<Order> _orderListToPrint )
    {
        for (int i = 0; i < _orderListToPrint.size(); i++) {
             System.out.println( _orderListToPrint.get(i) );
             System.out.println( "----------" );
        }
    }
    
    public static void printStudents( ArrayList<Students> _studentsListToPrint )
    {
        for (int i = 0; i < _studentsListToPrint.size(); i++) {
             System.out.println( _studentsListToPrint.get(i) );
             System.out.println( "----------" );
        }
    }
    
    public static void printContacts( ArrayList<Contact> _contactsListToPrint )
    {
        for (int i = 0; i < _contactsListToPrint.size(); i++) {
             System.out.println( _contactsListToPrint.get(i) );
             System.out.println( "----------" );
        }
    }
    
    public static void sortCollections( )
    {
        System.out.println("Выберите метод сортировки: ");
        System.out.println("1 - Вывод студентов по отсортированному ID");
        System.out.println("2 - Вывод по имени курьера");
        System.out.println("3 - Вывод студентов по имени в реверсивном порядке");
        System.out.print("№ " );
        
        int _sortOption = scanner.nextInt();
        switch  ( _sortOption )
        {
            case 1:         	
            	// сортировка вставками по id, по возростанию
            	for (int i = 1; i < StudentsList.size(); i++) {
                    Students current = StudentsList.get(i);
                    int j = i - 1;
                    while (j >= 0 && current.getId() < StudentsList.get(j).getId()) {
                    	StudentsList.set(j+1, StudentsList.get(j));
                        j--;
                    }
                    StudentsList.set(j+1, current);
                }
                
                System.out.println("После сортировки: " ); 
                System.out.println( "______________" );
                printStudents( StudentsList );
                break;
            case 2:
                // сортировка пузырьком по имени курьера (по алфавиту)
            	int len = OrderList.size();
            	for (int i = 0; i < len - 1; i++) {
                    for (int j = 0; j < len - i -1; j++) {
                        if (OrderList.get(j + 1).getCourier().compareTo(OrderList.get(j).getCourier()) < 0) {
                        	Order temp = OrderList.get(j);
                            OrderList.set(j, OrderList.get(j + 1));
                            OrderList.set(j+1, temp);
                        }
                    }
                }
            	
                System.out.println("После сортировки: " ); 
                System.out.println( "______________" );
                printList( OrderList );
                break;
            case 3:
            	// сортировка Шелла по firstName студента (по алфавиту в обратном порядке)
            	int h = 1;
                int n = StudentsList.size();
                while (h < n / 3)
                    h = 3 * h + 1;

                while (h >= 1) {
                    for (int i = h; i < StudentsList.size(); i++) {
                        for (int j = i; j >= h && StudentsList.get(j).getFirstName()
                        		.compareTo(StudentsList.get(j-h).getFirstName()) > 0; j -= h) {                  	
                        	
                            Students temp = StudentsList.get(j);
                            StudentsList.set(j, StudentsList.get(j - h));
                            StudentsList.set(j-h, temp);
                        }
                    }
                    h = h / 3;
                }
                
                printStudents( StudentsList );
            	break;
            default: System.out.println("Такой опции нет!");
        }
    }
    
    public static void menuChoice(int numMenu) {
        switch (numMenu) {
            case 1: Input(); SetInFile(); break;
            case 2: Output(); break;
            case 3: GetFromFile( scanner.nextLine() ); break;
            case 4: 
                if ( StudentsList.isEmpty())
                    System.out.println("Заполните для начала данные!"); 
                else
                    sortCollections( );
            break;
            case 5: System.exit(0); break;
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
        
        if (OrderList.isEmpty() )
            System.out.println("Заполните данные для начала!");
        
        for (int i = 0; i < OrderList.size(); i++) {
            System.out.println( "***********************************" );
            System.out.println(StudentsList.get(i));
            System.out.println(ContactList.get(i));
            System.out.println(OrderList.get(i));
            System.out.println( "***********************************" ); 
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
        System.out.println("Ошибка" + ex);
    }     
}
    
    public static void GetFromFile( String _pathToFile )
    {
        try {
            File myObj = new File(_pathToFile);
            Scanner myReader = new Scanner(myObj);
            System.out.println("Чтение с файла!");
            while (myReader.hasNextLine()) {
                System.out.println("ID студента: " + Integer.parseInt( myReader.nextLine() ) );
                System.out.println("Имя студента: " + myReader.nextLine() );
                System.out.println("Фамилия студента: " + myReader.nextLine() );
                System.out.println("Адресс: " + myReader.nextLine() );
                System.out.println("Имя курьера: " + myReader.nextLine() );
                System.out.println("Дата/время: " + myReader.nextLine() );
            }
        myReader.close();
    } catch (FileNotFoundException e) {
        System.out.println("An error occurred.");
        e.printStackTrace();
    }
    }
    
}


