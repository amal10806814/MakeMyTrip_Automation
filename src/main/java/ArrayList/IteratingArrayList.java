package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratingArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> al = new ArrayList<String>();
		
		al.add("cricket");
		al.add("hockey");
		al.add("football");
		al.add("tennis");
		
		
		
		Iterator<String> itr = al.iterator();
		
		while(itr.hasNext())
		{
			String s = itr.next();
			System.out.println(s);
		}
		
		//Another way For each loop
		
		for(String s : al)
		{
			System.out.println(s);
		}

	}

}
