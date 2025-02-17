package medium;

public class MaximumConsecutive {

    //input: arr[] = {1,1,0,1,1,1,0,1,1}
    //output = 3

    //optimal
    //check first number, inrement counter to 1 & max = 1.
    // if next element same as first element , then increment the counter and max.
    // if next elemtn is not same as frist elemnt. reset the counter and let the max remains.
    // when counter is greater than max, update the max with counter.
    //TC: o(n)
    // SC: o(1)
    public static void main(String[] args) {
        int[] arr = {1,1,0,1,1,1,0,1,1};
        int counter=1;
        int max=1;

        for(int i=1;i<arr.length;i++){
            if(arr[i-1]==arr[i]){
                counter++;
                if(counter>max){
                    max = counter;
                }
            } else {
                counter=1;
            }
        }

        System.out.println(max);

    }
}
