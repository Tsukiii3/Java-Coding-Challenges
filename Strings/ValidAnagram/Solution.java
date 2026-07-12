package Strings.ValidAnagram;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String t = sc.nextLine();
        String s = sc.nextLine();

        if(s.length() != t.length()){
            System.out.println("No anagrams");
        }

        char[] a1 = t.substring(0).toLowerCase().toCharArray();
        char[] b1 = s.substring(0).toLowerCase().toCharArray();

        Arrays.sort(a1);
        Arrays.sort(b1);

        if(Arrays.equals(a1, b1)){
            System.out.println("Is anagrams");
        } else {
            System.out.println("No anagrams");
        }
        sc.close();
    }
}
