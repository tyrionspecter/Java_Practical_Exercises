import java.util.*;  
public class query1 {  
   public static void main(String[] args) {  
       ArrayList<String> c1= new ArrayList<String>();
       c1.add("Java");    
       c1.add("C");      
       c1.add("C++");      
       c1.add("Python");      
       c1.add("JavaScript");          
       ArrayList<String> c2= new ArrayList<String>();  
       c2.add("Java");      
       c2.add("Angular");        
       c2.add("C++");      
       c2.add("JavaScript");
       
//Complete code to store the comparion output in ArrayList<String>
       
       ArrayList<String> c3= new ArrayList<String>();
       for (String data : c1)
           c3.add(c2.contains(data) ? "Yes" : "No");
       System.out.println(c3);

}}
