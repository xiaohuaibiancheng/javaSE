package com.huhao.chapter10;

import com.huhao.chapter09.InterfaceChaper10;

/**
 * @author huhao
 * @create 2023-02-28 23:53
 */
public class Practice6 {
    protected class InterfaceImpl implements InterfaceChaper10 {

        @Override
        public String contents() {
            return "implement interface for chapter 10";
        }

        public InterfaceImpl() {
        }
    }
}
