package com.picture;
import java.util.Scanner;
public class PictureUtil2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println( "请输入行:");
        int h=sc.nextInt();
        System.out.println("请输入列:");
        int l=sc.nextInt();
//        打印倒立的三角形
        for (int m = 1; m <= h; m++) {
            //打印空格
            for (int n = 0; n <= m; n++) {
                System.out.print(" ");
            }
            //打印*
            for (int x = 1; x <= l -2 * (m - 1); x++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
