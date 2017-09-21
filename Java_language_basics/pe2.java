import java.util.*;
import java.lang.*;
import java.io.*;
 
 
class Prog1
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in=new Scanner(System.in);
		int a=in.nextInt();
		if(a%2==0){
			if(a>=20&&a<=30)
			{
				System.out.println("Jerry");
			}
		}
		else{
			if(a>=20&&a<=30)
			{
				System.out.println("Tom");
			}
		}
	}
}
