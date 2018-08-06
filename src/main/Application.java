package main;

import java.util.ArrayList;

import institution.University;
import institution.interlink.Internship;
import person.Student;


public class Application {
    public static void main(String[] args) {
        University university = new University("CH.U.I.");
        university.addStudent(new Student("Andrew Kostenko", 54));
        university.addStudent(new Student("Julia Veselkina", 48));
        university.addStudent(new Student("Maria Perechrest", 86));
        

        Internship internship = new Internship("Interlink");
        System.out.println("List of internship's students:");
        
        //System.out.println(internship.getStudents());
        
        Student info = new Student("Andrew Kostenko", 54);
        Student info2 = new Student("Julia Veselkina", 48);
        Student info3 = new Student("Maria Perechrest", 86);
        Student info4 = new Student("Julia Kostenko", 72);
        Student info5 = new Student("Andrew Perechrest", 78);
        Student info6 = new Student("Maria Veselkina", 50);
        info.information();
        info2.information();
        info3.information();
        info4.information();
        info5.information();
        info6.information();
        
       
        
    }
}
