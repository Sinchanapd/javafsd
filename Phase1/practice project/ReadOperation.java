package phase1_practice_project;

import java.io.FileReader;
import java.io.IOException;

public class ReadOperation {

	public static void main(String[] args) {
		try
		{
			FileReader r=new FileReader("C://Users//HP//Downloads//test.txt");
			try
			{
				int ch;
				while((ch=r.read())!=-1)
				{
					System.out.print((char)ch);
				}
			}
			finally
			{
				r.close();
			}
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
	}

}
