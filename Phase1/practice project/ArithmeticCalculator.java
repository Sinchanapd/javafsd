package phase1_practice_project;

import java.util.Scanner;

public class ArithmeticCalculator {

	public static void main(String[] args) {
		char operator;
		double num1,num2,res;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter number1: ");
		num1=in.nextInt();
		System.out.println("Enter number2: ");
		num2=in.nextInt();
		System.out.println("Choose the operator: +,-,*,/");
		operator=in.next().charAt(0);
		switch(operator)
		{
		case '+':res=num1+num2;
				 System.out.println("Addition of "+num1+" and "+num2+" is: "+res);
				 break;
		case '-':res=num1-num2;
				 System.out.println("Subtraction of "+num1+" and "+num2+" is: "+res);
				 break;
		case '*':res=num1*num2;
				 System.out.println("Multiplication of "+num1+" and "+num2+" is: "+res);
				 break;
		case '/':if(num2==0)
				 {
					 System.out.println("Division is not possible");
				 }
				 else 
				 {
					 res=num1/num2;
					 System.out.println("Division of "+num1+" and "+num2+" is: "+res);
				 }
				 break;
		default:System.out.println("Invalid operator");
				break;
		}
	}

}
