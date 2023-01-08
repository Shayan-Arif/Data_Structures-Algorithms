package Strings;

public class Q2_Palindrome {

    public static boolean isPalindrome(String str){

        for(int i = 0 ; i < str.length()/2 ; i++){

            if(str.charAt(i) != str.charAt(str.length()-1-i)){

                return false;

            }

        }
        return true;
    }



    public static void main(String[] args) {

        String str = "racecar";
        String str1 = "noon";
        String str2 = "shayan";

        System.out.println(isPalindrome(str));
        System.out.println(isPalindrome(str1));
        System.out.println(isPalindrome(str2));

    }
}
