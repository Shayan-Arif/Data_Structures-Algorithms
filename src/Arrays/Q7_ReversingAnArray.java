package Arrays;

import java.util.Arrays;

public class Q7_ReversingAnArray {

    public static void reverse (int... array){

        int start =0;
        int end = array.length-1;

        while(start<=end){

            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;

            start++;
            end--;

        }

    }

    public static void main(String[] args) {

        int array [] = {1,3,6,8,11,14,15,18};

        reverse(array);

        System.out.println(Arrays.toString(array));


    }
}
