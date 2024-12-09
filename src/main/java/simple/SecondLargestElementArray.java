package simple;

public class SecondLargestElementArray {
    public static void main(String[] args){

        //BRUTE FORCE
        // SORT THE ARRAY AND TAKE [N-2] WILL GIVE THE SECOND LARGEST ELEMENT.
        // TC - O(N Log N) - for sorting the array & O(n) for search if array is like this {1,5,5,5,5,5}
        // So, total TC =  O(N Log N) + O(N)
        // SC - O(1)

        //OPTIMAL APPROACH
        //CREATE TWO VARIABLE LARGEST = ARR[0] AND SEC_LARGEST=-1.
        //COMPARE EACH ELEMENT WITH LARGEST , IF ITS HIGH MAKE THAT LARGEST AND MOVE LARGEST VALUE TO SECOND_LARGEST
        // IF VALUE IS NOT GREATER THAN LARGEST, STILL COMPARE WITH SECOND LARGEST AND IF ITS HIGH
        //   , THEN REPLACE SECONDD LARGEST WITH NEW VALUE. BECAUSE THAT VALUE LIES BETWEEN LARGEST AND SECOND_LARGEST.
        // TC - O(N) - iterating the array only once.
        // SC - O(1) - not creating they new array.


        int arr[] = {1,2,4,7,7,5};
        int largest = arr[0];
        int sec_largest = -1;

        for(int i=1 ; i<arr.length;i++){
           if(arr[i]>largest){
               sec_largest = largest;
               largest = arr[i];
           } else if(arr[i]<largest && arr[i]>sec_largest){
               sec_largest=arr[i];
           }
        }
        System.out.println("Second Largest:"+ sec_largest);

    }
}
