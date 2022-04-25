package assisted_practice;

import java.io.*;

public class WriteOperation {

	public static void main(String[] args) {
		try
		{
			FileWriter file=new FileWriter("C://Users//HP//Downloads//test.txt");
			try
			{
				file.write("New file created ");
			}
			finally
			{
				file.close();
				System.out.println("Write Operation successful");
			}
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
	}

}
