package com.ider;
import java.util.Scanner;
public class MathDemo7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        pds(m,n);

    }

    //       调用方法 计算两个数的和、差、积、商、取模
    public static void pds(int a,int b){
        int q=a+b;
        int w=a-b;
        int e=a*b;
        int r=a/b;
        int y=a%b;
        System.out.println(q);
        System.out.println(w);
        System.out.println(e);
        System.out.println(r);
        System.out.println(y);

    }
}
