package assisted_practice;

class MyExcep extends Exception 
{ 
    public MyExcep(String s) 
    { 
        super(s); 
    } 
} 

public class CustomExcep {

	public static void main(String[] args) {
		try
        { 
            throw new MyExcep("temp"); 
        } 
        catch (MyExcep ex) 
        { 
            System.out.println("Caught"); 
            System.out.println(ex.getMessage()); 
        } 
	}
}
