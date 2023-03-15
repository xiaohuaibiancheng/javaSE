package com.huhao.reflect;

import org.junit.Test;

import java.lang.annotation.ElementType;

/**
 * @author huhao
 * @create 2023-03-09 22:14
 */
public class ClassTest {
    @Test
    public void test1() throws ClassNotFoundException {
        //1.调用运行时类的静态属性：class
        Class clazz1 = Person.class;
        System.out.println(clazz1);

        //2.调用运行时类的对象的getClass()方法
        Person p = new Person();
        Class clazz2 = p.getClass();
        System.out.println(clazz2);


        System.out.println(clazz1 == clazz2);  //true

        //3.调用CLass的静态方法forName(String className)
        String className = "com.huhao.reflect.Person";
        Class clazz3 = Class.forName(className);

        System.out.println(clazz1 == clazz3);  //true

        //4.使用类的加载器
        Class clazz4 = ClassLoader.getSystemClassLoader().loadClass("com.huhao.reflect.Person");
        System.out.println(clazz1 == clazz4);   //true
    }

    @Test
    public void test2(){
        Class c1 = Object.class;
        Class c2 = Comparable.class;
        Class c3 = String[].class;
        Class c4 = int[][].class;
        Class c5 = ElementType.class;
        Class c6 = Override.class;
        Class c7 = int.class;
        Class c8 = void.class;
        Class c9 = Class.class;

        int[] a = new int[10];
        int[] b = new int[100];
        Class c10 = a.getClass();
        Class c11 = b.getClass();

        Class c12 = int[].class;

        System.out.println(c10 == c12);  //true

        Class c13 = Person.class;
        System.out.println(c1 == c13);   //false

    }

    @Test
    public void test(){
        Person p1 = new Person(1);
        Person p2 = new Person(2);
        System.out.println(p1 == p2);

        Class c1 = p1.getClass();
        Class c2 = p2.getClass();
        System.out.println(c1 == c2);
    }


}
