/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 38099
 */
public class Students {
    private int Id_studenta;
    private String Fam;
    private String Name;
    private int Groupa;
    private String Department;
    public String discipline;
    public int mark;
    public String NameTeacher;

    public Students(int Id, String LastName, String SName, int SGroupa, String SDepartment) {
        this.Id_studenta = Id;
        this.Fam = LastName;
        this.Name = SName;
        this.Groupa = SGroupa;
        this.Department = SDepartment;
    }

    public int getId_studenta() {
        return Id_studenta;
    }

    public void setId_studenta(int Id_studenta) {
        this.Id_studenta = Id_studenta;
    }

    public String getFam() {
        return Fam;
    }

    public void setFam(String Fam) {
        this.Fam = Fam;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
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
        return "Students{" + "Id_studenta=" + Id_studenta + ", Fam = " + Fam + ", Name=" + Name + ", Groupa=" + Groupa + ", Department=" + Department + ", discipline=" + discipline + ", mark=" + mark + ", NameTeacher=" + NameTeacher + '}';
    }
   
}

