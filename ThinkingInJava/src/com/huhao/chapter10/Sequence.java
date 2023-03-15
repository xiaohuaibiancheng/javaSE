package com.huhao.chapter10;

/**
 * @author huhao
 * @create 2023-02-27 22:27
 */
public class Sequence {
    private Object[] items;
    private int next = 0;
    public Sequence(int size){ items = new Object[size]; }
    public void add(Object x){
        if(next < items.length){
            items[next++] = x;
        }
    }
    private class SequenceSelector implements Selector {
        private int i = 0;
        public boolean end(){ return i == items.length; }
        public Object current(){
            return items[i];
        }
        public Sequence sequence(){
            return Sequence.this;
        }
        public void next(){
            if(i < items.length){
                i++;
            }

        }
    }
    public Selector selector(){
        return new SequenceSelector();
    }
    public static void main(String[] args){
        Sequence sequence = new Sequence(5);
        for(int i = 0;i < 5;i++) {
            sequence.add(new Practice2("jack"+i));
        }
        Selector selector = sequence.selector();
        while(! selector.end()){
            System.out.println(selector.current());
            selector.next();
        }
    }
}
