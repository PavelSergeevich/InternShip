package institution;

import person.Student;
import person.consciousness.Knowledge;

public class University {
    String name;
	Knowledge knowledge;
	Student student;

	public University(String name) {
    	this.name=name;
    }

    public void setStudent(Student student) {
    	this.student=student;
    }

    public void addStudent(Student student) {
    	this.student=student;
    }
    
}
