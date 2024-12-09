package simple;

public class LargestElementArray {
    public static void main (String[] args){
        int arr[] = {1,2,5,4,3};

        //BRUTE FORCE.
        //  - SORT THE ARRAY
        //  - TAKE THE LAST ELEMENT IN THE ARRAY
        //  - TC -> O(n Log n) -> any optimal sorting
        //  - SC - O(1)  because we are just sorting existing array not creating any new array.

        //Optimal Solution
        // create variable Largest and assign first value arr[0]
        //   & compare each element if its higher, the store that value in largest variable.
        // - TC - O(n)
        // - SC - O(1)

        //Optimal Code
        int largest = arr[0];
        for ( int i=1 ; i <arr.length; i++){
            if(arr[i]> largest){
                largest = arr[i];
            }
        }
        System.out.println("Largest element is:"+largest);
    }
}
