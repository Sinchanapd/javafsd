package phase1_practice_project;

import java.io.FileWriter;
import java.io.IOException;

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
