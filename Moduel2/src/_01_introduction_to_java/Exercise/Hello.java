package _01_introduction_to_java.exercise;

import java.util.Scanner;

public class Hello {
     static boolean solution(int[] a) {
        int max = a[0];
        int index = 0;
        for (int i = 0; i < a.length - 1; i++){
            if(max < a[i]){
                max = a[i];
                index = i;
                System.out.println(index);
            }
        }

        int totalLeft = 0;
        int totalRight = 0;
        for(int i=0, j=a.length - 1; i<index; i++,j--){
            if(j > index){
                totalRight += a[j];
            }
            totalLeft += a[i];
        }
         System.out.println(totalLeft);
         System.out.println(totalRight);
        if(totalLeft == totalRight){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
         int [] a = {1,2,3,3};
        System.out.println(solution(a));

    }
}
