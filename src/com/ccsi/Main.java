package com.ccsi;

public class Main {

    public static void main(String[] args) {
	    int x=1;
        System.out.println(isPalindrome(x));
    }
    //Determine whether an integer is a palindrome.Do this without extra space.
    public static boolean isPalindrome(int x){
        if(x<0)return false;                      //判断是否为负数
        int rev=0;
        int temp=x;
        while(x!=0){
            rev=rev*10+x%10;
            x/=10;
        }
        return rev==temp;
    }
}
