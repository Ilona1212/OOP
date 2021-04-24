package Main;

import java.util.*;

public class Contact extends Students{
    protected String Address; 

    public Contact(String Address, int ID, String firstName, String lastName) {
        super(ID, firstName, lastName);
        this.Address = Address;
    }
    
    public Contact( Students student, String Address )
    {
        super(student.getId(), student.getFirstName(), student.getLastName() );
        this.Address = Address;
    }
    
    public Contact(){};
    
    public String getAddress() {
       return Address;
   }
    
    public void setAddress( String _address )
    {
        this.Address = _address;
    }

    @Override
    public String toString() {
        return "Contact{" + "Id=" + Id + ", FirstName=" + FirstName + ", LastName=" + LastName + ", Address=" + Address + '}';
    }
    
}
