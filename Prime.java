package com.day2;

public class Prime {
    public static void funB(int A){

        if(A>1 && A<=100){
            for(int i=1;i<=A;i++)
            {
                if(A%i==0){
                    System.out.println(i);
                }
            }
        }
    }

    public static void main(String[] args) {
        funB(12);
    }
}
