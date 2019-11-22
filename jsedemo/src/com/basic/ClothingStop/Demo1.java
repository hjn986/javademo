package com.basic.ClothingStop;
import java.util.Scanner;
public class Demo1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        准备开店
        Clothing c1= new Clothing();
        Clothing c2= new Clothing();
        Clothing c3= new Clothing();
//        定义商品的属性（初始化对象）
         c1.name="卫衣";
         c1.price=66;
         c2.name="裙子";
         c2.price=88;
         c3.name="鞋子";
         c3.price=99;
//         准备货架（数组）
        Clothing[] arr=new Clothing[6];
        arr[0]=c1;
        arr[1]=c2;
        arr[2]=c3;


        int n=1;
        while(n==1){
        System.out.println("***************");
        System.out.println("欢迎光临我的小店");
        System.out.println("请选购以下商品：");

            //        遍历数组，取出所有商品并展示
            for(int i=0;i<arr.length;i++){
                if(arr[i]!=null){
                    System.out.println("商品序号："+i   +"\t商品名称："+arr[i].name+   "\t商品价格："+arr[i].price);
                }
            }
//顾客选购
            System.out.println("请选择商品序号：");
            int m=sc.nextInt();
//          输出顾客选购的商品
            if(m>=0&&m<arr.length){
                System.out.println("商品序号："+m  +"\t商品名称："+arr[m].name+   "\t商品价格："+arr[m].price);
            }else{
                System.out.println("您选择的商品本店暂无");
            }
            System.out.println("您还要继续选购吗？1继续，0不继续");
        }

    }
}
