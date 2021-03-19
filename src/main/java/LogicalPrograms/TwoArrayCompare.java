package LogicalPrograms;

public class TwoArrayCompare {
    public static void main(String[] args) {

        int a[] = {1,2,3,4,5};
        int b[] = {1,2,3,4,5};

        int temp = 0 ;
        for(int i = 0 ; i <=a.length-1; i++)
        {
            if(a[i]==b[i])
            {
               temp = temp +1 ;
            }
            else {
                System.out.println("not identical array");
            }
         }
        if(temp==a.length)
        System.out.println("All values are identical:" + " Both Arrays are Identical");

    }
}
