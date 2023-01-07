package Arrays;

public class Q4_LinearSearch {

    public static int linearSearch(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return i;
            }
        }
        return -1;
    }

        public static void main(String[] args) {
            int[] array = {1, 2, 3, 4, 5};
            int key = 3;

            int index = linearSearch(array, key);
            if (index == -1) {
                System.out.println("Value not found");
            } else {
                System.out.println("Value found at index " + index);
            }
        }
    }