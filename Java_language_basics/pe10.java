import java.util.*;
import java.lang.*;
import java.io.*;


class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in=new Scanner(System.in);
		String s=in.nextLine();
		int n=in.nextInt();
		if(n>s.length())
		{
			System.out.println("length of substring is more than string length");
		}
		else
		{
			String sub="";
			for(int i=s.length()-n;i<=s.length()-1;i++)
			{
				sub+=s.charAt(i);
			}
			System.out.print(s);
			for(int j=0;j<n;j++)
			{
				System.out.print(sub);
			}
		}
	}
}
