import java.util.*;
import java.lang.*;
import java.io.*;

class Prog
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int temp,temp1,dig,sumeven;
		sumeven=0;
		System.out.println("The sorted no. is");
		for(dig=9;dig>=0;dig--)
		{
			for(temp=n;temp>0;temp/=10)
			{
				if(temp%10==dig)
				{
					System.out.print(dig);
				}
			}
		}
		System.out.println();
		System.out.println("sum of even nos is");
		for(temp1=n;temp1>0;temp1/=10)
			{
				if((temp1%10)%2==0)
				{
					sumeven+=(temp1%10);
				}
			}
		System.out.println(sumeven);
		if(sumeven>15)
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");	
		}
	}
}
