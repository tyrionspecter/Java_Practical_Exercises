import java.util.*;

public class query1 {

	public static void main(String[] args) {
		
		 String arr[] = {"a","b","c","d","a","c","c"};
		  Map<String, Boolean> map = new HashMap<> ();
	       for(String s: arr){
	           if(map.containsKey (s)){
	               map.put (s, true);
	           }
	           else{
	               map.put (s, false);
	           }
	       }
	       System.out.println (map);
		 
	}

}

