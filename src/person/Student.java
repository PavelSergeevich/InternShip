package person;

import person.consciousness.Knowledge;

public class Student {

	public  String name;
	public  int knowledge;
	
	public Student(String name, int knowledge) {
       this.name=name;
       this.knowledge=knowledge;
    }
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name=name;
    }
	public int getKnowledge() {
        return this.knowledge;
    }
    public void setKnowledge(int knowledge) { 
		this.knowledge=knowledge;
    }
	public void information() {
		if (knowledge>50) {
		System.out.println("Ім'я: " + name + " Рівень знань: " + knowledge);
		}
	}
}
