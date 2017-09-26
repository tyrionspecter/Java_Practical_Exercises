import java.util.*;

public class query1 {

	public static void main(String[] args) {
		
		String [] arr=new String[5];
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the array");
		for(int i=0;i<5;i++)
		{
			arr[i]=s.nextLine();
		}
		System.out.println(arr[0]);
		ArrayList<String> numlist= new ArrayList<String>(Arrays.asList(arr));
		numlist.add("String1");
		numlist.add("String2");
		 for (String str: numlist)
		    {
		 	System.out.println(str);
		    }
	}

}

