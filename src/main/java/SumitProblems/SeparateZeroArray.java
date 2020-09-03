package SumitProblems;

public class SeparateZeroArray {
    public static void main(String[] args) {
        int a[] = {1, 3, 0, 6, 0, 9};
        int k = a.length - 1;

        for (int i = 0; i <= a.length - 1; i++) {

            for (int j = i+1; j <= k; j++) {

//                if (a[i] == 0) {
//                    break;
//                }
                if (a[i] < a[j])
                {
                    int temp = a[j];
                    a[j] = a[i];
                    a[i] = temp;
                }
            }
            System.out.print(a[i] + " ");
        }

    }
}


