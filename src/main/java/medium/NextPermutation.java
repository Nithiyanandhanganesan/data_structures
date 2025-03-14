package medium;

public class NextPermutation {
    //populate array in all combination and sort it and give the next value after the input value
    //input : [3,1,2]
    //combination:
    // [1,2,3]
    // [1,3,2]
    // [2,1,3]
    // [2,3,1]
    // [3,1,2]
    // [3,2,1]
    // output: [3,2,1]

    //If input itself is [3,2,1], then [1,2,3] will be the output. fallback to next in round fashion.

    //Brute
    //generate all array, sort those & do linear search and take the next element.
    //Use recursion to populate all combination.
    //


    //Optimal
    //find longer prefix match . Iterate from last element
    //   and if there is dip(value decrease) that's the breaking point a[i]<a[i+1]
    //find element which si greate and i from i+1 to n and minimal from i+1 to n.
    //sort the element from i+1 to n.

    //input : [2,1,5,3,0,0]
    // breaking point is 1, becaz when we iterate from last position, 1 is decreasing.
    //so, find the element which is greater than 1 and min from element after 1 till end. So, its 3.
    //array becomes [ 2,3,5,1,0,0]
    //Now sort all the elements after 3 , so its [2,3,0,0,1,5] which is the output.
    //TC: O(3N)




}
