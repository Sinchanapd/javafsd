package assisted_practice;

import java.io.*;

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
