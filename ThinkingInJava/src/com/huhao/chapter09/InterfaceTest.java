package com.huhao.chapter09;

import java.io.IOException;
import java.nio.CharBuffer;

/**
 * @author huhao
 * @create 2023-01-07 15:21
 */
public class InterfaceTest {
    public static void main(String[] args) {
        C3 c3 = new C3();
        System.out.println(c3.f(4));

    }
}

class Hero extends ActionCharacter implements CanFight{

}
interface CanFight{
    void fight();
}
class ActionCharacter{
    public void fight(){
        System.out.println("fight1");
    }
}

interface I1{void f();}
interface I2{int f(int i);}
interface I3{int f();}

class C {public int f(){return 1;}}

class C2 implements I1,I2{

    @Override
    public void f() {

    }

    @Override
    public int f(int i) {
        return 1;
    }
}
class C3 extends C implements I2{

    @Override
    public int f(int i) {
        return 0;
    }
}


class b implements  Readable{

    @Override
    public int read(CharBuffer cb) throws IOException {
        return 0;
    }
}
