package simple;

import java.util.Arrays;

public class MoveZeroToEnd {
    public static void main(String args[]){
        //Brute Force
        //Create temp array and add all non zero numbers
        //Put the value back to main array from temp array, and fill remaining position with 0
        //SC - O(n)+O(x)+O(n-x) = O(2N) , TC - O(n)

        //Optimal
        //Using two pointers approach.
        //Use two variable, i & j. j will stand where 0 is there, and if next element(i) is non zero, then i & j
        // will be swapped.

        int arr[] = {1,2,0,4,0,0,7,7,5};
        int j=-1;

        for(int i=0;i<arr.length;i++){
            if(arr[i]==0) {
                j = i;
                break;
            }
        }

        for(int i =j+1;i<arr.length;i++){
            if(arr[i]!=0){
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                j++;
            }
        }

        System.out.println(Arrays.toString(arr));

    }
}
