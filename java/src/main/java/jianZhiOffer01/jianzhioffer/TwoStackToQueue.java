package jianZhiOffer01.jianzhioffer;

import java.util.Stack;

public class TwoStackToQueue {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack1.push(node);
    }

    public int pop() {
        if (stack1.isEmpty()&&stack2.isEmpty()){
            throw  new RuntimeException("queue is empty!");
        }else if (!stack1.isEmpty()){
            while (stack2.isEmpty()){
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }

}
