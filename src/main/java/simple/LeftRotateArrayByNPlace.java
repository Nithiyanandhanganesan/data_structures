package simple;

import java.util.Arrays;

public class LeftRotateArrayByNPlace {
    public static void main(String[] args){
        //input  {1,2,3,4,5} , D=2
        //output {3,4,5,1,2}
        //BRUTE FORCE
          //IF D=2, THEN TAKE THE FIRST TWO ELEMENT AND STORE TEMP VARIABLE.
          //MOVE REST ALL ELEMENT BY TWO POSITION AND ASSIGN FIRST TWO ELEMENT TO THE END.
          //TC - O(D) [create temp array] + O(N-D) [iterating rest of them] + O(D) [put the temp array back]
          //SC - O(D) [creating temp array]


        int arr[] = {1,2,3,4,5,6,7};
        int d=2;
        int temp[] = new int[d];
        for(int i=0;i<d;i++){
            temp[i] = arr[i];
        }

        for(int i=d;i<arr.length;i++){
            arr[i-d] = arr[i];
        }

        for(int i=arr.length-d;i<arr.length;i++){
            arr[i] = temp[i - (arr.length -d)];
        }
        System.out.println(Arrays.toString(arr));

    }
}
