package Arrays;

public class Q9_SubArrays {

    public static void subarray(int... array){

        int total = 0;

        for(int i = 0 ; i < array.length ; i++){

            for(int j = i ; j < array.length ; j++){

                for(int k = i ; k <= j ; k++){
                    System.out.print(array[k]+"  ");

                    total++;
                }
                System.out.println();
            }

            System.out.println();
        }

        System.out.println("The total elements are == " + total);

    }


    public static void main(String[] args) {

        int array [] = {1,3,6,8,11,14,15,18};

        subarray(array);


    }
}
