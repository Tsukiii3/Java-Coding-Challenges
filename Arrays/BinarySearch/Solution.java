package Arrays.BinarySearch;

public class Solution {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};

        int target = 5;
        int inicio=0;
        int fim = arr.length -1;

        while(inicio <= fim){

            int mid = inicio + (fim- inicio) /2;

            if(arr[mid] == target){
                System.out.println(mid);
                return;
            } else if (arr[mid] < target){
                inicio = mid +1;
            } else {
                fim = mid -1;
            }
        }
        System.out.println(-1);
    }
}
