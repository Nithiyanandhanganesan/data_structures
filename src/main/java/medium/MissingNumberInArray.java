package medium;

public class MissingNumberInArray {

    //INPUT
    // ARR[] = [1,2,4,5] , N=5
    // OUTPUT : 3
    //BRUTE FORCE
    // TAKE 1, SEARCH IN ENTIRE ARRAY, IF ITS THERE THEN SEARCH FOR 2 IN ENTIRE ARRAY AND GO ON TILL N.
    // TC : O(N^2)
    // SC : O(1)

    //BETTER
    // USING HASING WE CAN SOLVE.
    // TAKE THE VALUE FROM ARRAY AND INSERT INTO HASH ARRRY
    // EG: INPUT [1,2,4,5] , N=5
    // HASH ARRAY [0,1,2,0,4,5] . WHEREEVER 0 , THAT NUMBER IS MISSING.
    // TC: O(N) + O(N)
    // SC: O(N)

    //OPTIMAL
    //USING SUM WE CAN ACHIEVE. SUM OF N NUMBER = N (N+1) / 2
    //ABOVE FORMULA : 1 TO 5 WILL BE 15, then sum the element present in the input array.
    // difference is the number which IS MISSING.
    // here sum of input array is 12. so missing number is 3.
    // TC: O(N)
    // SC: O(1)
    public static void main(String[] args) {
        int[] arr = {1,2,4,5};
        int n=5;
        int sum = (n*(n+1)) / 2;
        int arrsum=0;
        for(int i=0;i<arr.length;i++){
            arrsum = arrsum + arr[i];
        }
        System.out.println(sum=arrsum);
    }
}
