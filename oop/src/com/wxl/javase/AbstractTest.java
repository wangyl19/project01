package com.wxl.javase;

/**
 * @author wxl
 * @date 2018/11/17 15:59
 * @功能描述：
 *  1.如何定义抽象类?
 * 		class关键字前加abstract
 *
 * 	2.抽象类无法被实例化
 *
 * 	3.虽然抽象类没有办法实例化，但是抽象类也有构造方法，该构造方法是给子类创建对象用的。
 *
 * 	4.抽象类中可以定义抽象方法.
 * 		抽象方法的语法：在方法的修饰符列表中添加abstract关键字.并且抽象方法应该以“;”结束,不能带有“{}”
 * 		例如：public abstract void m1();
 *
 * 	5.抽象类中不一定有抽象方法，但抽象方法必须出现在抽象类中。
 *
 * 	6.一个非抽象的类继承抽象类，必须将抽象类中的抽象方法覆盖，实现，重写。
 */
abstract class AbstractTest {

    //虽然抽象类没有办法实例化，但是抽象类也有构造方法，构造方法时给子类创建对象用的
    public AbstractTest() {
        System.out.println("Abstract class default Construct execute");
    }

    abstract void method1();
}

class Test extends AbstractTest{
    public static void main(String[] args) {
        //多态
        AbstractTest t = new Test();
        System.out.println(t);
        t.method1();
    }

    //一个非抽象的类继承抽象类，必须将抽象类中的抽象方法覆盖，实现，重写。
    void method1(){
        System.out.println("overwride abstract method");
    }
}
