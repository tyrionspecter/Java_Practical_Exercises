import java.util.*;

public class query1 {

	public static void main(String[] args)
    {
        Set<String> hash_Set = new HashSet<String>();
        hash_Set.add("Harry");
        hash_Set.add("Olive");
        hash_Set.add("Bluto");
        hash_Set.add("Eugene");
        hash_Set.add("Alice");
        System.out.println("Before Sorting");
        System.out.println(hash_Set);
        Set<String> tree_Set = new TreeSet<String>(hash_Set);
        System.out.println("After Sorting");
        System.out.println(tree_Set);
    }

}

