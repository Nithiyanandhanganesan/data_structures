package medium;

public class RearrangeArrayBySign {
    //array should contain positive and negative element.
    //output contains one positive, one negative followed by same pattern.
    //input: [3,1,-2,-5,2,-4]
    //output: [3,-2,1,-5,2,-4]

    //brute
    //Take positive element in one temp array and negative value in one temp array.
    //Iterate above two temp array and add to final array.
    //TC: O(n) + O(n)
    //SC: O(n/2) + O(n/2) = O(n)

    //Optimal
    //all positive element will be in the odd index.
    //all negative element will be in the even index.
    //Keep two pointers , pos & neg. First take first element if its positive  ,
    // then increment the pointer to two position.
    //Take next positive element and place it in the new pos pointer position.
    //Similarly do it for negative pointer.
    //Tc: O(n)
    //SC: O(n)
    //This optimal solution will work only if number of positive & negative element in array are equal.
    //Otherwise we have to fallback to brute force solution.
}
