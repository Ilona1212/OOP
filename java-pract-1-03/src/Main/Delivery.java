package Main;

public class Delivery extends Order {
    private int IdDelivery;

    public Delivery(int IdDelivery, String Address, int ID, String firstName, String lastName, String Courier, String DateTime) {
        super(Address, ID, firstName, lastName, Courier, DateTime);
        this.IdDelivery = IdDelivery;
        
    }
    public Delivery( Order _order, int _deliveryId ) {
        super ( _order.getAddress(), _order.getId(), _order.getFirstName(), 
                _order.getLastName(), _order.getCourier(), _order.getDateTime() );
        this.IdDelivery = _deliveryId;
    }
    
    public int getIdDelivery() {
       return IdDelivery;
   }
    
    @Override
    public String toString() {
        return "Customer ID " + Id + ", Name " + FirstName + ", Last name " + LastName + ", courier's name " + Courier + ", date-time of order " + DateTime + ", delivery ID " + IdDelivery + '.';
    }
            
}
