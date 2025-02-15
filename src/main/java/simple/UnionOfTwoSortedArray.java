package simple;

import java.lang.reflect.Array;
import java.util.Arrays;

public class UnionOfTwoSortedArray {

    //BRUTE FORCE :
    //  ITERATE EACH ARRAY AND ADD IT TO SET. SET WILL REMOVE DUPLICATES. ADD THE RESULT OF SET TO ARRAY.
    // TC: O(N1 LOG N) + O (N2 LOG N) + O(N1 +  N2)
    // SC: O(N1+N2) + O(N1+N2)

    //OPTIMAL SOLUTION:
    // USING TWO POINTER APPROACH WE CAN SOLVE THIS PROBLEM.
    // 1. COMPARE FIRST ELEMENT OF THE ARRAY1 WITH FIRST ELEMENT OF ARRAY2.
    // 2. WHICHEVER IS SMALLER INSERT THAT INTO DIFFERENT LIST AND INCREMENT THE POINTER OF THAT LIST.
    // 3. IF ITS EQUAL , THEN TAKE FROM ANY ONE LIST AND INCREMENT POINTERS IN BOTH LIST. 


    //INPUT:
    //  arr1[] = [1,1,2,3,4,4,5]
    //  arr2[] = [1,4,6,7]
    //OUTPUT = [1,2,3,4,5,6,7]
    public static void main(String args[]){

        int arr1[] = {1,1,2,2,3,4,6};
        int arr2[] = {2,2,3,4,5,6,7};
        int arr3[] = new int[100];
        int i=0;
        int j=0;
        int k=0;

        while (i<arr1.length && j<arr2.length){
            if(arr1[i]<=arr2[j]){
                if(k==0){
                    arr3[k] = arr1[i];
                    i++;
                    k++;
                    continue;
                }
                if(arr1[i]!=arr3[k-1]){
                    arr3[k] = arr1[i];
                    k++;
                }
               i++;
            } else if (arr1[i]>arr2[j]){
                if(k==0){
                    arr3[k] = arr2[j];
                    j++;
                    k++;
                    continue;
                }
                if(arr2[j]<arr3[k-1]){
                } else if (arr2[j]>arr3[k-1]){
                    arr3[k] = arr2[j];
                    k++;
                }
                j++;
            }
        }

        while (j<arr2.length){
            if(arr2[j]<arr3[k-1]){
            } else if (arr2[j]>arr3[k-1]){
                arr3[k] = arr2[j];
                k++;
            }
            j++;
        }
        System.out.println(Arrays.toString(arr3));
    }
}
