package _16_io_text_file.exercise.copy_file;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWrite {
    public static List<String> readString(File file){
        List<String> list = new ArrayList<>();
        try (FileReader fileReader = new FileReader(file);
             BufferedReader bufferedReader = new BufferedReader(fileReader)){
            String line = "";
            if (!file.exists()){
                throw new FileNotFoundException();
            }
            while ((line = bufferedReader.readLine()) != null){
                list.add(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }

    public static void write(File file, String line){
        try ( FileWriter fileWriter = new FileWriter(file, true);
              BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)){
            bufferedWriter.write(line);
            bufferedWriter.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
