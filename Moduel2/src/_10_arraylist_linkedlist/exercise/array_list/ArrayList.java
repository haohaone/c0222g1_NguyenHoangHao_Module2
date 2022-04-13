package _10_arraylist_linkedlist.exercise.array_list;

import java.util.Arrays;

public class ArrayList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elements;

    public ArrayList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public ArrayList(int capacity) {
        elements = new Object[capacity];
    }

    private void ensureCapa(){
        int newSize = elements.length * 2 ;
        elements = Arrays.copyOf(elements, newSize);
    }

    public boolean add(E e){
        if (size == elements.length){
            ensureCapa();
        }
        elements[size] = e;
        size++;
        return true;
    }

    public void add(int index, E e){
        if (size == elements.length){
            ensureCapa();
        }
        for (int i = size - 1; i >= index; i--) {
            elements[i] = elements[i - 1];
            if (i == index){
                elements[i] = e;
            }
        }
        size++;
    }

    public E remove(int index){
        E deleted = (E) elements[index];
        for (int i = index; i < elements.length - 1; i++) {
            elements[i] = elements[i + 1];
        }
        elements[size-1] = null;
        size--;
        return deleted;
    }

    public int size(){
        return size;
    }

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
        if (elements[i]==null){
            throw new IndexOutOfBoundsException("Index: "+i+","+" Size: "+size);
        }else {
            return (E) elements[i];
        }
    }

    public ArrayList<E> clone(){
        ArrayList<E> newArray = new ArrayList<>();
        newArray.elements =  Arrays.copyOf(elements,size);
        newArray.size = size;
        return newArray;
    }

    public void clear(){
        elements = Arrays.copyOf(elements,0);
        size = 0;
    }

    public String toString() {
        StringBuilder string = new StringBuilder("[");
        if (size != 0){
            for (int i = 0; i < size; i++) {
                string.append((E) elements[i]);
                if (i==size-1){
                    break;
                }
                string.append(",");
            }
        }
        string.append(']');
        return string.toString();
    }

}
