package mypackage;

public class Driver
{
    private static String createPerson(String firstName,
        String lastName, int age, String occupation, String country,
        double salary)
    {
        Name name = new Name(firstName, lastName);
        Age _age = new Age(age);
        Occupation job = new Occupation(occupation);
        Nationality nation = new Nationality(country);
        Income income = new Income(salary);

        return String.format("%-15s %-15s %-15s %-15s %-15s",
                             name, _age, job, nation,income);
    }
        public static void main(String[] args)
    {
        // Creating details of some people to demonstrate
        String[] people = new String[5];
        people[0] = createPerson("Mateusz", "Wysocki", 22, "Java Programmer",
            "Poland", 1000000000);
        people[1] = createPerson("Adrianna", "Wysocka", 19, "Nurse", 
            "Poland", 500000);
        people[2] = createPerson("Robert", "Kowalski", 22, "Logistic", 
            "Poland", 600000);
        people[3] = createPerson("Przemek", "Pepik", 32, "Driver",
            "Poland", 800000);


        // Printing details of people
        
        System.out.println(String.format("%-15s %-15s %-15s %-15s %-15s", "Name", "Age", "Occupation", "Country",
                "Income"));
        for(int i=0;i<4;i++)
        {
            System.out.println(people[i]);
        }
    }
}
