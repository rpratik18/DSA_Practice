package org.example;

import java.util.Scanner;

public class Fibono {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int input=sc.nextInt();
        int count=2;
        int priv=0;
        int next=1;
        int tmp=0;
        while(count<=input){
           tmp=priv+next;
           priv=next;
           next=tmp;
           count++;

        }
        System.out.println(tmp);
    }

}
