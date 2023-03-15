package com.huhao.chapter10;

/**
 * @author huhao
 * @create 2023-02-27 0:02
 */
public class Outer {
    private String name;
    public Inner getInner(){
        return new Inner();
    }
    public class Inner{
        @Override
        public String toString() {
            return "Inner{name = "+name+"}";
        }
    }
    public Outer(String name){
        this.name = name;
    }


    public static void main(String[] args) {
        Outer out = new Outer("tom");
        Inner in = out.getInner();
        System.out.println(in);
    }
}
