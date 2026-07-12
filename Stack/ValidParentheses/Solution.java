package Stack.ValidParentheses;

public class Solution {
    public static void main(String[] args) {
        String st = "( () () )";

        int cont = 0;

        for(char c : st.toCharArray()){
            if(c == '(') cont++;
            if(c == ')') cont--;
            if(c < 0){
                System.out.println(false);
                return;
            }
        }
         System.out.println(cont == 0);
    }
}
