package Collection.StackDemo;

import java.util.Stack;

public class Demo {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        for (int i=1;i<=5;i++){stack.push(i);}

        for (int i=1;i<stack.size();i++){System.out.println(stack.peek());}

        System.out.println(stack);

        for (int i=1;i<=3;i++){
            System.out.println("POP: "+stack.pop());
        }

        System.out.println(stack);
    }
}
