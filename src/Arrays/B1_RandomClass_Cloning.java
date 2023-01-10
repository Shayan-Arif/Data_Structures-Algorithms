package Arrays;

import java.util.Random;

public class B1_RandomClass_Cloning {

    public static int[] random(int capacity , int length){

        Random ran = new Random();

        int [] a = new int[capacity];


        for(int i = 0 ; i < a.length ; i++){

            a[i] = ran.nextInt(length);
        }
        return a;
    }

    public static void print(int[] array){
        for(int i = 0; i < array.length ; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int [] a = random(10, 500);

        int [] copy = a.clone();

        print(a);
        print(copy);

        copy [3] = copy[2] = copy [1] = 15500;

        print(copy);


    }





}
