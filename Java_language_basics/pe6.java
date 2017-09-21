import java.util.*;
import java.lang.*;
import java.io.*;


class Prog
{
	public static void main (String[] args) throws java.lang.Exception
	{
		char a;
		Scanner in=new Scanner(System.in);
		a=in.next().charAt(0);
		if(a>=65&&a<=96)
		{
			System.out.println("capital");
		}
		if(a>=97&&a<=122)
		{
			System.out.println("small");
		}
		if(a>=48&&a<=57)
		{
			System.out.println("digit");
		}
		if((a>=0&&a<=47)||(a>=58&&a<=64)||(a>=91&&a<=96)||(a>=123&&a<=127))
		{
			System.out.println("Special symbol");
		}
	}
}
