package com.picture;
import java.util.Scanner;
public class PictureUtil {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入行：");
        int h = sc.nextInt();
        System.out.println("请输入列：");
        int l = sc.nextInt();
        outPutRct(h, l);
    }

    //    打印平行四边形
    public static void outPutRct(int c, int k) {

        for (int i = 0; i < c; i++) {//打印行
            for (int j = 0; j < c - 1 - i; j++) {//打印空格
                System.out.print(" ");//引号中间加空格
            }
            for (int j = 0; j < k; j++) {//打印列
                System.out.print("*");

            }
            System.out.println();//换行
        }

    }
}

