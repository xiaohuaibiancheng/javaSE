package com.huhao.chapter14;

/**
 * @author huhao
 * @create 2023-03-04 14:09
 */
public class Person extends Individual{

    public Person(String name) {
        super(name);
    }
}
class Pet extends Individual{

    public Pet(String name) {
        super(name);
    }

    public Pet() {
    }
}

class Dog extends Pet{

    public Dog(String name) {
        super(name);
    }

    public Dog() {
    }
}

class Mutt extends Dog{
    public Mutt(String name) {
        super(name);
    }

    public Mutt() {
    }
}

class Pug extends Dog{
    public Pug() {
    }

    public Pug(String name) {
        super(name);
    }
}
class Cat extends Pet{
    public Cat() {
    }

    public Cat(String name) {
        super(name);
    }
}
class EgyptianMau extends Cat{
    public EgyptianMau(String name) {
        super(name);
    }

    public EgyptianMau() {
    }
}

class Manx extends Cat{
    public Manx(String name) {
        super(name);
    }

    public Manx() {
    }
}

class Cymric extends Cat{
    public Cymric(String name) {
        super(name);
    }

    public Cymric() {
    }
}

class Rodent extends Cat{
    public Rodent(String name) {
        super(name);
    }

    public Rodent() {
    }
}

class Rat extends Rodent{
    public Rat() {
    }

    public Rat(String name) {
        super(name);
    }
}

class Mouse extends Rodent{
    public Mouse() {
    }

    public Mouse(String name) {
        super(name);
    }
}

class Hamster extends Rodent{
    public Hamster() {
    }

    public Hamster(String name) {
        super(name);
    }
}
class Individual{
    private String name;

    public Individual(String name) {
        this.name = name;
    }

    public Individual() {
    }
}
