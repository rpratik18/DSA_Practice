package org.example;

import java.util.Scanner;

public class PrimeOrNot {


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int no=sc.nextInt();
        boolean op=true;
         op=primeORnot(no);
        System.out.println(op);
    }
    public static boolean primeORnot(int no){
        if (no<2)
            return false;

        int count=2;
        while (count<=Math.sqrt(no)){
            if(no%count==0){
                return false;
            }
            count++;

            System.out.println();
            
        }
        return true;
    }
}
