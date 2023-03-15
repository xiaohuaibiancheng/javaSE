package com.huhao.chapter14;

//import net.*;

import java.util.LinkedHashMap;

/**
 * @author huhao
 * @create 2023-03-06 22:40
 */
public class PetCount3 {
    static class PetCounter extends LinkedHashMap<Class<? extends Pet>, Integer> {
        public PetCounter() {
            //           super(MapData.m)
            Class d = PetCreator.class;
            PetCreator c = new LiteralPetCreator();
            d.isInstance(c);
        }


    }
    public static void main(String[] args) {
        Class d = PetCreator.class;
        PetCreator c = new LiteralPetCreator();
        System.out.println(d.isInstance(c));
    }
}
