package assisted_practice;

import java.io.*;

public class AppendOperation {

	public static void main(String[] args) {
		//String path="C://Users//HP//Downloads//test.txt";
		//String msg="Appending some data";
		try
		{
			FileWriter file=new FileWriter("C://Users//HP//Downloads//test.txt",true);
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
