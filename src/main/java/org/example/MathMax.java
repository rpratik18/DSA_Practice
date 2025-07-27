package org.example;

import java.util.Scanner;

public class MathMax {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        int b=sc.nextInt();

        System.out.println("max amount is "+Math.max(a,b));
    }
}
