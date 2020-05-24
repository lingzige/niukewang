package niuke;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class IsPopOrder {
    public boolean isPopOrder(int [] pushA,int [] popA) {
        if(pushA.length == 0 || popA.length == 0)
            return false;
        Stack<Integer> stack = new Stack<>();
        int popIndex = 0;
        for(int i=0;i<pushA.length-1;i++){
            stack.push(pushA[i]);
            while (!stack.empty() && stack.peek()==popA[popIndex]){
                stack.pop();
                popIndex++;
            }
        }
        return stack.empty();
    }
}
