package jianZhiOffer01.offer3_10;

import java.util.Stack;

public class offer21 {
    public boolean IsPopOrder(int[] pushA, int[] popA) {
        Stack<Integer> stack = new Stack<>();
        int n = pushA.length;
        for (int pushIndex = 0,popIndex = 0; pushIndex < n; pushIndex++) {
            stack.push(pushA[pushIndex]);
            while (popIndex<n&&!stack.isEmpty()&&stack.peek()==popA[popIndex]){
                stack.pop();
                popIndex++;
            }

        }
        return stack.isEmpty();
    }
}
