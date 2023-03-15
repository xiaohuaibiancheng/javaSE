package com.huhao.chapter07;

/**
 * @author huhao
 * @create 2023-02-07 23:18
 */
public class ExtendTest {
    public int b = 4;

}

class a extends ExtendTest{
    public String b = "5";

}
class test{
    public static void main(String[] args) {
        a t = new a();
        System.out.println(t.b);
    }
}
