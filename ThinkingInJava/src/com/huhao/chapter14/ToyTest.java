package com.huhao.chapter14;

/**
 * @author huhao
 * @create 2023-03-01 21:09
 */
interface HasBatteries{};
interface WaterProof{};
interface Shoots{};
interface a{};

class Toy{
    Toy(){}
    Toy(int i){};
}
class FancyToy extends Toy implements HasBatteries, WaterProof, Shoots{
    private int i;
    FancyToy(){ super(1); }

}
public class ToyTest {
    static void printInfo(Class cc){
        System.out.println("Class name:" + cc.getName() +
                " is interface? [" + cc.isInterface() + "]");
        System.out.println("Simple name:" + cc.getSimpleName());
        System.out.println("Canonical name:" + cc.getCanonicalName());
    }

    public static void main(String[] args) {
        Class c = null;
        try{
            c = Class.forName("com.huhao.chapter14.FancyToy");
        }catch (ClassNotFoundException e){
            System.out.println("Can not find FancyToy");
            System.exit(1);
        }
        printInfo(c);
        for(Class face : c.getInterfaces()) printInfo(face);

        Class up = c.getSuperclass();
        Object obj = null;
        try {
            obj = up.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
            System.exit(1);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
            System.exit(1);
        }
        printInfo(obj.getClass());
    }


}
