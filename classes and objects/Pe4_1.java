import java.util.*;
import java.io.*;


public class Pe4_1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

//		Scanner file = new Scanner(new File(path));
	//	
//		System.out.println(file.nextLine());
		
		
     String path,filename;	
		filename="harsh.txt";
		 String current = new java.io.File( "." ).getCanonicalPath();
		 path=current+"/src/"+filename;

		 File file = new File(path);
		 System.out.println(file.length());
		 int n;
		 n=(int)file.length();
	
	FileReader fr = new FileReader(path);
	char[] c=new char[n];
	String a;
	fr.read(c);
	a=String.copyValueOf(c);
	System.out.println(a.toUpperCase());
	System.out.println(a.length());
	fr.close();
	}

}
