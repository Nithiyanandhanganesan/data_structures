package simple;

import java.util.Arrays;

public class LeftRotateArrayByOnePlace {
    public static void main(String[] args){
        //input  {1,2,3,4,5}
        //output {2,3,4,5,1}
        //ONLY OPTIMAL SOLUTION
          // ASSIGN ARR[0] TO TEMP VARIABLE , MOVE ONE PLACE A HEAD AND ASSIGN , AND ASSIGN ARR[N] = ARR[0]
          //TC - O(N)
          //SC - O(1)

        int arr[] = {1,2,3,4,5};
        int temp = arr[0];
        for(int i=1;i<arr.length;i++){
            arr[i-1] = arr[i];
        }
        arr[arr.length-1]=temp;
        System.out.println(Arrays.toString(arr));
    }
}
