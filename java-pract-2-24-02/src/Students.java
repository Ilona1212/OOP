
/**
 *
 * @author 38099
 */
public class Students{
    public int Id;
    protected String FirstName;
    protected String LastName;
    private int Groupa;
    private String Department;
    public String discipline;
    public int mark;
    public String NameTeacher;

    public Students(int ID, String firstName, String lastName) {
        this.Id = ID;
        this.FirstName = firstName;
        this.LastName = lastName;
    }
    
    public String getFirstName() {
       return FirstName;
   }
    public void setFirstName(String firstName) {
       this.FirstName = firstName;
   }

    public String getLastName() {
       return LastName;
   }
    public void setLastName(String lastName) {
       this.LastName = lastName;
   }
    
    public int getGroupa() {
        return Groupa;
    }

    public void setGroupa(int Groupa) {
        this.Groupa = Groupa;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String Department) {
        this.Department = Department;
    }

    @Override
    public String toString() {
        return "Students{" + "Id=" + Id + ", FirstName=" + FirstName + ", LastName=" + LastName + '}';
    }

    
   
}

