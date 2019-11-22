package com.ider;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;
public class MathDemo13 {
    public static void main(String[] args) {
 /*       判断输入的成绩等级
（	90=<A<=100	80=<B<90	  70=<C<80	60=<D<70 	  其它E）
        分别用if语句和switch语句完成*/
 Scanner sc=new Scanner(System.in);
        System.out.println("请输入成绩：");
 int a=sc.nextInt();
/*
 if(a>=90&a<=100){
     System.out.println("A");
 }else if(a>=80&a<90){
         System.out.println("B");
 }else if(a>=70&a<80){
            System.out.println("C");
        }else if(a>=60&a<70){
            System.out.println("D");
        }else{
            System.out.println("E");
        }
*/


switch(a/10){
    case 10:
        System.out.println("A");
        break;
    case 9:
        System.out.println("A");
    case 8:
        System.out.println("B");
    case 7:
        System.out.println("C");
    case 6:
        System.out.println("D");
    default:
        System.out.println("E");
}

    }
}
