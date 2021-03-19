package JavaConceptOfTheDay;

import java.util.ArrayList;
import java.util.HashSet;

public class RemoveDuplicateFromArrayList {
    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<String>();

        al.add("amal");
        al.add("gb");
        al.add("amal");
        al.add("deep");
        al.add("gb");
        al.add("manni");
        al.add("deep");

        HashSet<String> hs = new HashSet<String>();

        hs.addAll(al); //insertion order removed as for hashset, element is fetched based on the hascode
        //to maintain the insertion order even after removing duplicate elements then go for LinkedHashSet

        ArrayList<String> alNew = new ArrayList<String>();

        alNew.addAll(hs);
        System.out.println(alNew);

    }
}
