package com.huhao.chapter10;

/**
 * @author huhao
 * @create 2023-02-27 22:26
 */
public interface Selector {
    boolean end();
    Object current();
    void next();
}
