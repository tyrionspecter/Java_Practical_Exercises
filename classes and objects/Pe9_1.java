import java.util.Scanner;
import java.util.*;
import java.io.*;
public class Pe9_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader=new Scanner(System.in);
		  int i,x,n;
		  String path,type;
		System.out.print("Specify your path : ");
		path=reader.nextLine();

		System.out.print("Specify your type : ");
		type=reader.nextLine();

		File folder = new File(path);
		File[] list=folder.listFiles();
	  
	  
	  n=list.length;
	   
	  
     for(i=0;i<list.length;i++) {
    	 if(list[i].getName().endsWith(type))
		  System.out.println("File name is "+list[i].getName());
	  }
	
	
	
	
	}

}
