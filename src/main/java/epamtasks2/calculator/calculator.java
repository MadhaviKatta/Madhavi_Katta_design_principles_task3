package epamtasks2.calculator;
import java.lang.*;
import java.util.*;


 class calculating{
	public void add(int a,int b)
	{
		System.out.println(a+b);
	}
	public void sub(int a,int b)
	{
		System.out.println(a-b);
	}
	public void mul(int a,int b)
	{
		System.out.println(a*b);
	}
	public void div(int a,int b)
	{
		System.out.println(a/b);
	}
	
}

public class calculator {
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		calculating c1=new calculating();
		System.out.println("Enter two numbers");
		int a=s.nextInt();
		int b=s.nextInt();
		System.out.println("Enter Your Choice");
		char ch=s.next().charAt(0);
		switch(ch)
		{
		case '+':c1.add(a,b);
		         break;
		case '-':c1.sub(a,b);
                  break;
		case '*':c1.mul(a,b);
                 break;
		case '/':c1.div(a,b);
                 break;
        default:System.out.println("Invalid Choice");
		}
	}

}
