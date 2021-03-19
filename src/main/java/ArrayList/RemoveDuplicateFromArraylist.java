package ArrayList;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateFromArraylist {
	

	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<String>();
		
		al.add("amal");
		al.add("deep");
		al.add("cool");
		al.add("amal");
		
		System.out.println(al);
		
		LinkedHashSet<String> ss = new LinkedHashSet<String>(al);
		
		System.out.println(ss);
		
		al.clear();
		
		al.addAll(ss);
		
		System.out.println(al);
		
		
	}

}
