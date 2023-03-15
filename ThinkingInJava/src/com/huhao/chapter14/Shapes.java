package com.huhao.chapter14;

import java.util.Arrays;
import java.util.List;

/**
 * @author huhao
 * @create 2023-03-01 22:11
 */
abstract class Shape{
    void draw(){
        System.out.println(this + ".draw()");
    }
    abstract public String toString();
}

class Circle extends Shape{
    boolean signed = false;

    @Override
    public String toString() {
        return "circle" + ", is signed [" + signed +"]";
    }
}

class Square extends Shape{
    boolean signed = false;

    @Override
    public String toString() {
        return "Square" + ", is signed [" + signed +"]";
    }
}

class Triangle extends Shape{
    boolean signed = false;

    @Override
    public String toString() {
        return "Triangle" + ", is signed [" + signed +"]";
    }
}

class Rhomboid extends Shape{
    boolean signed = false;

    @Override
    public String toString() {
        return "Rhomboid" + ", is signed [" + signed +"]";
    }
}
public class Shapes {
    public static void rotate(Shape shape){
        String name = shape.getClass().getSimpleName();
        if(shape instanceof Circle){
            System.out.println(name + " Do not rotate");
        }else {
            System.out.println(name + " rotate");
        }
    }
    public static void sign(Shape shape){

        if(shape instanceof Circle){
            ((Circle) shape).signed = true;
        }
    }
    public static void main(String[] args) {
        List<Shape> shapeList = Arrays.asList( new Circle(),new Square(),new Triangle());
        for(Shape shape : shapeList){
            shape.draw();
            rotate(shape);
            sign(shape);
        }
        for(Shape shape : shapeList){
            System.out.println(shape);
        }
        Shape shape = new Rhomboid();
        if(shape instanceof Rhomboid){
            Rhomboid rhomboid = (Rhomboid)shape;
        }else {
            System.out.println("shape is not Rhomboid");
        }
        if(shape instanceof Circle) {
            Circle circle = (Circle)shape;
        }else{
            System.out.println("shape is not Circle");
        }
    }
}
