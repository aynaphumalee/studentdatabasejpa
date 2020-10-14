/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentdatabasejpa;

import java.util.List;

/**
 *
 * @author Ayna
 */
public class StudentDatabaseJPA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Student student1 = new Student(1, "John", 3.75);
       Student student2 = new Student(2, "Marry", 3.25);
       StudentTable.insertStudent(student1);
       StudentTable.insertStudent(student2);
       
       List<Student> studentList = StudentTable.findAllStudent();
       printAllEmployee(studentList);
    }
    
    
     public static void printAllEmployee(List<Student> studentList) {
        for(Student student : studentList) {
           System.out.print(student.getId() + " ");
           System.out.print(student.getName() + " ");
           System.out.println(student.getGpa() + " ");
       }
    }
}
