/**
 *
 * @author 38099
 */
public class Order {

    private int Id;
    private String Name;
    private String Courier;
    public String DateTime;
    private Type type;

    public Order(int Id, String name, String courier) {
        this.Id = Id;
        this.Name = name;
        this.Courier = courier; 
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public String getCourier() {
        return  Courier;
    }

    public void setCourier(String courier) {
        this.Courier = courier;
    }

    
    public String getDateTime() {
        return DateTime;
    }

    public void setDateTime(String dateTime) {
        this.DateTime = dateTime;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
     
}

    @Override
    public String toString() {
        return "Order{" + "Id=" + Id + ", name=" + Name + ", courier=" + Courier + ", dateTime=" + DateTime + ", type=" + type + '}';
    }

    
public enum Type{
RUSHORDER,
REGULARORDER;
}
}

