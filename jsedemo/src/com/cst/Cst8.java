package com.cst;
import java.util.Scanner;
public class Cst8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        if(x>=0&x<10){
            System.out.println("它是个1位的数!");
        }
        if(x>=10&x<100){
            System.out.println("它是个2位的数!");
        }
        if(x>=100&x<1000){
            System.out.println("它是个3位的数!");
        }
        if(x>=1000&x<10000){
            System.out.println("它是个4位的数!");
        }
        if(x>=10000&x<100000){
            System.out.println("它是个5位的数!");
        }
        if(x>=100000&x<1000000){
            System.out.println("它是个6位的数!");
        }
        if(x>=1000000&x<10000000){
            System.out.println("它是个7位的数!");
        }
        if(x>=10000000&x<100000000){
            System.out.println("它是个8位的数!");
        }
        if(x>=10000000&x<100000000){
            System.out.println("它是个9位的数!");
        }


    }
}
