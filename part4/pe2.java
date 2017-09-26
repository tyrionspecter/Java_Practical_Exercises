import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Prog
{
	public static void main (String[] args) throws java.lang.Exception
	{
		String str="one one -one___two,,three,one @three*one?two";
		str=str.replaceAll("[^A-Za-z]+", " ");
		String words[] = str.split("\\s+");
		HashMap<String,Integer> wordCounts = new HashMap<String,Integer>(50,10);
		for(String w : words) 
		{
		    Integer i = wordCounts.get(w);
		    if(i == null) wordCounts.put(w, 1);
		    else wordCounts.put(w, i + 1);
		}
		for (Map.Entry m:wordCounts.entrySet())
          System.out.println("Frequency of " + m.getKey() + 
                             " is " + m.getValue());
		
	}
}
