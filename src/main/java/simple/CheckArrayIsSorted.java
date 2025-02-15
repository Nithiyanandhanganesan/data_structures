package simple;

public class CheckArrayIsSorted {
    public static void main(String[] args){

        //There is no Brute force & Optimal for this.
        //Only one solution is there.
        // Compare current element with next element, if its greater, then move to next element,
        // otherwise array is not sorted.
        //TC - O(n)
        //SC - O(1)

        int arr[] = {1,2,3,3,5};
        boolean sort = true;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>=arr[i-1]){
                sort = true;
            } else {
                sort= false;
                break;
            }
        }
        System.out.println(sort);
    }
}
