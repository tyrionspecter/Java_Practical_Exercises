import java.util.*;
import java.lang.*;
import java.io.*;


class Prog
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		Random rand=new Random();
		int a=rand.nextInt();
		System.out.println(a);
		if(a==n)
		{
			System.out.println("Number guessed matches the original number");
		}
		if(a>n)
		{
			System.out.println("Number guessed lesser the original number");
		}
		if(a==n)
		{
			System.out.println("Number guessed greater the original number");
		}
	}
}
