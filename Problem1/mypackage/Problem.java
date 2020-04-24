package mypackage;
import java.util.Scanner;

public class Problem{
	/* I have solved the problem, by creating an array that has 50 elements, 
	 * When the user gives program a number, it is appointed to the element by 
	 * the index given from user, and the number kept on this index which is 
	 * 0 at the begining is incremented by one.
	 * Which results in a way, that there is the count of how many times user 
	 * gave this number. Next it is printed */
	
    public static void main(String[] args){
    	
        int[] store = new int[51];
        System.out.println("Enter integers between"+
        " 0 and 50, when You want to finish"+
        " type any integer above the range, for example 52");
        
        System.out.println("Enter Integer: ");
        Scanner scan = new Scanner(System.in);
        int integer = scan.nextInt();
        
        while(integer >= 0 && integer <= 51)
        {
            store[integer] = store[integer] + 1;
            System.out.println("Enter Integer: ");
            integer = scan.nextInt();
        }

        System.out.println("Results are following: ");
        for (int i=0; i < 51; i++) 
        {  
            if (store[i] > 0)
                System.out.println(i + ": " + store[i]);
        }
    }
}