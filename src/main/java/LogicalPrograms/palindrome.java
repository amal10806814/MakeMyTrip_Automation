package LogicalPrograms;

public class palindrome {
    public static void main(String[] args) {

        int[] a = {1,2,3,2,1};

        for(int i = 0 ; i <a.length ; i ++)
        {
            if(a[i]!= a[a.length -1 - i])
            {
                System.out.println("not palindrome");
            }
        }
        System.out.println("palindrome");
    }
}
