import java.util.*;
import java.io.*;
public class Pe7_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,n,x,p=1,q=1;
		Scanner reader=new Scanner(System.in);
		System.out.print("Enter your last number ");
		n=reader.nextInt();
		
		for(i=1;i<=n;i++) {
//			if(i>=13) {
//			System.out.println("Factorial of "+i+" is out of range");
//			continue;
//			}
			x=fact(i);
			q=x;
			if((q/p)!=i) {
				System.out.println("exceeded limit");
				continue;
			}
			System.out.println("Factorial of "+i+" is "+x);
			p=x;
		}

	}
	
	public static int fact(int x) {
		if(x==1)
			return 1;
		else
			return (x*fact(x-1));
		
	}

}
