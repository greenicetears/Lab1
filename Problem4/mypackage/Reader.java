package mypackage;

import java.io.File;
import java.util.Scanner;

public class Reader {
	
	public static void main(String[] args) {
	int[][][][] count;
        try {
            Scanner input = new Scanner(System.in);

            File file = new File("data.txt");

            input = new Scanner(file);


            while (input.hasNextLine()) {
            	
                String line = input.nextLine();
                System.out.println(line);
            }
            input.close();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}
