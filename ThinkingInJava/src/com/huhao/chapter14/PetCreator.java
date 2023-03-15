package com.huhao.chapter14;

import java.util.*;

/**
 * @author huhao
 * @create 2023-03-04 14:20
 */
public abstract  class PetCreator {
    private Random rand = new Random(47);
    public abstract List<Class<? extends Pet>> types();

    public Pet randomPet(){
        int n = rand.nextInt(types().size());
        Pet pet = null;
        try {
            pet = types().get(n).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return pet;
    }

    public Pet[] createArray(int size){
        Pet[] results = new Pet[size];
        for(int i = 0;i<size;i++) results[i] = randomPet();
        return results;
    }

    public ArrayList<Pet> arrayList(int size){
        ArrayList<Pet> result = new ArrayList<Pet>();
        Collections.addAll(result,createArray(size));
        return result;
    }
}
