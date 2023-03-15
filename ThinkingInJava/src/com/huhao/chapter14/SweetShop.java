package com.huhao.chapter14;

/**
 * @author huhao
 * @create 2023-03-02 19:43
 */

class Candy{
    static {
        System.out.println("loading candy");
    }
}

class Gum{
    static {
        System.out.println("loading gum");
    }
}

class Cookie{
    static {
        System.out.println("loading cookie");
    }
}

public class SweetShop {
   /* public static void main(String[] args){
        System.out.println("inside main");
        new Candy();
        System.out.println("aftre creating candy");
        try{
            Class.forName("com.huhao.chapter14.Gum");
        }catch (ClassNotFoundException e){
            System.out.println("couldn't find Gum");
        }
        System.out.println("after creating forname(Gum)");
        new Cookie();
        System.out.println("after creating Cookie");
    }*/

    public static void main(String[] args) {
       /* String className = args[0];
        switch (className ){
            case "Candy":
            case "candy":
                new Candy();
                break;
            case "Cookie":
            case "cookie":
                new Cookie();
                break;
            case "Gum":
            case "gum":
                new Gum();
                break;
        }*/

        //Class c = Candy.class;
        try {
            Class b = Class.forName("com.huhao.chapter14.Candy");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
