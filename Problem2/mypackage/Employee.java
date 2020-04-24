package mypackage;

public class Employee {
	public String name; 
	public String surname;
	public int age;
	
public Employee(String name, String surname, int age) {
	this.name = name;
	this.surname = surname;
	this.age = age;
}

public String data() {
	return (this.getClass().getSimpleName() + " " + this.name + " " + this.surname + " " + this.age);
}

}

