package medium;

public class TwoSumProblem {
    //Input: [2,6,5,8,11] , target = 14
    // we need to find , what are the two element that we can sum to get to target.

    // brute:
    // take first element , and sum all each other element whether it can sum to the target.
    // TC: O(n^2)

    //better
    // Hashing
    // Lets say first element is 2, so we need 12 to get the target 14. check in hashmap whether 12 is there.
    // Add all element in the array to hashmap where element is key and index is value.
    // TC: O(n log n) + o (n)

    //optimal
    // using two pointer approach
    // better solution is good. if we want to achieve without using map, then only use this .
    //  sort the input array.
    // sum first and last element.
    // if sum > target, then reduce one element from the right.
    // if sum < target, then increase one element from the left.
    // use this solution only when they ask whether the target (14) is possible or not.
    // if they ask about index, then hashing is the best way. becaz we sort the element.
    // so we need to keep track of index to give the index back.
    // TC: O(n log n) + o (n)
}
