package _16_io_text_file.exercise.country;

import _16_io_text_file.exercise.copy_file.ReadAndWrite;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Test {
    public static List<String[]> readObj(File file){
        List<String[]> list = new ArrayList<>();

        try (FileReader fileReader = new FileReader(file);
             BufferedReader bufferedReader = new BufferedReader(fileReader)){
            String line = "";
            if (!file.exists()){
                throw new FileNotFoundException();
            }
            while (( line = bufferedReader.readLine()) != null){
                String[] arr = line.split(",");
                list.add(arr);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }

    public static void main(String[] args) {
        File file = new File("src\\_16_io_text_file\\exercise\\country\\country.csv");

        List<String[]> strings = readObj(file);
        List<Country> countries = new ArrayList<>();
        for (String[] item : strings) {
            countries.add(new Country(Integer.parseInt(item[0]), item[1],item[2]));
        }

        for (Country country : countries) {
            System.out.println(country.toString());
        }
    }
}
