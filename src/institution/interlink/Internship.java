package institution.interlink;

import institution.University;
import person.Student;
import person.consciousness.Knowledge;

public class Internship {
    String name;
	Student student;
    int knowledge;

	public Internship(String name) {
       this.name=name;
    }

    public void setStudent(Student student) {
       this.student=student;
    }

    public Student getStudents() {
	   return this.student;
    }
    
    
}
