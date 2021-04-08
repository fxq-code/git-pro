package com.fxq.datastructure.day2;

import java.util.Arrays;

/**
 *利用数组顺序存储结构实现线性表
 * @author Administrator
 */
public class ArrayLinearList<T> {

    private T[] elements;

    private int size;

    private final int defaultCapacity = 10;

    public ArrayLinearList(){
        this.elements = (T[])new Object[defaultCapacity];
        this.size = 0;
    }

    public T get(int i){
        if(i < 0 || i > elements.length - 1){
            throw new RuntimeException("非法下标："+i);
        }
        return elements[i];
    }

    public void add(T element,int i){
        if(i < 0){
            throw new RuntimeException("非法下标："+i);
        }
        if(size == elements.length){
            resize(defaultCapacity<<2);
        }
        for (int j = elements.length - 1;j > i; j--) {
            elements[j] = elements[j-1];
        }
        elements[i] = element;
        size++;

    }
    private void resize(int newCapacity){
        elements = Arrays.copyOf(elements,newCapacity);
    }

    public T remove(int i){
        if(i < 0 || i > elements.length-1){
            throw new RuntimeException("非法下标："+i);
        }
        T element = elements[i];
        for(int j = i; j<elements.length - 1;j++){
            elements[j] = elements[j+1];
        }
        size --;
        return element;
    }

    public int size(){
        return this.size;
    }




}
