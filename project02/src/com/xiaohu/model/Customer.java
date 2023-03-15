package com.xiaohu.model;

/**
 * @author huhao
 * @create 2022-12-27 22:57
 */
public class Customer {
    private int id;
    private String name;
    private char sex;
    private int age;
    private String phone;
    private String mail;


    public Customer() {
    }

    public Customer(String name, char sex, int age, String phone, String mail) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.phone = phone;
        this.mail = mail;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
}
