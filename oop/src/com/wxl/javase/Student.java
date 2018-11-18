package com.wxl.javase;

/**
 * @author wxl
 * @date 2018/11/17 16:51
 * @功能描述：
 */
public class Student {
    private String name;
    private boolean sex;
    private final int age;

    Student(String name,boolean age){
        this.name = name;
        this.sex = sex;
        this.age = 50;
    }

    public static void main(String[] args) {
        Student s = new Student("小明",true);
        System.out.println(s.name);
        System.out.println(s.sex);
        s.method1("参数1","参数2");
    }

    public void method1(String... param){
        System.out.println(param);
    }

}
