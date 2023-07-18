package Arrays;

public class TargetSums{



    public static int pairsum (int []arr , int target){

        int count = 0;

        for(int i = 0; i < arr.length ; i++){

            for(int j = i+1; j < arr.length ; j++){


                if(arr[i] + arr[j] == target){

                    count ++;

                }
            }
        }
        return count;
    }

    public static int TripleSum(int [] arr , int target){

        int count = 0; 

        for(int i = 0 ; i < arr.length ; i++){

            for(int j = i + 1 ; j < arr.length ; j++){

                for(int k = j + 1 ; k < arr.length ; k++){

                    if(arr[i] + arr[j] + arr[k] == target){

                        count ++;

                    }
                }
            }


        }
return count;

    }

    public static int FindUnique(int [] arr){

        int ans = -1;

        for(int i = 0 ; i < arr.length ; i ++){

            for(int j = i+1 ; j < arr.length ; j++){

                if(arr[i] == arr[j]){
                    arr[i] = -1;
                    arr[j] = -1;
                }
            }
        }

        for(int i = 0 ; i < arr.length ; i++){
            if(arr [i] > 0){
                ans = arr[i];
            }
        }

        return ans;
    }


    public static int Largest(int []arr){

        int largest = Integer.MIN_VALUE;

        for(int i = 0 ; i < arr.length ; i++){

            if(arr[i] > largest){
                largest = arr[i];
            }
        }
        return largest;
    }

    public static int SecondLargest(int[] arr){

        int largest = Largest(arr);

        for(int i = 0 ; i < arr.length ; i ++){

            if(arr[i] == largest){
                arr[i] = Integer.MIN_VALUE;
            }
        }
        
        int secondLargest = Largest(arr);

        return secondLargest;

    }





    public static void main (String []args){

        int [] arr2 =  {4,6,3,5,8,2};
        int [] arr3 = {1,4,5,6,3};
        int [] arr4 = {1,2,2,3,1};
         System.out.println(TargetSums.pairsum(arr2, 7));
         System.out.println(TargetSums.TripleSum(arr3, 12));
        System.out.println(TargetSums.FindUnique(arr4));
        System.out.println(TargetSums.Largest(arr2));
        System.out.println(TargetSums.SecondLargest(arr2));





}
}






// //public class TargetSums{


//     public static void main (String []args){

//        int [] arr2 =  {4,6,3,5,8,2};
//         System.out.println(TargetSums.pairsum(arr2, 7));




//     }






// }