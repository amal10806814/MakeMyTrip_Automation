package LogicalPrograms;

public class duplicateArray {

    public static void main(String[] args) {

        int a[]= new int[5];

        a[0] = 5;
        a[1]= 3;
        a[2] = 3;
        a[3]= 1;
        a[4]= 5;


        int j = a.length-1;
        for (int i=0 ; i<=j ; i++)
        {
            int temp =0;
            for(int k = 0 ; k <= j; k ++) {
                if (a[i] == a[k]) {
                    temp = temp + 1;
                }
                }
            if (temp >= 2) {
                System.out.println(a[i]);
            }
        }

//        System.out.println(a.length);
//        System.out.println(a[3]);
    }
}
