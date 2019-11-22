package com.ider;
import java.util.Scanner;
public class MathDemo3 {
    public static void main(String[] args){
//        判断输入两个数中的较大数（三目运算符）
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入第一个数：");
        int x=sc.nextInt();
        System.out.println("请输入第二个数:");
        int y=sc.nextInt();
        int a=(x>y)?x:y;
        System.out.println("两数中较大数为："+a);

    }
}
