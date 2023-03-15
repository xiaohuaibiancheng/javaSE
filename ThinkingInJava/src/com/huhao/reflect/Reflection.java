package com.huhao.reflect;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author huhao
 * @create 2023-03-08 21:42
 */
public class Reflection {

    @Test
    public void test1(){
        Person person = new Person();
        person.show();
    }

    @Test
    public void test2(){
        Class clazz = Person.class;
        try {
            Person p = (Person) clazz.newInstance();
            Field field = clazz.getField("age");
            field.set(p,11);
            System.out.println(field.get(p));

            Method method = clazz.getMethod("show");
            method.invoke(p);

            //调用私有结构
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    /*
    调用私有结构
     */
    @Test
    public void test3() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {
        Class clazz = Person.class;
        Constructor contr = clazz.getDeclaredConstructor(String.class,int.class);
        contr.setAccessible(true);
        Person p1 = (Person) contr.newInstance("tom",11);

        System.out.println(p1);

        Field field = clazz.getDeclaredField("name");
        field.setAccessible(true);
        //Field field = clazz.getField("name");
        field.set(p1,"jack");
        System.out.println(field.get(p1));

        //调用私有方法

        Method method = clazz.getDeclaredMethod("showNation", String.class);
        method.setAccessible(true);
        System.out.println(method.invoke(p1,"中国"));
    }

}
