/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 38099
 */
public class test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Students student = new Students (1, "Petrova", "Katya", 26, "Programist");
        student.discipline = "OOP";
        student.mark = 5;
        student.NameTeacher = "Ivan Ivanov";
        System.out.println(student);
    }
    
}
