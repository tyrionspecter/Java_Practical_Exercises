import java.util.*;


class pe5 {
    public static void print_map(HashMap<String, String> hm){
        for(Map.Entry<String , String> ent : hm.entrySet()){
            System.out.println(ent.getKey() + " : " + ent.getValue());
        }
    }
    public static void main(String args[] ) {

        HashMap<String, String> hm = new HashMap<String, String>();
        hm.put("val1", "java1");
        hm.put("val2", "java2");

        print_map(hm);

        String tmp;
        if(hm.get("val1") != null){
            tmp = hm.get("val1");
            hm.put("val1" , "");
            hm.put("val2", tmp);
        }

        print_map(hm);

    }
}

