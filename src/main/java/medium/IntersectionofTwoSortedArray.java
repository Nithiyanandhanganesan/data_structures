package medium;

import java.util.Arrays;

public class IntersectionofTwoSortedArray {

    //BRUTE FORCE
    // CHECK EACH ELEMENT IN ARRARY 1 AGAINST ARRAY 2. IF IT MATCHES , THEN INSERT THAT INTO RESULT ARRAY.
    // TC: O(N1 x N2)
    // SC: O(N)

    //OPTIMAL
    // CHECK FIRST ELEMENT OF EACH ARRAY.
    // IF ARR1 FIRST ELEMENT IS LESS THAN ARR2 FIRST ELEMENT , JUST INCREMENT THE POINTER IN ARR1.
    // IF ARR1 ELEMENT EQUALS ARR2, THEN PUT THE RESULT INTO RESULT ARRAY AND INCREMENT POINTER OF BOTH ARR1 & ARR2.
    // TC: O(N1 + N2)
    // SC: O(N) - FOR STORING THE RESULT NOT FOR SOLVING THE PROBLEM.
    public static void main(String[] args) {

        int arr1[] = {1,2,2,3,3,4,5,6};
        int arr2[] = {2,3,3,5,6,6,7};
        int length = arr1.length<arr2.length? arr1.length : arr2.length;
        int arr3[] = new int[length];
        int i=0;
        int j=0;
        int k=0;

        while(i< arr1.length && j < arr1.length){
            if(arr1[i] < arr2[j]){
                i++;
            } else if(arr1[i]==arr2[j]){
                arr3[k]=arr1[i];
                i++;
                j++;
                k++;
            }
        }

        System.out.println(Arrays.toString(arr3));

    }
}
