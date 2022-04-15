package _11_stack_queue.exercise.demerging;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        List<Person> personArrayList = new ArrayList<>();
        personArrayList.add(new Nam("hao",1999));
        personArrayList.add(new Nu("uyen",1999));
        personArrayList.add(new Nam("trung",2003));
        personArrayList.add(new Nam("hoang",1995));
        personArrayList.add(new Nu("nhung",1991));

        Collections.sort(personArrayList);

        Queue<Person> nam = new LinkedList<>();
        Queue<Person> nu = new LinkedList<>();

        for (int i = 0; i < personArrayList.size(); i++) {
            if ((personArrayList.get(i).isGender())){
                nam.add(personArrayList.get(i));
            }else {
                nu.add(personArrayList.get(i));
            }
        }

        for (int i = 0; i < personArrayList.size(); i++) {
            if (!nu.isEmpty()){
                personArrayList.set(i, nu.poll());
            }else {
                personArrayList.set(i, nam.poll());
            }
        }

        for (int i = 0; i < personArrayList.size(); i++) {
            System.out.println(personArrayList.get(i).toString());;
        }
    }
}
