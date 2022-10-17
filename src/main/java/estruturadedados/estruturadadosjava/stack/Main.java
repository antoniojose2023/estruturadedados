package estruturadedados.estruturadadosjava.stack;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        Stack<Tablet> stack = new Stack<>();

        stack.push(new Tablet("amazon"));
        stack.push(new Tablet("amazon8"));
        stack.push(new Tablet("amazon10"));


        System.out.println(stack.peek());
        System.out.println(stack);


        System.out.println(stack.pop());
        System.out.println(stack);

        System.out.println(stack.isEmpty());


    }
}
