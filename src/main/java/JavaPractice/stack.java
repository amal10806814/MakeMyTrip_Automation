package JavaPractice;

import java.util.Stack;

public class stack {

    public static void main(String[] args) {

        Stack s = new Stack();

        s.push("A");
        s.push("B");
        s.push("c");

        System.out.println(s);

        s.pop();
        System.out.println(s);

        s.push("c");

        System.out.println(s);

        s.peek();

        System.out.println(s);

        System.out.println(s.search("A"));

        System.out.println(s.search("a"));

    }
}
