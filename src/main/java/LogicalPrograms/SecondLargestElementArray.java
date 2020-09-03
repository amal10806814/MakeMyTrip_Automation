package LogicalPrograms;

public class SecondLargestElementArray {

    public static void main(String[] args) {

        int a[] = new int[5];

        a[0] = 4;
        a[1]= 8;
        a[2]= 10;
        a[3] = 6;
        a[4]= 2;

        for(int i = 0 ; i <=a.length-1; i++)
        {
            for(int j = i+1; j<=a.length-1 ; j++)
            {
                if(a[i]>a[j])
                {
                   int temp = a[i] + a[j];
                   a[i] = temp -a[i];
                   a[j]= temp - a[j];

                }
            }
        }
        System.out.println(a[a.length-3]);
    }
}
