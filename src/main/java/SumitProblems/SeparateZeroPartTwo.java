package SumitProblems;

public class SeparateZeroPartTwo {

    public static void main(String[] args) {

        int a[] = {4,0,8,0,8,2};
        int k = a.length-1;
        int temp;
        for (int i = 0 ; i <= k ; i ++)
        {

            if(a[i]==0){

                temp = a[k];
                a[k] = a[i];
                a[i]= temp;
                k--;
            }
        }
        for (int i = 0; i <=k ; i++)
        {
            System.out.print(a[i] + " ");
        }
    }
}
