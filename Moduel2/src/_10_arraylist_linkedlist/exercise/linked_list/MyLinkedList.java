package _10_arraylist_linkedlist.exercise.linked_list;

import javax.xml.soap.Node;

public class MyLinkedList<E> {
    private Node head;
    private int numNode;

    private class Node {
        private Node next;
        private Object data;

        public Node(E e) {
            this.data = e;
        }

        public Object getData() {
            return this.data;
        }
    }

    public MyLinkedList() {
    }

    public MyLinkedList(E e) {
        head = new Node(e);
        numNode++;
    }

    public void add(int index, E e) {
        Node temp = head;
        Node holder;

        for (int i = 0; i < index - 1 && temp.next != null; i++) {
            temp = temp.next;
        }
        holder = temp.next;
        temp.next = new Node(e);
        temp.next.next = holder;
        numNode++;
    }

    public void addFirst(E e) {
        Node newNode = new Node(e);
        newNode.next = head;
        head = newNode;
        numNode++;
    }

    public void addLast(E e) {
        Node newNode = new Node(e);
        Node temp = head;
        for (int i = 0; i < numNode - 1 && temp.next != null; i++) {
            temp = temp.next;
        }
        temp.next = newNode;
        numNode++;
    }

    public E removeFirst() {
        Node holder = head;
        head = head.next;
        numNode--;
        return (E) holder;
    }

    public E removeLast() {
        Node temp = head;
        for (int i = 0; i < numNode - 2; i++) {
            temp = temp.next;
        }
        Node deleted = temp;
        temp.next = null;
        numNode--;
        return (E) deleted;
    }

    public E remove(int index) {
        if (index == 0) {
            return removeFirst();
        } else if (index == numNode - 1) {
            return removeLast();
        } else {
            Node temp = head;
            for (int i = 1; i < index && temp.next != null; i++) {
                temp = temp.next;
            }
            Node holder = temp.next;
            temp.next = holder.next;
            numNode--;
            return (E) holder;
        }
    }

    public boolean removeE(E e) {
        Node newTemp = head;
        boolean flag = false;
        for (int i = 0; i < numNode; i++) {
            if (newTemp.getData() == e) {
                remove(i);
                flag = true;
                break;

            }
            newTemp = newTemp.next;
        }
        return flag;
    }

    public int size(){
        return numNode;
    }

    public E get(int index){
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return (E) temp.getData();
    }

    public boolean contains(E e){
        Node temp = head;
        boolean flag = false;
        for (int i = 0; i < numNode - 1; i++) {
            if (temp.getData() == e){
                flag = true;
                break;
            }
            temp = temp.next;
        }
        return flag;
    }

    public int indexOf(E e){
        if (contains(e)) {
            int index = 0;
            Node temp = head;
            for (int i = 0; i < numNode - 1; i++) {
                if (temp.getData() == e) {
                    index = i;
                    break;
                }
                temp = temp.next;
            }
            return index;
        }else {
            return -1;
        }
    }

    public MyLinkedList<E> clone(){
        MyLinkedList<E> newCloneList = new MyLinkedList<>();
        Node temp = head;
        newCloneList.addFirst((E) head.getData());
        for (int i = 0; i < numNode - 1; i++) {
            temp = temp.next;
            newCloneList.addLast((E) temp.getData());
        }
        return newCloneList;
    }

    @Override
    public String toString() {
        StringBuilder string = new StringBuilder("[");
        Node temp = head;
        for (int i = 0; ; i++) {
            string.append(temp.getData());
            if (temp.next == null) {
                break;
            }
            string.append(",");
            temp = temp.next;
        }
        string.append("]");
        return string.toString();
    }
}
