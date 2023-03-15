package com.huhao.chapter14;

import java.util.ArrayList;

/**
 * @author huhao
 * @create 2023-03-06 22:28
 */
public class Pets {
    public static final PetCreator creator = new LiteralPetCreator();

    public static Pet randomPet(){
        return creator.randomPet();
    }

    public static Pet[] createArray(int size){
        return creator.createArray(size);
    }

    public static ArrayList<Pet> arrayList(int size){
        return creator.arrayList(size);
    }
}
