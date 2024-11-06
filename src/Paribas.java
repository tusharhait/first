/*

Write a function that takes in a non-empty string and that returns a boolean representing whether the
string is a palindrome.
A palindrome is defined as a string that's written the same forward and backward.
Note that single-character strings are palindromes.
Time Complexity
O(n)

Space Complexity
O(1)*/

public class Paribas {

    public static void main(String[] args){
        String a= "new";
        String b = new String("new");
        System.out.println(a.equals(b));
    }
    public boolean isPalindrome(String input){
        if(input.length()==1){
            return true;
        }
//        int a = 0;
//        int b = input.length()-1;
//        while(a<b){
//
//        }
        String a= "new";
        String b = new String("new");
        System.out.println(a.equals(b));
        for(int i=0;i<input.length();i++){

        }
        return false;
    }
}
