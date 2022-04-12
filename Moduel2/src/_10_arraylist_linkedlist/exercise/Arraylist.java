package _10_arraylist_linkedlist.exercise;

import java.util.Arrays;

public class Arraylist<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 1;
    private Object[] elements;

    public Arraylist() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public Arraylist(int capacity) {
        elements = new Object[capacity];
    }

    private void ensureCapa(){
        int newSize = elements.length + 1;
        elements = Arrays.copyOf(elements, newSize);
    }

    public boolean push(E e){
        if (size == elements.length){
            ensureCapa();
        }
        elements[elements.length-1] = e;
        size++;
        return true;
    }

    public void add(int index, E e){
        if (size == elements.length){
            ensureCapa();
        }
        for (int i = elements.length - 1; i >= index; i--) {
            elements[i] = elements[i - 1];
            if (i == index){
                elements[i] = e;
            }
        }
        size++;
    }

    public E remove(int index){
        for (int i = index; i < elements.length - 1; i++) {
            elements[i] = elements[i + 1];
        }
        size--;
        elements = Arrays.copyOf(elements, size);
        return (E) elements[index];
    }

    public int size(){
        return size;
    }

//    public E clone(){
//        return (E) Arrays.copyOf(elements,size);
//    }

    public boolean contains (E o){
        boolean flag = false;
        for (int i = 0; i < elements.length - 1; i++) {
            if (elements[i] == o){
                flag = true;
                break;
            }
        }
        return flag;
    }

    public int indexOf (E o){
        int index = 0;
        for (int i = 0; i < elements.length - 1; i++) {
            if (elements[i] == o){
                index = i;
            }else {
                index = -1;
            }
        }
        return index;
    }

    public E get(int i){
        return (E)elements[i];
    }

    public void clear(){
        elements = Arrays.copyOf(elements,0);
    }

    @Override
    public String toString() {
        return Arrays.toString(elements);
    }
}
