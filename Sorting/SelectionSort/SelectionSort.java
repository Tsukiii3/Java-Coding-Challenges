package Sorting.SelectionSort;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {5,3,2,1,4,8,7};

        for(int i =0; i < arr.length; i++){
            int menor = i;
            for(int j = i+1; j< arr.length; j++){
                if(arr[j] < arr[menor]){
                    menor = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[menor];
            arr[menor] = temp;
        }
          for(int n : arr){
            System.out.println(n + " ");
    }
}
}
