package Arrays.ContainsDuplicate;

import java.util.HashMap;
import java.util.Map;

public class Solution{
    public static void main(String[] args) {
        int[] nums = {1,2,3,1,4,5};

        Map<Integer, Integer> vistos = new HashMap<>();

        for(int n : nums){
            if(vistos.containsKey(n)){
                System.out.println(false);
            }
        }
        System.out.println(true);
    }
}