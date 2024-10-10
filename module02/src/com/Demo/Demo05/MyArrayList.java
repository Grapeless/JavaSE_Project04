package com.Demo.Demo05;

import java.util.Arrays;
import java.util.Objects;
import java.util.StringJoiner;

public class MyArrayList<E> {
    private Object[] eArray;


    public MyArrayList() {
        //int[] i = new int[10];
        this.eArray = new Object[5];
    }

    public MyArrayList(int initCapacity) {
        this.eArray = new Object[initCapacity];
    }

    //用于添加数据，需要实现自动扩容
    public void add(E e) {
        if (size() == eArray.length) {
            this.eArray = Arrays.copyOf(this.eArray, 2 * size());
        }
        //1,2,3,4,0,0
        this.eArray[size()] = e;
    }

    //能根据索引查询数据
    public E get(int index) {
        return (E) eArray[index];
    }

    //能根据索引删除数据
    public E remove(int index) {
        E removeEle = (E) eArray[index];
        for (int i = index; i < size(); i++) {
            //1,2,3,4,5
            if (i == size() - 1) {
                eArray[i] = null;
            } else {
                eArray[i] = eArray[i + 1];
            }
        }
        return removeEle;
    }

    //返回集合大小
    public int size() {
        int length = 0;
        for (Object o : eArray) {
            if (o != null) {
                length++;
            }
        }
        return length;
    }

    //forEach方法
    public void forEach(ForEach<? super E> action) {
        Objects.requireNonNull(action);
        for (int i = 0; i < size(); i++) {
            action.accept((E) eArray[i]);
        }
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(",", "[", "]");
        for (Object o : eArray) {
            if (o != null) {
                joiner.add(o.toString());
            }
        }
        return joiner.toString();
    }
}
