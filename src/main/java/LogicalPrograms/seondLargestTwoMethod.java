package LogicalPrograms;

public class seondLargestTwoMethod {

    public static void main(String[] args) {

        int a[] = {4,8,10,6,2};
        int temp;
        for (int i = 0; i < a.length-1; i++)
        {
            for (int j = i + 1; j <= a.length-1; j++)
            {
                if (a[i] > a[j])
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }
}
