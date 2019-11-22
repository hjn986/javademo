package com.cst1;
//import java.util.Scanner;
public class TestDemo {

    //用来存放用户
    static Entrants[] entrants = new Entrants[1000];

    //用来存放门派和该门派对应的人数
    //创建一个门派数组，来保存门派
   /* static String[] sect = new String[5];
    static int[] sectnum = new int[5];
    static {
        sect[0] = "java";
    }*/

         //灵境主入口
    public static void main(String[] args) {
         //灵境初始化


        /*int i=pdAge(new Entrants("熊大","java","男",4));
        System.out.println(i);*/
        //记录进入的人
        Entrants en = new Entrants("熊大","java","男",4);
        int i2 = saveEntrants(en,entrants);
        System.out.println(i2);
      /*  //    同一门派进入灵境人数不得超过10人；
        for(int i = 0;i<10;i++){
            int n = pdMPNum(em,mps2,sectnum);
            System.out.println(n);
        }*/

    }
//    判断进入灵境的人年龄是否符合
    public static int pdAge(Entrants e){
//        有没有这个人？
        if(e!=null){
            if(e.age>=10&&e.age<=30){
                return 1;
            }

        }
        //不合格
        return -1;
    }
//    记录每一个进入的人
    public static int saveEntrants(Entrants e,Entrants[] ear){
//        判断该用户是否存在
        for(int i=0;i<ear.length;i++){
            if(ear[i]!=null){
                if(ear[i].name.equals(e.name)){
                    return -1;
                }
            }
        }
//        如果不存在就记录下来
        for(int i=0;i<ear.length;i++){
            if(ear[i]==null){
                ear[i]=e;
                return 1;
            }
        }
        return -1;
    }

    /*    Scanner sc = new Scanner(System.in);

        Entrants[] arr = new Entrants[5];

        System.out.println("**************");

//        每个进入灵境之人，都要求记录各自的姓名、门派、性别、年龄；
        String name = sc.next();
        String sect = sc.next();
        String sex = sc.next();
        int age = sc.nextInt();

        int m = record(name, sect, sex, age, arr);
//        年龄小于10岁或者大于30岁之人，不允许进入灵境；
        if (age < 10 | age > 30) {
            System.out.println("您无法进入该灵境");
            return;
        } else {
            System.out.println("欢迎您进入【灵境】");
        }

        //        灵境之内禁止厮杀，一旦被界灵发现，将会直接抹除此人；
        System.out.println("温馨提示：灵境之内禁止厮杀，一旦被界灵发现，将会直接抹除您的信息");


       *//* 进入灵境之后，通过选择自己想要的灵兽类型，会被传送到不同的区域，
        灵兽类型分为金、木、水、火、土五行属性；*//*
        System.out.println("请选择自己想要的灵兽类型");
        System.out.println("灵兽类型分为金、木、水、火、土五行属性");
        String attribute=sc.next();



        SpiritAnimal s1 = new SpiritAnimal();
        SpiritAnimal s2 = new SpiritAnimal();
        SpiritAnimal s3 = new SpiritAnimal();
        SpiritAnimal s4 = new SpiritAnimal();
        SpiritAnimal s5 = new SpiritAnimal();

        s1.name = "白虎";
        s1.attribute = "金";
        s1.stats = 6;
        s1.grade = 2;
        s1.uniqueskills = "力大无穷";

        s2.name = "青龙";
        s2.attribute = "木";
        s2.stats = 6;
        s2.grade = 2;
        s2.uniqueskills = "杀人无形";

        s3.name = "玄武";
        s3.attribute = "水";
        s3.stats = 6;
        s3.grade = 2;
        s3.uniqueskills = "怒海惊涛";

        s4.name = "朱雀";
        s4.attribute = "火";
        s4.stats = 6;
        s4.grade = 2;
        s4.uniqueskills = "不灭之火";

        s5.name = "麒麟";
        s5.attribute = "土";
        s5.stats = 6;
        s5.grade = 2;
        s5.uniqueskills = "再生之能";

        SpiritAnimal[] sarr = new SpiritAnimal[5];
        sarr[0]=s1;
        sarr[1]=s2;
        sarr[2]=s3;
        sarr[3]=s4;
        sarr[4]=s5;

        //    列表展示灵兽
        for(int j=0;j<sarr.length;j++){
            if(sarr[j]!=null){
                System.out.println("灵兽序号："+j+"\t灵兽名字："+sarr[j].name  +"\t属性："+sarr[j].attribute+   "\t能力值："+sarr[j].stats+"\t等级:"+sarr[j].grade+"\t独有技能："+sarr[j].uniqueskills);
            }
        }
        System.out.println("请选择灵兽序号：");
        int n=sc.nextInt();
        if(n>=0&&n<arr.length) {
            System.out.println("灵兽序号："+n+"\t灵兽名字："+sarr[n].name +"\t属性："+sarr[n].attribute+   "\t能力值："+sarr[n].stats+"\t等级:"+sarr[n].grade+"\t独有技能："+sarr[n].uniqueskills);

        }









    public static int record(String name, String sect, String sex, int age, Entrants[] arr) {
        Entrants e = new Entrants();
        e.name = name;
        e.sect = sect;
        e.sex = sex;
        e.age = age;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==null){
                return 1;
            }
        }
        return -1;

    }

//    能力值从0~10分为三个档次，一般0~3，中等4~6，优秀5~9，极品10
    public static int stats(int b){
        if(b==10){
            System.out.println("该灵兽为极品");
        }else if(b>=7&&b<=9){
            System.out.println("该灵兽为优秀");
        }else if(b>=4&&b<=6){
            System.out.println("该灵兽为中等");
        }else if(b>=0&&b<=3){
            System.out.println("该灵兽为一般");
        }
        return 1;
    }*/




}
