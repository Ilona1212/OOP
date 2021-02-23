package Main;
/**
 *
 * @author 38099
 */
public class Order {
    private int Id;
    private String name;
    private String courier;
    public String dateTime;
    public Type type;

    public Order(int Id, String name, String courier) {
        this.Id = Id;
        this.name = name;
        this.courier = courier;
        
        
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourier() {
        return courier;
    }

    public void setCourier(String courier) {
        this.courier = courier;
    }

    
    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    

    public String toString() {
        return "Замовлення: " + "Id замовлення " + Id + ", назва замовлення " + name + ", кур'єр " + courier + ", дата та час" + dateTime + ", тип замовлення " + type ;
    }
    
}
enum Type{
rushOrder("Срочне замовлення"),
regularOrder("Звичайне замовлення")
}

