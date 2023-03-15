package com.huhao.chapter10;

/**
 * @author huhao
 * @create 2023-02-28 23:34
 */
public class Practice5_1 {
    public static void main(String[] args){
        Practice5 p = new Practice5();
        Practice5.Inner in = p.new Inner(1);
        System.out.println(in);

    }
}
