package mypackage;

public class Hospital {
	
	/*I have set it up so the class Hospital is the driver of our
	program, the Class Employee is the main class for creating 
	Employee, that also contains the constructor, the following
	Employees such as Janitor Nurse Doctor etc, are extensions
	of the Class Employee. The data method is displaying the
	details about an employee. */
	
	public static void main(String[] args) {
		
		Janitor Matt = new Janitor("Mateusz","Wysocki", 22);
		System.out.print(Matt.data() + "\n");
		Matt.Support();

		Nurse Kasia = new Nurse("Katarzyna", "Wysocka", 45);
		System.out.print(Kasia.data() + "\n");

		Doctor Lukasz = new Doctor("Lukasz", "Ledzinski", 28);
		System.out.print(Lukasz.data() + " ");
		Lukasz.Recipes();
		
	}

}
