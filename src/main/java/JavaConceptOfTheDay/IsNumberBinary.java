package JavaConceptOfTheDay;

public class IsNumberBinary {

    public static void numberBinary(int num)
    {
        int finalNo = num;
        boolean isBinary = true;
        while(num!=0)
        {
            int sum = num%10;

            if(sum>1)
            {
                isBinary = false;
                break;
            }
            num = num/10;
        }

        if(isBinary)
        {
            System.out.println(finalNo + " binary no");
        }
        else
        {
            System.out.println(finalNo + " not binary");
        }

    }

    public static void main(String[] args) {
        numberBinary(101);

    }
}
