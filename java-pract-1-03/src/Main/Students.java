package Main;

public class Students {
    protected int Id;
    protected String FirstName;
    protected String LastName;
    private int Group;
    private String Department;
    public String discipline;
    public int mark;
    public String NameTeacher;

    public Students(int ID, String firstName, String lastName) {
        this.Id = ID;
        this.FirstName = firstName;
        this.LastName = lastName;
    }
    public Students(){};
    
//    @Override
//    public int compareTo(Students compareStud) {
//        int compareID=((Students)compareStud).getId();
//        /* For Ascending order*/
//        return this.getId() - compareID;
//    }
    public int getId() {
       return Id;
   }
    
    public String getFirstName() {
       return FirstName;
   }
    
    public String getLastName() {
       return LastName;
   }
    
    public void setFirstName( String _firstName) {
       this.FirstName = _firstName;
   }
    
    public void setLastName( String _lastName) {
       this.LastName = _lastName;
   }
    
   public void setStudId( int _studID) {
       this.Id = _studID;
   }
    public int getGroup() {
        return Group;
    }

    public void setGroup(int group) {
        this.Group = group;
    }
    
    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String _department) {
        this.Department = _department;
    }

    @Override
    public String toString() {
        return "Students{" + "Id=" + Id + ", FirstName=" + FirstName + ", LastName=" + LastName + '}';
    }

    
   
}
