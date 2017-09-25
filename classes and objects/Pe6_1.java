import java.util.*;
import java.io.*;

public class Pe6_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int min,max,n,i;
		float total=0;
		Scanner reader=new Scanner(System.in);
		System.out.println("Enter the number of students : ");
		n=reader.nextInt();
		min=9999;
		max=-99999;
		int[] stu=new int[n];
		for(i=0;i<n;i++) {
			System.out.println("Enter the Student "+i+1+" grades :");
			stu[i]=reader.nextInt();
			if(min>stu[i])
				min=stu[i];
			if(max<stu[i])
				max=stu[i];
			total=total+stu[i];
		}
		System.out.println("The average is "+total/n);
		System.out.println("The maximum is "+max);
		System.out.println("The minimum is "+min);
	}

}
