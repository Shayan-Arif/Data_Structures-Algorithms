package Arrays;

import java.util.Arrays;

public class TwoPointers{

    //reversing Array



    public static void swapinarray(int [] arr, int i , int j){

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }

    public static void reverse(int [] arr, int i , int j){

        while(i < j){

            swapinarray(arr, i , j);
            i++;
            j--;

        }
    }

    public static void rotateInPlace(int [] arr , int k){

        int n = arr.length;
        k = k % n ;

        reverse(arr , 0 , n-k-1);
        reverse(arr, n-k, n-1);
        reverse(arr, 0, n-1);



    }



    public static void main(String []args){

        int[] arr1 = { 5,4,3,2,1};

        reverse(arr1, 0 , arr1.length-1);
        System.out.println(Arrays.toString(arr1));

        int [] arr2 = {1,2,3,4,5,6,7};

        rotateInPlace(arr2, 8);
        System.out.println(Arrays.toString(arr2));



    }
}