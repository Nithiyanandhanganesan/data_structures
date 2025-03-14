package medium;

public class MaximumSubArraySum {
    //longest subarray that gives maximum sum
    // input : [-2,-3,4,-1,-2,1,5,-3]
    // output : 7   because this is the longest subarray [4,-1,-2,1,5] gives sum of 7

    //brute
    //generate all combination of subarray and take the sum. get the array size of maximum sum.
    //TC: O(n^3)

    //better
    //dont generate all combination.
    //consider your input [-2,-3,4,-1,-2,1,5,-3]
    //take -2 , & sum with -3 . again dont form another subarray of -1,-3,4. instead use the
    // already sum value of -2,-3 calculated in the previous iteratinon.
    // TC: O(n^2)

    //Optimal
    //Using Kadane's Algorithm we can solve this.
    //Kadane's Algorithm is an efficient algorithm used to find the
    // maximum sum subarray (a contiguous subarray) within a one-dimensional numeric array of integers.
    //Step:
    //1. Initialize current_sum = 0, max_sum = very small number (or first element of the array)
    //2. For each element x in the array:
    //   a. current_sum = max(x, current_sum + x)
    //   b. max_sum = max(max_sum, current_sum)
    //3. Return max_sum
    //TC: O(n)

    //Also, think how to get the array which gave that max sum.
    //Google it , using two variable we can solve that.

}
