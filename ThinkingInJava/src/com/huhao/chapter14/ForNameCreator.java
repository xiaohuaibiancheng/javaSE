package com.huhao.chapter14;

import java.util.ArrayList;
import java.util.List;

/**
 * @author huhao
 * @create 2023-03-04 14:49
 */
public class ForNameCreator extends PetCreator{
    private static List<Class<? extends Pet>> types = new ArrayList<Class<? extends Pet>>();

    private static String[] typeNames = {
            "com.huhao.chapter14.Mutt",
            "com.huhao.chapter14.Pug",
            "com.huhao.chapter14.EgyptianMau",
            "com.huhao.chapter14.Manx",
            "com.huhao.chapter14.Cymric",
            "com.huhao.chapter14.Rat",
            "com.huhao.chapter14.Mouse",
            "com.huhao.chapter14.Hamster"
    };

    private static void loader(){
        for(String name : typeNames){
            try {
               types.add((Class<? extends Pet>) Class.forName(name));
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
    }

    static { loader();}
    @Override
    public List<Class<? extends Pet>> types() {

        return types;
    }
}
