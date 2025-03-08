package medium;

public class SortArrayOfZeroOneTwos {

    // input: [ 0,1,2,0,1,2,1,2,0,0,0,1]
    //brute
    //using any sorting algorithm
    // TC: o(n log n)

    //better
    // count number of 0 , 1 & 2.
    // replicate the count into array
    // TC: O(2n)

    //optimal
    // Dutch National Flag Algorithm - well known sorthing altorithm that efficiently sort an array with
    // three distinct values.
    // this algorithm use three pointers:
    //Low: points to the bounday where 0s should be placed
    //Mid: scan through the array
    //High: Points to the bounday where 2s should be places.
    // initialize pointers : low=0, mid=0 , high =n-1
    // if arr[mid] == 0 , swap arr[mid] and arr[low] and inrement low and mid.
    // if arr[mid] == 1, just increment the mid
    // if arr[mid]== 2 , sway arr[mid] and arr[high], and decrement high
    //TC: o(n)
}
