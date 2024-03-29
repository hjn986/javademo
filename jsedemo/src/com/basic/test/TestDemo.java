package com.basic.test;

import java.util.Scanner;

public class TestDemo {

    public static void main(String[] args) {
        //程序初始化
        Scanner sc = new Scanner(System.in);
        Users[] uarr = new Users[10];
        Datas[] datas = new Datas[36];
        //创建不同种类的数据对象
        Datas d = new Datas("生肖", "鸡", "苏");
        datas[0] = d;
        Datas d2 = new Datas("生肖", "马", "顾");
        datas[1] = d2;
        Datas d3 = new Datas("生肖", "羊", "夏");
        datas[2] = d3;
        Datas d4 = new Datas("生肖", "兔", "陌");
        datas[3] = d4;
        Datas d5 = new Datas("生肖", "龙", "夜");
        datas[4] = d5;
        Datas d6 = new Datas("生肖", "鼠", "上官");
        datas[5] = d6;
        Datas d7 = new Datas("生肖", "猪", "慕");
        datas[6] = d7;
        Datas d8 = new Datas("生肖", "猴", "楚");
        datas[7] = d8;
        Datas d9 = new Datas("生肖", "蛇", "陆");
        datas[8] = d9;
        Datas d10 = new Datas("生肖", "狗", "程");
        datas[9] = d10;
        Datas d11 = new Datas("生肖", "牛", "浴");
        datas[10] = d11;
        Datas d12 = new Datas("生肖", "虎", "玉");
        datas[11] = d12;

        Datas d13 = new Datas("月份", "1", "小");
        datas[12] = d13;
        Datas d14 = new Datas("月份", "2", "棂");
        datas[13] = d14;
        Datas d15 = new Datas("月份", "3", "玥");
        datas[14] = d15;
        Datas d16 = new Datas("月份", "4", "浅");
        datas[15] = d16;
        Datas d17 = new Datas("月份", "5", "瑾");
        datas[16] = d17;
        Datas d18 = new Datas("月份", "6", "颜");
        datas[17] = d18;
        Datas d19 = new Datas("月份", "7", "曦");
        datas[18] = d19;
        Datas d20 = new Datas("月份", "8", "夭");
        datas[19] = d20;
        Datas d21 = new Datas("月份", "9", "眠");
        datas[20] = d21;
        Datas d22 = new Datas("月份", "10", "晴");
        datas[21] = d22;
        Datas d23 = new Datas("月份", "11", "莹");
        datas[22] = d23;
        Datas d24 = new Datas("月份", "12", "瑶");
        datas[23] = d24;

        Datas d25 = new Datas("星座", "白羊座", "浅");
        datas[24] = d25;
        Datas d26 = new Datas("星座", "金牛座", "姬");
        datas[25] = d26;
        Datas d27 = new Datas("星座", "巨蟹座", "盈");
        datas[26] = d27;
        Datas d28 = new Datas("星座", "天蝎座", "晞");
        datas[27] = d28;
        Datas d29 = new Datas("星座", "双子座", "儿");
        datas[28] = d29;
        Datas d30 = new Datas("星座", "射手座", "璃");
        datas[29] = d30;
        Datas d31 = new Datas("星座", "狮子座", "衣");
        datas[30] = d31;
        Datas d32 = new Datas("星座", "处女座", "仪");
        datas[31] = d32;
        Datas d33 = new Datas("星座", "天秤座", "之");
        datas[32] = d33;
        Datas d34 = new Datas("星座", "双鱼座", "绯");
        datas[33] = d34;
        Datas d35 = new Datas("星座", "水瓶座", "色");
        datas[34] = d35;
        Datas d36 = new Datas("星座", "摩羯座", "蓉");
        datas[35] = d36;


        //用户输入数据
        String uname = sc.next();
        int psd = sc.nextInt();
        String sx = sc.next();
        int month = sc.nextInt();
        String xz = sc.next();

        int m = register(uname, psd, sx, month, xz, uarr);
        if (m == 1) {
            System.out.println("注册成功");
        } else {
            System.out.println("注册失败");
        }

//            用户登录
        System.out.println("请登录");
        String uname2 = sc.next();
        int psd2 = sc.nextInt();
        int login = login(uname2, psd2, uarr);
        if (login == 1) {
            System.out.println("登录成功");
        } else {
            System.out.println("登录失败");
        }

        //开始测试
        System.out.println("请输入生肖、月份、星座");
        String sx2 = sc.next();
        String mon2 = sc.next();
        String xz2 = sc.next();
        String newName = startGame(sx2, mon2,xz2, datas);
        System.out.println("你前世的名字是：" + newName);
    }
        //用户注册
        public static int register(String uname,int psd, String sx,int month, String xz, Users[]ua){
//            创建一个用户对象
            Users u = new Users();
//                给对象的属性赋值
            u.uname = uname;
            u.psd = psd;
            u.sx = sx;
            u.month = month;
            u.xz = xz;
//            保存对象（数组）
            for (int i = 0; i <ua.length; i++) {
                if (ua[i] == null) {
                    ua[i] = u;
                    return 1;
                }
            }
            return -1;
        }
//            用户登录
        public static int login (String uname,int psd, Users[] ua){
//                非空判断
//                根据用户输入的内容找对应的用户
            for (int i = 0; i < ua.length; i++) {
                if (ua[i] != null) {
//                比较从数组里拿出的用户的用户名和密码是否匹配
                    if (ua[i].uname.equals(uname) && ua[i].psd == psd) {
                        return 1;
                    }
                }
            }
            return -1;
        }

        //开始测试
        public static String startGame (String sx, String mon, String xz, Datas[]ds){
            String newName = "";

            for (int i = 0; i < ds.length; i++) {
                if (ds[i] != null) {
                    //生肖
                    if (ds[i].category.equals("生肖")) {
                        if (ds[i].yz.equals(sx)) {
                            newName = newName + ds[i].xz;
                        }
                    }
                    //月份
                    if (ds[i].category.equals("月份")) {
                        if (ds[i].yz.equals(mon)) {
                            newName = newName + ds[i].xz;
                        }
                    }
                    //星座
                    if (ds[i].category.equals("星座")) {
                        if (ds[i].yz.equals(xz)) {
                            newName = newName + ds[i].xz;
                        }
                    }
                }
            }
            return newName;
        }
    }






