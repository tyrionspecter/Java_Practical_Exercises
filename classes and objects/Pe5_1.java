import java.util.*;
import java.io.*;

public class Pe5_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner reader=new Scanner(System.in);
    int i=reader.nextInt();
		 boolean x=isEven(i);
		if(x==true)
		 System.out.println("The given number is even");
		else
			System.out.println("The given number is odd");

	}

	public static boolean isEven(int number) {
		if(number<0)
			number=number*-1;
		boolean x=true;
		if(number%2==1)
			x=false;
		return x;
	}
}
