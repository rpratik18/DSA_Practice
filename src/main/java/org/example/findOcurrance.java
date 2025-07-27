package org.example;

public class findOcurrance {

    public static void main(String[] args) {
        int no=1385757879;
        int count=0;
        int rem=0;
        while(no>0){
            rem=no%10;
            if (rem==7){
                count++;
            }
            no=no/10;
        }
        System.out.println(count);
    }
}
