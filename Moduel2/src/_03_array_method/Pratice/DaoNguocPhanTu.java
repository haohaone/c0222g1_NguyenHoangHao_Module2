package _03_array_method.Pratice;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader;

import java.lang.reflect.Array;

public class DaoNguocPhanTu {
//    int [] array = new int [10];
    public static int[] ReverseArray (int[] array){
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length-(i + 1)];
            array[array.length-(i + 1)] = temp;
        }
        return array;
    }

    public static void main(String[] args) {
        int [] newArray = {1,2,3,4,5,6,7,8,9};
        ReverseArray(newArray);
        for (int item : newArray) {
            System.out.println(item);
        }
    }
}
