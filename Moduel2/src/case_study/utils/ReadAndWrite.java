package case_study.utils;

import _17_io_binary_file.exercise.Product;
import case_study.models.booking_contracts.Booking;
import case_study.models.booking_contracts.Contract;
import case_study.models.facility.Facility;

import java.io.*;
import java.util.*;

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

    public static void writeFileMap(String path, LinkedHashMap<Facility, Integer> objs){
        File file = new File(path);
        try(FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oop = new ObjectOutputStream(fos)) {
            if (!file.exists()){
                throw new Exception();
            }
            oop.writeObject(objs);
        } catch (FileNotFoundException e) {

        } catch (IOException e) {

        } catch (Exception e) {
        }
    }

    public static LinkedHashMap<Facility, Integer> readFileMap(String path){
        LinkedHashMap<Facility, Integer> facilityIntegerMap;
        File file = new File(path);
        try(FileInputStream fis = new FileInputStream(file);
            ObjectInputStream oos = new ObjectInputStream(fis)) {
            facilityIntegerMap = (LinkedHashMap<Facility, Integer>) oos.readObject();
            return facilityIntegerMap;
        } catch (FileNotFoundException e) {

        } catch (IOException e) {

        } catch (ClassNotFoundException e) {

        }
        return new LinkedHashMap<Facility, Integer>();
    }

    public static void writeFileTree(String path, TreeSet<Booking> objs){
        File file = new File(path);
        try(FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oop = new ObjectOutputStream(fos)) {
            if (!file.exists()){
                throw new Exception();
            }
            oop.writeObject(objs);
        } catch (FileNotFoundException e) {

        } catch (IOException e) {

        } catch (Exception e) {
        }
    }

    public static TreeSet<Booking> readFileTree(String path){
        TreeSet<Booking> bookings;
        File file = new File(path);
        try(FileInputStream fis = new FileInputStream(file);
            ObjectInputStream oos = new ObjectInputStream(fis)) {
            bookings = (TreeSet<Booking>) oos.readObject();
            return bookings;
        } catch (FileNotFoundException e) {

        } catch (IOException e) {

        } catch (ClassNotFoundException e) {

        }
        return new TreeSet<Booking>(new BookingComparator());
    }

    public static void writeFileArrayList(String path, List<Contract> objs){
        File file = new File(path);
        try(FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oop = new ObjectOutputStream(fos)) {
            if (!file.exists()){
                throw new Exception();
            }
            oop.writeObject(objs);
        } catch (FileNotFoundException e) {

        } catch (IOException e) {

        } catch (Exception e) {
        }
    }

    public static List<Contract> readFileArrayList(String path){
        List<Contract> contracts;
        File file = new File(path);
        try(FileInputStream fis = new FileInputStream(file);
            ObjectInputStream oos = new ObjectInputStream(fis)) {
            contracts = (List<Contract>) oos.readObject();
            return contracts;
        } catch (FileNotFoundException e) {

        } catch (IOException e) {

        } catch (ClassNotFoundException e) {

        }
        return new ArrayList<>();
    }
}
