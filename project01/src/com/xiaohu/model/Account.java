package com.xiaohu.model;

/**
 * @author huhao
 * @create 2022-12-04 20:47
 */
public class Account {
    public String type;
    public int balance;
    public int vary;
    public String remark;

    @Override
    public String toString() {
        return "Account{" +
                "type='" + type + '\'' +
                ", balance=" + balance +
                ", vary=" + vary +
                ", remark='" + remark + '\'' +
                '}';
    }

    public Account(String type, int balance, int vary, String remark) {
        this.type = type;
        this.balance = balance;
        this.vary = vary;
        this.remark = remark;
    }

    public Account() {
    }
}
