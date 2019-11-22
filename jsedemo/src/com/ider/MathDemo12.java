package com.ider;
import java.util.Scanner;
public class MathDemo12 {
    public static void main(String[] args) {
//        判断输入的月份是什么季节
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(a==3|a==4|a==5){
            System.out.println("这是春天");
        }else if(a==6|a==7|a==8){
            System.out.println("这是夏天");
        }else if(a==9|a==10|a==11){
            System.out.println("这是秋天");
        }else{
            System.out.println("这是冬天");
        }

    }
}
