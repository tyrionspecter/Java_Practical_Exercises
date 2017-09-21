        import java.util.*;
        import java.lang.*;
        import java.io.*;
     
     
        class Prog
        {
        	public static void main (String[] args) throws java.lang.Exception
        	{
        		String s;
        		Scanner in=new Scanner(System.in);
        		s=in.nextLine();
        		for(int i=0;i<s.length();i++)
        		{
        			char ar=s.charAt(i);
        			if(ar=='a'||ar=='e'||ar=='i'||ar=='o'||ar=='u')
        			{
        				System.out.print("Vowel");
        			}
        			else
        			{
        				System.out.print("Consonant");
        			}
        		}
        	}
        }
