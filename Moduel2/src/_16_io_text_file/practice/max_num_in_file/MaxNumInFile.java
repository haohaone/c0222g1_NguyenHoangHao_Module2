package _16_io_text_file.practice.max_num_in_file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class MaxNumInFile {
    public static List<Integer> listNum = new ArrayList<>();

    public static void read(File file){
        try(FileReader readFile = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(readFile)) {
            String line ="";
            while ((line = bufferedReader.readLine()) != null){
                listNum.add(Integer.parseInt(line));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static int findMax(List<Integer> listNum){
        int max = listNum.get(0);
        for (int i = 1; i < listNum.size(); i++) {
            if (max < listNum.get(i)){
                max = listNum.get(i);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        File file = new File("src\\_16_io_text_file\\practice\\max_num_in_file\\text.txt");
        read(file);
        System.out.println("Max is " + findMax(listNum));
    }
}
