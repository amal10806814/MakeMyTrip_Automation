package ArrayList;

public class recursionProgram {
	
	public static void recursion(int num)
	{
		System.out.println(num);
		
		if(num==0)
		{
			return;
		}
		else
			recursion(++num);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		recursionProgram.recursion(1);

	}

}
