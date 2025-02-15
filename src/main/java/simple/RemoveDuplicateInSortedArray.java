package simple;

import java.util.Arrays;

public class RemoveDuplicateInSortedArray {
    public static void main(String[] args){

        //BRUTE FORCE
        // CREATE SET DATASTRUCTURE AND PUT ALL VALUE IN ARRAY TO SET SINCE SET WILL NOT ALLOW DUPLICATES.
        // TC = O(N LOG N) [FOR ADDING ELEMENT TO SET] + O(N) [ITERATING]
        // SC = O(N) [BECUASE WE ARE CREATING NEW SET]

        //OPTIMAL APPROACH.
        //COMPARE FIRST ELEMENT WITH NEXT ELEMENT, IF ITS EQUAL THEN MOVE TO NEXT ELEMENT. IF ITS NOT EQUAL THEN ITS NOT DUPLICATED.
        // TC = O(N)
        // SC = O(1) - BECAUSE WE ARE NOT USING ANY OTHER SET/ARRAY.

        int arr[] = {1,1,1,2,2,2,3,3};
        int index=0;
        for(int j=1;j<arr.length;j++){
            if(arr[j]!=arr[index]){
                arr[index+1]=arr[j];
                index++;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
