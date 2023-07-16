package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayBasicOperations {

    public static void main(String[] args){

        //creation of array

        int[] marks = new int[50];

        int[] numbers = {1, 3, 4, 5, 8, 6};

        String[] fruits = {"Mango", "Apple", "Banana"};
//----------------------------------------------------------------------------------//


// Input and output of the array

Scanner scanner = new Scanner(System.in);

// Read the size of the array
System.out.print("Enter the size of the array: ");
int size = scanner.nextInt();

// Create the array
int[] array = new int[size];

// Read the values for the array

System.out.print("Enter a value for the array: ");
for (int i = 0; i < size; i++) {
    array[i] = scanner.nextInt();
}

// Print the array
System.out.println("Array: " + Arrays.toString(array));

    }
    
}
