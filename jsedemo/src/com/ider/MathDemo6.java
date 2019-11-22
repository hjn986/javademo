package com.ider;
import java.util.Scanner;
public class MathDemo6 {
    public static void main(String[] args){

//        判断输入的自然数是否为质数
//        质数是指只能被1和自身整除的数

        Scanner sc=new Scanner(System.in);

        int m=1;
        while(m==1) {
            System.out.println("----------");
            System.out.println("欢迎使用质数判断小程序");
            int a=sc.nextInt();
            if (a==1||a==2){
                System.out.println("这是一个质数");
            }else{  int num=0;
                for (int i=1;i<=a;i++){
                    if(a%i==0){
                        num++;
                    }
                }
                    if(num==2){
                        System.out.println("这是一个质数");
                    }else{
                        System.out.println("这不是一个质数");
                    }
                }
            System.out.println("----------");
            System.out.println("您还要继续吗？1继续/0不继续");
          }


    }
}
