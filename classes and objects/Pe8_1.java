import java.util.Scanner;
import java.util.*;
import java.io.*;
public class Pe8_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long i,n,x,flag=0,q=1,p=1,max=0;
		Scanner reader=new Scanner(System.in);
		System.out.print("Enter your last number ");
		n=reader.nextInt();
		
		for(i=1;i<=n;i++) {
    
			if(flag==1) {
				System.out.println("Factorial of "+i+" is limit exceeded");	
				continue;
			}
			
			x=fact(i);
			q=x;
			if((q/p)!=i) {
				flag=1;
				System.out.println("Factorial of "+i+" is limit exceeded");	
				continue;
			}
			System.out.println("Factorial of "+i+" is "+x);
			max=x;
            p=x;
	}
		
		System.out.println("the maximum number is "+ max);


}
	public static long fact(long x) {
		if(x==1)
			return 1;
		else
			return (x*fact(x-1));
		
	}
}
