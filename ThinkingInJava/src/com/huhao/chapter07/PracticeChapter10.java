package com.huhao.chapter07;

import com.huhao.chapter09.InterfaceChaper10;
import com.huhao.chapter10.Practice6;

/**
 * @author huhao
 * @create 2023-02-28 23:55
 */
public class PracticeChapter10 extends Practice6 {

    public InterfaceChaper10 interfaceImpl(){
        return new Practice6().new InterfaceImpl();
    }
}
