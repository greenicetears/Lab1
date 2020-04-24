package mypackage;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Comparer {


public static void main(String[] args) throws IOException{
	
	BufferedReader Reader1 = new BufferedReader(new FileReader("file1.txt"));
	BufferedReader Reader2 = new BufferedReader(new FileReader("file2.txt"));
	
	String line1 = Reader1.readLine();
	String line2 = Reader2.readLine();
	
	boolean areEqual = true;
	
	int lineNum = 1;
	
	while (line1 != null || line2 !=null) {
		if(line1 == null || line2 == null)
		{
			areEqual = false;
			break;
		}
		else if(! line1.equalsIgnoreCase(line2)) {
			areEqual = false;
			break;
		}
		line1 = Reader1.readLine();
		line2 = Reader2.readLine();
		lineNum++;
	}
	if(areEqual)
	{
		System.out.println("Two files have same content.");
	}
	else
	{
		System.out.println("Two files have different content. The differ on line " +lineNum);
		System.out.println("File1 has "+line1+" and File2 has "+line2+" at line"+lineNum);
	}
	
	Reader1.close();
	Reader2.close();
	
}
}

