package LogicalPrograms;

public class MissingNumberInArray {

    public static void main(String[] args) {

        int a[]= {1,2,3,4,5,6,7,8,9,10};
        int b[]= {1,2,3,4,5,6,8,9,10};
        int temp =0 ;
        int temp1 = 0;
        int no;
        for (int i = 0 ; i < a.length ; i++)
        {
            temp = temp + a[i];
        }
        System.out.println(temp);

        for(int i= 0; i < b.length ; i++)
        {
            temp1 = temp1 + b[i] ;
        }
        System.out.println(temp1);

        no = temp - temp1 ;
        System.out.println(no);


    }
}
