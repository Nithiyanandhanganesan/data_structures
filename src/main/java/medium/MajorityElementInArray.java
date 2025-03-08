package medium;

public class MajorityElementInArray {
    // Find number of element appears more than n/2 in the array.
    // Input : [2,2,3,3,1,2,2] , size of the array is 7. so, 7/2 = 3.
    // We need to find element that appears more than 3 times
    // Output = 2 is the element , it appears 4 times.

    //Brute force
    // Take first element and check with all other element to find how many times it got repeated.
    // O(n^2)

    //Better
    // Hashing:
    // Add value to map , and increment the count. key will be value and value will be it count.
    // TC: O(n log n) + O(n)

    //Optimal
    // Moore's Voting Algorithm - efficient algorithm to find the majority element.
    // initialize the candidate variable and count variable.
    // traverse the array:
    // if count ==0 , set the current element as candidate and set count = 1
    // if the current element is same as candidate , increase count
    // otherwise decrease count
    // take the count of final candidate and check whether its count is greater than n/2
    // TC: o(n)
}
