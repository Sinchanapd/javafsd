package phase1_practice_project;

import java.io.FileWriter;
import java.io.IOException;

public class AppendOperation {

	public static void main(String[] args) {
		try
		{
			FileWriter file=new FileWriter("F://Mphasis//Phase1//assignment//test.txt",true);
			file.write("Appending some data");
			file.close();
			System.out.println("Append operation successful");
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
	}
}
