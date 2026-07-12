package Strings.ValidPalindrome;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        String reverse = new StringBuilder(s).reverse().toString();

        if(reverse.equalsIgnoreCase(s)){
            System.out.println("Is palindrome");
        } else {
            System.out.println("No palindrome");
        }
        sc.close();
    }
}
