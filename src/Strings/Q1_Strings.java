package Strings;

public class Q1_Strings {

    public static void printLetters(String str){

        for(int i = 0 ; i < str.length(); i++){
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }


    public static void main(String[] args) {

        //Creation of strings
        //Strings are IMMUTABLE
/*
        char[] str= {'a','b','c'};
        String str1 = "abcd";
        String str2 = new String("abcd");*/

        //Input in Strings

        /*Scanner console = new Scanner(System.in);
        String name = console.next(); //cant accept the word after spaces
        System.out.println(name);

        Scanner console1 = new Scanner(System.in);
        String fatherName = console1.nextLine(); // can accept the string after space aswell.
        System.out.println(fatherName);
*/

        //finding length of strings

        /*
        String fullname = "Muhammad Shayan";
        System.out.println("The length of string is == "+fullname.length());
        */

        //Concatenation

        String fname = "Shayan";
        String lname = "Arif";
        String Fullname = fname + " " + lname;
        System.out.println(Fullname);

        // finding character by indexes

        System.out.println(Fullname.charAt(0));
        System.out.println(Fullname.charAt(1));
        System.out.println(Fullname.charAt(2));

        printLetters(Fullname);

    }



}
