package class_03;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Code_03_StackAndQueueConvert {

    public static class TwoStacksQueue {

        private Stack<Integer> stackPush;
        private Stack<Integer> stackPop;

        public TwoStacksQueue(Stack<Integer> stackPush, Stack<Integer> stackPop) {
            this.stackPush = new Stack<>();
            this.stackPop = new Stack<>();
        }

        public void push(int num) {
            stackPush.push(num);
        }

        public int pop() {

            if (stackPush.isEmpty() && stackPop.isEmpty()) {
                throw new RuntimeException("hh");
            } else if (stackPop.isEmpty()) {
                while (!stackPush.isEmpty()) {
                    stackPop.push(stackPush.pop());
                }
            }
            return stackPop.pop();

        }

        public static class TwoQueuesStack {
            private Queue<Integer> queue;
            private Queue<Integer> help;

            public TwoQueuesStack() {
                queue = new LinkedList<Integer>();
                help = new LinkedList<Integer>();
            }

            public void push(int pushInt) {
                queue.add(pushInt);
            }

            public int peek() {
                if (queue.isEmpty()){
                    throw new RuntimeException("Stack is empty!");
                }
                while (queue.size()>1){
                    help.add(queue.poll());
                }
                int res = queue.peek();
                help.add(queue.poll());
                swap();
                return res;
            }

            public int pop() {
                if (queue.isEmpty()){
                    throw new RuntimeException("Stack is empty!");
                }
                while (queue.size()>1){
                    help.add(queue.poll());
                }
                Integer res = queue.poll();
                swap();
                return res;
            }

            private void swap() {
                Queue<Integer> tmp = help;
                help = queue;
                queue = tmp;
            }

        }
    }
}
