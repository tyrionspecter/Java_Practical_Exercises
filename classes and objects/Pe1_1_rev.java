import java.util.*;
import java.io.*;

public class Pe1_1_rev {
  String x;
	public Pe1_1_rev(String x) {
		
		char c[],y;
		c=x.toCharArray();
		int l,n,i,flag=0;
		n=x.length();
		n--;
		for(i=0;i<n;i++) {
			if(c[i]!=c[n]) {
				flag=1;
				break;
			}
			n--;
		}
		
		for(;i<n;i++) {
			y=c[i];
			c[i]=c[n];
			c[n]=y;
			n--;
		}
	System.out.println(c);
		if(flag==0)
			System.out.println("Palindrome");
		else
			System.out.println("not a Palindrome");
		
	}
	
	

}
