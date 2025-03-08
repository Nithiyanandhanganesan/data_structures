package medium;

public class LongestSubArrayWithKSum {
    //subarray means contiguous part of the array
    //Input : [1,2,3,1,1,1,1,4,2,3] & K=6
    //So, here we need to find the longest subarray which gives sum of 6.
    //Output: 4 -- becaz [3,1,1,1] sum will be 3 and its the longest subarray which gives sum of 3.

    //Brute :
    //Generate all subarray combination and take sum and take the max length where sub array sum equals K
    //TC: O(n^2)

    //Better:
    //using hashing we can solve
    //TC: o(n log n)

    //Optimal
    //Using 2 pointer approach
    // input [1,2,3,1,1,1,1,4,2,3] & K=6
    // Take first element [1]:       sum = 1 & sum <= K
    // Take first two element [1,2] :   sum = 3 & sum <= K
    // Take first three element [1,2,3]: sum = 6 & sum <= k (sum = k , array size =3)
    // Take first four element [1,2,3,1] : sum = 7 & sum <= K (false)
    // Trim the first element  [2,3,1] : sum = 6 & sum == k (array size = 3)
    // Take next element after trim first element [2,3,1,1]: sum = 7 & sum<= k (false)
    // Trim first two element [3,1,1]:  sum = 6 & sum <=K
    // Take next elemtn [3,1,1,1] : sum = 6 & sum == k (array size = 4)
    // continue till the last element and take max array size where k=6.
    //TC: O(2N)

}