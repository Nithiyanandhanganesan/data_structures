package medium;

public class NumberAppearsOnlyOnceRestOfThemTwice {

    //INPUT: {1,1,2,3,3,4,4,5,5,6,6}
    //OUTPUT: 2

    //BRUTE
    // TAKE FIRST ELEMENT , AND SEARCH IN ENTIRE ARRAY WHETHER THAT ELEMENT IS THERE.
    // IF ITS THERE, THEN SEARCH WITH NEXT ELEMENT.
    // TC: O(N^2)
    // SC: O(1)

    //OPTIMAL
    // USING XOR WE CAN ACHIEVE WITHIN SINGLE ITERRATION.
    // EG: 1 ^ 1 = 0 , 0 ^ 2 = 2. XOR OF SAME NUMBER WILL BE ZERO. XOR OF 0 WITH ANY NUMBER WILL BE THAT NUMBER
    // TC: o(n)
    public static void main(String[] args) {
       int[] arr = {1,1,2,4,4,5,5,6,6,9,9};
       int xor = 0;
       for(int i=0;i<arr.length;i++){
           System.out.println(xor+ "^"+arr[i] + "=" + (xor ^ arr[i]) );
           xor = xor ^ arr[i];
       }
       System.out.println(xor);
    }
}
