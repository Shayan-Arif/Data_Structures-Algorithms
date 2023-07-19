package Arrays;

import java.util.Arrays;

public class TwoPointers{

    //reversing Array



    public static void swapinarray(int [] arr, int i , int j){

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }

    public static void reverse(int [] arr){

        int i = 0 , j = arr.length-1;

        while(i < j){

            swapinarray(arr, i , j);
            i++;
            j--;

        }
    }




    public static void main(String []args){

        int[] arr1 = { 5,4,3,2,1};

        reverse(arr1);
        System.out.println(Arrays.toString(arr1));



    }
}