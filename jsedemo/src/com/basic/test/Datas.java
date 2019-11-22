package com.basic.test;

public class Datas {
    String category;//数据类型
    String yz;//原始值
    String xz;//新的值
//    无参构造方法
    public Datas(){

    }
//    有参构造方法
    public Datas(String category,String yz,String xz){
        this.category=category;
        this.yz=yz;
        this.xz=xz;
    }

    public static void main(String[] args) {
        Datas d=new Datas("生肖","鸡","苏");
        Datas d2=new Datas("生肖","马","顾");
        Datas d3=new Datas("生肖","羊","夏");
        Datas d4=new Datas("生肖","兔","陌");
        Datas d5=new Datas("生肖","龙","夜");
        Datas d6=new Datas("生肖","鼠","上官");
        Datas d7=new Datas("生肖","猪","慕");
        Datas d8=new Datas("生肖","猴","楚");
        Datas d9=new Datas("生肖","蛇","陆");
        Datas d10=new Datas("生肖","狗","程");
        Datas d11=new Datas("生肖","牛","浴");
        Datas d12=new Datas("生肖","虎","玉");
        System.out.println(d.yz);
        System.out.println(d.xz);

        System.out.println(d2.yz);
        System.out.println(d2.xz);

        System.out.println(d3.yz);
        System.out.println(d3.xz);

        System.out.println(d4.yz);
        System.out.println(d4.xz);

        System.out.println(d5.yz);
        System.out.println(d5.xz);

        System.out.println(d6.yz);
        System.out.println(d6.xz);

        System.out.println(d7.yz);
        System.out.println(d7.xz);

        System.out.println(d8.yz);
        System.out.println(d8.xz);

        System.out.println(d9.yz);
        System.out.println(d9.xz);

        System.out.println(d10.yz);
        System.out.println(d10.xz);

        System.out.println(d11.yz);
        System.out.println(d11.xz);

        System.out.println(d12.yz);
        System.out.println(d12.xz);
    }
}
