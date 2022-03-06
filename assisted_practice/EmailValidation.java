package assisted_practice;

import java.util.regex.Pattern;

public class EmailValidation {
	public static String validateEmail(String email)
	{
		if(email==null || email.isEmpty())
		{
			return "invalid";
		}
		Pattern pattern;
		String emailRegex="^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
		Pattern pattern1=Pattern.compile(emailRegex);
		if(pattern1.matcher(email).matches())
		{
			return "a valid";
		}
		else
		{
			return "invalid";
		}
	}	
	public static void main(String[] args) {
		String email[]=new String[4];
		email[0]="sinchana@gmail.com";
		email[1]="@sushmagmail.com";
		email[2]="rajendragmail.com";
		email[3]="";
		for(int i=0;i<email.length;i++)
		{
			System.out.println(email[i]+" is "+validateEmail(email[i])+" email");
		}
	}
}

