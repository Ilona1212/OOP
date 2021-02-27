/**
 *
 * @author 38099
 */
public class Delivery extends Order {
    private final int IdDelivery;

    public Delivery(int IdDelivery, String Address, int ID, String firstName, String lastName, String Courier, String DateTime) {
        super(Address, ID, firstName, lastName, Courier, DateTime);
        this.IdDelivery = IdDelivery;
        
    }
    
    @Override
    public String toString() {
        return "Customer ID " + Id + ", Name " + FirstName + ", Last name " + LastName + ", courier's name " + Courier + ", date-time of order " + DateTime + ", delivery ID " + IdDelivery + '.';
    }
    
    
   
          
}
