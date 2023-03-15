package com.huhao.reflect;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @author huhao
 * @create 2023-03-12 16:55
 */
public class ClassLoaderTest {
    @Test
    public void test1(){
        //获取系统类加载器
        ClassLoader classLoader1 = ClassLoader.getSystemClassLoader();

        System.out.println(classLoader1);  //sun.misc.Launcher$AppClassLoader@14dad5dc

        //获取扩展类加载器
        ClassLoader classLoader2 = classLoader1.getParent();
        System.out.println(classLoader2); //sun.misc.Launcher$ExtClassLoader@5caf905d

        //获取引导类加载器：失败
        ClassLoader classLoader3 = classLoader2.getParent();
        System.out.println(classLoader3); //null
    }

    @Test
    public void test2() throws ClassNotFoundException {
        //用户自定义的类使用的是系统类加载器
        Class clazz1 = Person.class;
        ClassLoader classLoader = clazz1.getClassLoader();
        System.out.println(classLoader);  //sun.misc.Launcher$AppClassLoader@14dad5dc

        //java核心api使用引导类加载器加载
        Class clazz2 = Class.forName("java.lang.String");
        ClassLoader classLoader1 = clazz2.getClassLoader(); //null
        System.out.println(classLoader1);
    }

    @Test
    public void test3() throws IOException {
        Properties pro = new Properties();

        //读取的文件的默认路径为当前的moudle
        FileInputStream is = new FileInputStream("info.properties");
        pro.load(is);
        String name = pro.getProperty("name");
        String pwd = pro.getProperty("password");
        System.out.println("name:" + name + "; password:" + pwd);
    }

    @Test
    public void test4() throws IOException {
        Properties pro = new Properties();
        //通过类的加载器读取的文件的默认路径为，当前moudle下的src下
        InputStream is = ClassLoader.getSystemClassLoader().getResourceAsStream("info.properties");
        pro.load(is);
        String name = pro.getProperty("name");
        String pwd = pro.getProperty("password");
        System.out.println("name:" + name + "; password:" + pwd);
    }
}
