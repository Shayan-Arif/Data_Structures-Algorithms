package Arrays;

public class Q8_PairsOfArray {

    public static void pairs(int... array){

        int totalpairs = 0;

        for(int i = 0; i < array.length ; i++){

            for(int j = 0 ; j < array.length ; j++){

                System.out.print("(" + array[i]+","+ array[j]+")   ");

                totalpairs++;

            }
            System.out.println();

        }

        System.out.println("The total number of pairs are == "+ totalpairs);
    }

    public static void main(String[] args) {


        int array [] = {1,3,6,8,11,14,15,18};

        pairs(array);


    }
}
