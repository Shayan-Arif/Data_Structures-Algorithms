package Arrays;

import java.util.Arrays;

public class Q5_LargestAndSmallestInTheArray {

    //Finding largest by linear searching it has a time complexity of O(n)
    public static int largest(int... array){

        int large = Integer.MIN_VALUE;

        for(int i = 0; i <array.length ; i++) {
            if (array[i] > large){
                large = array[i];
            }
        }
        return large;
    }

    public static int smallest(int... array){

        int small = Integer.MAX_VALUE;

        for(int i = 0; i <array.length ; i++) {
            if (array[i] < small){
                small = array[i];
            }
        }
        return small;
    }

    //Finding largest by sorting it has a time complexity of O(nlogn)

    public static void largestandsmallest(int... array){

        Arrays.sort(array);

        System.out.println("The largest element is ==  " + array[array.length-1]);
        System.out.println("The smallest element is ==  " + array[array[0]]);


    }


    public static void main(String[] args) {

        int [] array = {1,3,6,2,1,7,8,5,112,66,555,44};

        System.out.println("The largest number == " + largest(array));
        System.out.println("The smallest number == " + smallest(array));

        System.out.println();

        largestandsmallest(array);


    }

}
