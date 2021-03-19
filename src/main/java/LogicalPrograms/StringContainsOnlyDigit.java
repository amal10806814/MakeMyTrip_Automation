package LogicalPrograms;

public class StringContainsOnlyDigit {

public static Boolean isEmpty(String cs)
{
    return cs == null || cs.length()==0;
}

public static boolean isNumeric(String cs)
{
    if(isEmpty(cs))
    {
        return false ;
    }

    for(int i = 0 ; i < cs.length() ; i++)
    {
        if( ! Character.isDigit(cs.charAt(i)))
        {
            return false;
        }
    }
    return true;

}

    public static void main(String[] args) {
        System.out.println(isNumeric("123a"));


    }
}
