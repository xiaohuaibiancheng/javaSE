package com.huhao.chapter10;

/**
 * @author huhao
 * @create 2023-02-28 23:30
 */
public class Practice5 {
    private int i;

    public class Inner{
        public Inner(int i){
            i = i;
        }
        @Override
        public String toString(){
            return "Inner{i = "+i+"}";
        }
    }
}
