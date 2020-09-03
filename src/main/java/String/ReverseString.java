package String;

public class ReverseString {

    public static void main(String[] args) {
        String str = "how to do in java";
        char[] c = str.toCharArray();
        int k = c.length;

        for (int i = 0; i < k; i++) {
            char temp = c[i];
            c[i] = c[k - 1];
            c[k - 1] = temp;
            k--;
        }
        String s = String.valueOf(c);
        System.out.println(s);
    }
}
