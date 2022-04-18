package _13_search_algorithm.exercise;

import java.util.LinkedList;

public class FindStringMax {
    public static void findStringMax(String string){
        LinkedList<Character> list = new LinkedList<>();
        list.add(string.charAt(0));
        for (int i = 1; i < string.length(); i++) {
            if (list.getLast() < string.charAt(i)){
                list.add(string.charAt(i));
            }
        }
        for (Character character: list){
            System.out.print(character);
        }
    }
    public static void main(String[] args) {
        findStringMax("Welcome");
    }

//    Độ phức tạp bài toán là T(n) = O(n)

}
