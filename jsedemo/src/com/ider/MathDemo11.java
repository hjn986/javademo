package com.ider;
import java.util.Scanner;
public class MathDemo11 {
    public static void main(String[] args) {
//        判断输入的数字是星期几
       Scanner sc= new Scanner(System.in);
       int a=sc.nextInt();
       if(a>=1&&a<=7){
           System.out.println("今天是星期"+a);
       }else{
           System.out.println("您输入有误");
       }


    }
}
