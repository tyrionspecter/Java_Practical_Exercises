import java.util.*;
public class query1 {
    
    
	   
public static void main(String[]args) {
        new Maintest().createStudent();
        ArrayList al = new ArrayList();
       al.add(new Student(1,"Mohit",22));
       al.add(new Student(2,"Anand",21));
       al.add(new Student(3,"Aditya",24));
       al.add(new Student(4,"Ghoda",23));
       al.add(new Student(5,"Ankur",25));
       

       
/*Collections.sort(al, new Sortbyname());
System.out.println("Sorted by name");
for (int i=0; i<al.size(); i++)
System.out.println(al.get(i));*/

Collections.sort(al,new Sortbyage());
System.out.println("Sorted by age");
for (int i=0; i<al.size(); i++)
System.out.println(al.get(i));


Collections.sort(al, new Sortbyname());

System.out.println("\nSorted by name");
for (int i=0; i<al.size(); i++)
   System.out.println(al.get(i));

}

    }
        
     class Student {
        private int id;
        private String name;
        private int age;
        
        
        public Student(int id, String name, int age) {
            super();
            this.id = id;
            this.name = name;
            this.age = age;
        }
        
        @Override
        public String toString() {
            return "[id=" + id + ", name=" + name + ", age=" + age + "]";
        }
        public int getId() {
            return id;
        }
        public void setId(int id) {
            this.id = id;
        }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public int getAge() {
            return age;
        }
        public void setAge(int age) {
            this.age = age;
        }  
        }
    
    class Maintest{
        public void createStudent(){
            
            
            
/*            Student stu1 = new Student(1,"Mohit",22);        
            Student stu2 = new Student(2,"anand",21);
            Student stu3 = new Student(3,"aditya",24);
            Student stu4 = new Student(4,"Ghoda",23);        
            Student stu5 = new Student(5,"Ankur",25);*/
            
    /*        System.out.println(stu1);
            System.out.println(stu2);
            System.out.println(stu3);
            System.out.println(stu4);
            System.out.println(stu5);*/
            
         }
        
    }
    
    class Sortbyage implements Comparator<Student>
    {

        public int compare(Student a, Student b)
        {
            return a.getAge() - b.getAge();
        }
    }
    
    class Sortbyname implements Comparator<Student>
    {

        public int compare(Student a, Student b)
        {
            return a.getName().compareTo(b.getName());
        }
    }
