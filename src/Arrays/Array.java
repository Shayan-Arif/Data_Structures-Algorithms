package Arrays;

class ArraysExample{

    // Calculate the sum of all the elements in an array -- arr = {1,2,3,4,5} -- 15

    public static int sumOfArray (int [] arr){

        int sum = 0;

        for(int i = 0 ; i < arr.length; i++){
            sum = sum + arr[i];
        }

        return sum;
    }

    // Calculate the maximum value in an array -- arr = {5,76,77,3,2,66} -- 77

    public static int maxOfArray (int [] arr){

        int max = arr[0];

        for(int i = 1 ; i < arr.length ; i++){

            if(arr[i]>max){
                max = arr[i];
            }
        }

        return max;
    }

    // Linear search

    public static int linearSearch(int [] arr , int key){


        for(int i = 0 ; i < arr.length; i++){

            if(arr[i] == key ){
                return i;
            }

        }

    return -1;
    }


    // Deep Copy
  static void cloneArray(){
        int a[] =  { 1, 4, 7, 9 };

        int n = a.length;
        int b[] = a.clone();

        b[0] = 5;

        System.out.println("Original array ");
        for (int i = 0; i < n; i++)
            System.out.print(a[i] + " ");

        System.out.println("\nCloned Array ");
        for (int i = 0; i < b.length; i++)
            System.out.print(b[i] + " ");

    }


    static int CountOccurances (int [] arr , int key ){

        int count = 0;

        for(int i = 0 ; i < arr.length; i++){

            if(arr[i] == key){
                count ++;
            }

        }

        return count;

    }


    public static int LastOccurance (int[] arr , int key ){

        int index = -1;

        for(int i = 0 ; i < arr.length ; i++){

            if(arr[i] == key ){

                index = i;

            }


        }


return index;
    }

    //count the number of elements strictly greater than the value x 


    public static int StrictlyGreaterOccurances (int [] arr , int key){

        int count = 0 ;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] > key ){
                count ++;
            }
        }


        return count;


    }


}


class Main{

    public static void main(String[] args){



        int arr [] = {1,2,3,4,5};
        int arr1 [] = {5,76,77,3,2,66,3,3,5};

        //System.out.println(ArraysExample.sumOfArray(arr));
        //System.out.println(ArraysExample.maxOfArray(arr1));
        //System.out.println(ArraysExample.linearSearch(arr1, 656));
        //ArraysExample.cloneArray();
        //System.out.println(ArraysExample.CountOccurances(arr1, 0));
        //System.out.println(ArraysExample.LastOccurance(arr1, 3));
        System.out.println(ArraysExample.StrictlyGreaterOccurances(arr1, 20));





 
    }



}