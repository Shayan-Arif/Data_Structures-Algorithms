package Arrays;

public class Q3_UpdatingArray {

    public static void update(int... arr){

        for(int i = 0 ; i < arr.length ; i++){

            arr[i] = arr[i]*arr[i];

        }

    }

    public static void main(String[] args) {

        int[] array = {2,4,6};

        update(array);

        for(int i = 0; i < array.length ; i++){
            System.out.println(array[i]);
        }

    }
}
