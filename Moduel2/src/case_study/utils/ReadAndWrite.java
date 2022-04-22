package case_study.utils;

import _17_io_binary_file.exercise.Product;
import case_study.models.facility.Facility;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ReadAndWrite {
    public static void write(String path, String line) {
        File file = new File(path);
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try (FileWriter fileWriter = new FileWriter(file, true);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
            bufferedWriter.write(line);
            bufferedWriter.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<String[]> read(String path) {
        List<String[]> list = new ArrayList<>();
        File file = new File(path);
        try (FileReader fileReader = new FileReader(file);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            String line = "";
            while ((line = bufferedReader.readLine()) != null){
                String[] arr = line.split(",");
                list.add(arr);
            }
            return list;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void writeFileByByte(String path, Map<Facility, Integer> facilityIntegerMap){
        File file = new File(path);
        try(FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oop = new ObjectOutputStream(fos)) {
            if (!file.exists()){
                throw new Exception();
            }
            oop.writeObject(facilityIntegerMap);
        } catch (FileNotFoundException e) {

        } catch (IOException e) {

        } catch (Exception e) {
        }
    }

    public static Map<Facility, Integer> readFileByByte(String path){
        Map<Facility, Integer> facilityIntegerMap = null;
        File file = new File(path);
        try(FileInputStream fis = new FileInputStream(file);
            ObjectInputStream oos = new ObjectInputStream(fis)) {
            facilityIntegerMap = (Map<Facility, Integer>) oos.readObject();
            return facilityIntegerMap;
        } catch (FileNotFoundException e) {

        } catch (IOException e) {

        } catch (ClassNotFoundException e) {

        }
        return facilityIntegerMap;
    }
}
