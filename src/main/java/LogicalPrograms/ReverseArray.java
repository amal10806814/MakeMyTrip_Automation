package LogicalPrograms;

public class ReverseArray {

    public static void main(String[] args) {

        int a[] = {2,3,4,5,6};
        int temp ;
        int k = a.length-1;

        for(int i = 0 ; i <=(a.length-1)/2 ; i++)
        {
                temp = a[k-i];
                a[k-i]= a[i];
                a[i]= temp;
        }
        for (int i =0; i<=a.length-1; i++)
        {
            System.out.print(a[i] + " ");
        }
    }
}
