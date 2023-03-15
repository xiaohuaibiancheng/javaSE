package com.huhao.chapter14;

import java.lang.reflect.Field;

/**
 * @author huhao
 * @create 2023-03-02 20:44
 */
public class Practice8 {
    public static void getrees(Object object){
        Class[] interfaces = object.getClass().getInterfaces();
        if(interfaces.length == 0){
            System.out.println("该对象没有实现任何接口");
        }else{
            System.out.println("该对象实现的接口如下：");
            for(Class inter : interfaces){
                System.out.println(inter.getSimpleName());
            }
        }
        boolean end = false;
        Object currentObj = object;
        System.out.println("该对象的类的继承结构为：");
        while(! end){
            System.out.println(currentObj.getClass().getSimpleName());
            System.out.println(currentObj.getClass().getSimpleName() + "的方法有：");
            for(Field field : currentObj.getClass().getDeclaredFields()){
                System.out.println(field.getName());
            }
            try {
                currentObj = currentObj.getClass().getSuperclass().newInstance();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }

            if("Object".equals(currentObj.getClass().getSimpleName())) end = true;
        }
        System.out.println(Object.class.getSimpleName());

    }

    public static void main(String[] args) {
/*        try {
            //Practice8.class.getSuperclass().newInstance().getClass().getSuperclass().newInstance();
            System.out.println(Object.class.getClass().getSuperclass().newInstance());
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }*/
        //System.out.println(Class.class.getSuperclass().getSimpleName());
        FancyToy fancyToy = new FancyToy();
        //System.out.println("Object".equals(Object.class.getSimpleName()));
        //System.out.println(fancyToy instanceof Object);
       getrees(fancyToy);
    }
}
