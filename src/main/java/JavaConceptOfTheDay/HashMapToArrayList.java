package JavaConceptOfTheDay;

import java.util.*;

public class HashMapToArrayList {

    public static void main(String[] args) {

        HashMap<String,String> hm = new HashMap<String, String>();

        hm.put("name" , "amal");
        hm.put("job" , "engineer");
        hm.put("company", "Bristlecone");
        hm.put("profile", "QA");

        Set<String> set = hm.keySet();

        Collection<String> cc = hm.values();

        ArrayList<String> al = new ArrayList<String>(cc);

        System.out.println(al);

        Object[] obj = al.toArray();

        System.out.println(Arrays.toString(obj));

        Arrays.sort(obj);

        System.out.println(Arrays.toString(obj));

    }
}
