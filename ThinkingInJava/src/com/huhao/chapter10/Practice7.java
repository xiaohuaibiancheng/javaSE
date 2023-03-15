package com.huhao.chapter10;

/**
 * @author huhao
 * @create 2023-03-01 20:41
 */
public class Practice7 {
    private int age;
    private String describe(){
        return "little boy";
    }

    public class Inner7{
        public void modifyGge(int i){
            age = i;
            System.out.println(describe());
        }
    }

    public void test(){
        Inner7 inner7 = new Inner7();
        inner7.modifyGge(10);
    }

    public static void main(String[] args) {
        Practice7 practice7 = new Practice7();
        Inner7 inner7 = practice7.new Inner7();
        inner7.modifyGge(10);
        System.out.println(practice7.age);
    }
}
