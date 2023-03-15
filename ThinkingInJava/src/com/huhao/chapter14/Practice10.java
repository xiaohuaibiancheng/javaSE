package com.huhao.chapter14;

/**
 * @author huhao
 * @create 2023-03-02 21:52
 */
public class Practice10 {

    public void getCharList(char[] list){
        System.out.println("the superClass of char[] list:"+list.getClass().getSuperclass());

    }

    public static void main(String[] args) {
        char[] list = new char[10];
        System.out.println("the superClass of char[] list:"+list.getClass().getSuperclass());
    }
}
