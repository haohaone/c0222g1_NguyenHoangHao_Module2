package _16_io_text_file.exercise.country;

import _16_io_text_file.exercise.copy_file.ReadAndWrite;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        File file = new File("src\\_16_io_text_file\\exercise\\country\\country.csv");

        List<String[]> strings = ReadAndWrite.readObj(file);
        List<Country> countries = new ArrayList<>();
        for (String[] item : strings) {
            countries.add(new Country(Integer.parseInt(item[0]), item[1],item[2]));
        }

        for (Country country : countries) {
            System.out.println(country.toString());
        }
    }
}
