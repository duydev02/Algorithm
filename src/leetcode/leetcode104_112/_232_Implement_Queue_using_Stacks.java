package leetcode.leetcode104_112;

import java.util.Stack;

public class _232_Implement_Queue_using_Stacks {
    Stack<Integer> pushS = new Stack<>();
    Stack<Integer> popS = new Stack<>();

    public _232_Implement_Queue_using_Stacks() {

    }

    public void push(int x) {
        pushS.push(x);
    }

    private void convertPushSToPopS() {
        int size = pushS.size();
        for (int i = 0; i < size; i++) {
            Integer top = pushS.pop();
            popS.push(top);
        }
    }

    public int pop() {
        if (popS.isEmpty()) {
            convertPushSToPopS();
        }
        return popS.pop();
    }

    public int peek() {
        if (popS.isEmpty()) {
            convertPushSToPopS();
        }
        return popS.peek();
    }

    public boolean empty() {
        return pushS.isEmpty() && popS.isEmpty();
    }

    public static void main(String[] args) {
        _232_Implement_Queue_using_Stacks myQueue = new _232_Implement_Queue_using_Stacks();
        myQueue.push(1); // queue is: [1]
        myQueue.push(2); // queue is: [1, 2] (leftmost is front of the queue)
        System.out.println(myQueue.pushS.toString());
        System.out.println(myQueue.peek()); // return 1
        System.out.println(myQueue.pop()); // return 1, queue is [2]
        System.out.println(myQueue.empty()); // return false
        System.out.println(myQueue.pushS.toString());
        System.out.println(myQueue.popS.toString());
    }
}
