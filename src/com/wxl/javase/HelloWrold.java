package com.wxl.javase;

import java.util.ArrayList;

/**
 * idea常用缩写总结
 */
public class HelloWrold {

    //模版六 prsf：可生成 private static final
    private static final int num1 = 3;
    public static final int num = 1;
    public static final int num2 = 2;

    //常用模版一 psvm 主函数
    public static void main(String[] args) {
        //常用模版二 sout 打印
        System.out.println("nihao");
        //变形 /soutp/soutv/xxx.sout
        System.out.println("args = [" + args + "]");
        int num = 10;
        int num2 = 10;
        System.out.println("num2 = " + num2);
        System.out.println(num);

        //模版三 fori
        String[] arr = new String[]{"Tom","Jerry","LiLei"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        //变形 iter
        for (String s : arr) {
            System.out.println(s);
        }

        //模版四 list.for
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(434);
        list.add(5567);
        for (Object o : list) {
            System.out.println(o);
        }
        //变形 list.fori
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

}
