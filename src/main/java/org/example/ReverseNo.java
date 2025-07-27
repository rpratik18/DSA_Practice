package org.example;

public class ReverseNo
{
    public static void main(String[] args) {
        int no=123450;
        int rem=0,rev=0;
        while(no>0){
            rem=no%10;
            rev=rem+(rev*10);
            no=no/10;
        }
        System.out.println(rev);
    }
}
