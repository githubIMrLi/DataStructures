package classOne.class_03;

import java.util.Stack;

public class GetMinStack {
    public static class MyStack1 {
        private Stack<Integer> stackData;
        private Stack<Integer> stackMin;

        public MyStack1() {
            this.stackData = new Stack<Integer>();
            this.stackMin = new Stack<Integer>();
        }

        public void push(int newNum) {
            if (this.stackMin.isEmpty()) {
                this.stackMin.push(newNum);
            } else if (newNum <= this.getmin()) {
                this.stackMin.push(newNum);
            }
            this.stackData.push(newNum);
        }

        public int pop() {
            if (this.stackData.isEmpty()) {
                throw new RuntimeException("Your stack is empty.");
            }
            int value = this.stackData.pop();
            if (value == this.getmin()) {
                this.stackMin.pop();
            }
            return value;
        }

        public int getmin() {
            if (this.stackMin.isEmpty()) {
                throw new RuntimeException("Your stack is empty.");
            }
            return this.stackMin.peek();
        }
    }

    public static class MyStack2 {
        private Stack<Integer> dataStack;
        private Stack<Integer> minStack;

        public MyStack2(){
            dataStack = new Stack<Integer>();
            minStack = new Stack<Integer>();
        }

        public void push(int num){
            if (minStack.isEmpty()){
                minStack.push(num);
            }else if (num< getMin()){
                minStack.push(num);
            }else {
               minStack.push(getMin());
            }
            dataStack.push(num);
        }

        public Integer pop(){
            if (dataStack.isEmpty()){
                throw new RuntimeException("Your stack is empty.");
            }
            minStack.pop();
            return dataStack.pop();
        }


        public Integer getMin(){
            if (minStack.isEmpty()){
                throw new RuntimeException("栈为空");
            }
            return minStack.peek();
        }
    }

    public static void main(String[] args) {
        MyStack1 stack1 = new MyStack1();
        stack1.push(3);
        System.out.println(stack1.getmin());
        stack1.push(4);
        System.out.println(stack1.getmin());
        stack1.push(1);
        System.out.println(stack1.getmin());
        System.out.println(stack1.pop());
        System.out.println(stack1.getmin());

        System.out.println("=============");

        MyStack2 stack2 = new MyStack2();
        stack2.push(3);
        stack2.push(2);
        stack2.push(3);
        stack2.push(1);

        System.out.println(stack2.getMin());
    }
}
