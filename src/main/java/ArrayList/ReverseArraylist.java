package ArrayList;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class ReverseArraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> al = new ArrayList<Integer>();
		
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		
		Collections.reverse(al);
		
		System.out.println(al);;
	}

}
