package Stack.BaseballGame;

import java.util.Stack;

public class Solution {
    public static void main(String[] args) {
        String[] operation = {"5", "2", "C", "D", "+"};

        Stack<Integer> stack = new Stack<>();

        for(String op : operation){

            if(op.equals("C")){
                stack.pop();

            } else if(op.equals("D")){
                int lastScore = stack.peek();
                stack.push(lastScore * 2);

            } else if(op.equals("+")){
                int last = stack.pop();
                int previous = stack.peek();

                stack.push(last);
                stack.push(last + previous);

            } else {
                stack.push(Integer.parseInt(op));
            }
        }
        int total = 0;

        for(int score : stack){
            total += score;
        }
        System.out.println("Total score: "+  total);
    }
}
