package com.picture;
import java.util.Scanner;
public class PictureUtil1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("请输入行：");
        int h=sc.nextInt();
        System.out.println("请输入列：");
        int l=sc.nextInt();
        outPutRct(h,l);
    }
//    打印矩形
    public static void outPutRct(int c,int k){
        for(int i=0;i<c;i++){
            for(int j=0;j<k;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
