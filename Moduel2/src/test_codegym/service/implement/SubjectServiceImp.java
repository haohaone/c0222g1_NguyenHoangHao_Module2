package test_codegym.service.implement;

import case_study.utils.ReadAndWrite;
import test_cinema.model.Interest;
import test_codegym.model.Subject;
import test_codegym.service.SubjectService;
import test_codegym.utils.ReadAndWriteSubject;
import test_codegym.utils.SubjectComparator;

import java.io.File;
import java.util.*;

public class SubjectServiceImp implements SubjectService {
    public static Scanner scanner = new Scanner(System.in);
    public static Set<Subject> subjects = getSubjects();
    public static String idRegex = "BC-[0-9]{4}", versionRegex = "[0-9]\\.[0-9]";

    public static Set<Subject> getSubjects() {
        Set<Subject> subjects = new TreeSet<>(new SubjectComparator());
        List<String[]> list = ReadAndWrite.read("src\\test_codegym\\data\\subject.csv");
        for (String[] item : list) {
            subjects.add(new Subject(
                    item[0],
                    item[1],
                    item[2],
                    item[3],
                    Integer.parseInt(item[4])));
        }
        return subjects;
    }

    @Override
    public void display() {
        subjects = getSubjects();
        for (Subject item : subjects) {
            System.out.println(item.toString());
        }
    }

    @Override
    public void edit() {
        subjects = getSubjects();
        System.out.println("Input id subject you want to edit");
        String id;

        while (true) {
            id = scanner.nextLine();
            if (id.matches(idRegex)) {
                break;
            } else {
                System.out.println("Your id is wrong format, it should be BC-XXXX");
            }
        }

        boolean check;
        check = false;
        Subject editSubject = null;

        for (Subject item : subjects) {
            if (id.equals(item.getId())){
                editSubject = item;
                check = true;
                break;
            }
        }

        if (check){
            System.out.println("Input name");
            String name = scanner.nextLine();
            editSubject.setName(name);

            System.out.println("Input version");
            String version;

            while (true) {
                version = scanner.nextLine();
                if (version.matches(versionRegex)) {
                    break;
                } else {
                    System.out.println("Your id is wrong format, it should be X.X");
                }
            }
            editSubject.setVersion(version);

            String level = "";
            int choice = 0;
            boolean flag = true;
            while (flag) {
                System.out.println("---Choice difficult level---");
                System.out.println("1. Easy");
                System.out.println("2. Normal");
                System.out.println("3. Hard");
                try {
                    choice = Integer.parseInt(scanner.nextLine());
                } catch (NumberFormatException e) {
                    System.err.println("Input wrong format");
                    ;
                }
                switch (choice) {
                    case 1:
                        level = "Easy";
                        flag = false;
                        break;
                    case 2:
                        level = "Normal";
                        flag = false;
                        break;
                    case 3:
                        level = "Hard";
                        flag = false;
                        break;
                }
                if (flag) {
                    System.out.println("Your choice is wrong");
                }
            }
            editSubject.setDifficultLevel(level);

            System.out.println("Input time");
            int time;
            while (true) {
                try {
                    time = Integer.parseInt(scanner.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    System.err.println("Input wrong format");
                    ;
                }
            }
            editSubject.setTime(time);
            File file = new File("src\\test_codegym\\data\\subject.csv");
            file.delete();

            for (Subject item : subjects) {
                ReadAndWriteSubject.write("src\\test_codegym\\data\\subject.csv", item.getLine());
            }
            System.out.println("Edit successful");
        }else {
            System.out.println("your input id is not in list");
        }

    }

    @Override
    public void deleteById() {
        subjects = getSubjects();
        System.out.println("Input id subject you want to delete");
        String id;

        while (true) {
            id = scanner.nextLine();
            if (id.matches(idRegex)) {
                break;
            } else {
                System.out.println("Your id is wrong format, it should be BC-XXXX");
            }
        }

        boolean check = true;
        for (Subject item : subjects) {
            if (id.equals(item.getId())){
                subjects.remove(item);
                check = false;
                break;
            }
        }
        if (check){
            System.out.println("your input id is not in list");
        }else {
            File file = new File("src\\test_codegym\\data\\subject.csv");
            file.delete();

            for (Subject item : subjects) {
                ReadAndWriteSubject.write("src\\test_codegym\\data\\subject.csv", item.getLine());
            }
            System.out.println("Delete successful");
        }
    }

    @Override
    public void addNew() {
        subjects = getSubjects();
        System.out.println("Input id");
        String id;
        boolean check;
        while (true) {
            check = false;
            while (true) {
                id = scanner.nextLine();
                if (id.matches(idRegex)) {
                    break;
                } else {
                    System.out.println("Your id is wrong format, it should be BC-XXXX");
                }
            }

            for (Subject item : subjects) {
                if (id.equals(item.getId())) {
                    check = true;
                    break;
                }
            }
            if (check) {
                System.out.println("your input id is already in list");
            } else {
                break;
            }
        }

        System.out.println("Input name");
        String name = scanner.nextLine();

        System.out.println("Input version");
        String version;

        while (true) {
            version = scanner.nextLine();
            if (version.matches(versionRegex)) {
                break;
            } else {
                System.out.println("Your id is wrong format, it should be X.X");
            }
        }

        String level = "";
        int choice = 0;
        boolean flag = true;
        while (flag) {
            System.out.println("---Choice difficult level---");
            System.out.println("1. Easy");
            System.out.println("2. Normal");
            System.out.println("3. Hard");
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.err.println("Input wrong format");
                ;
            }
            switch (choice) {
                case 1:
                    level = "Easy";
                    flag = false;
                    break;
                case 2:
                    level = "Normal";
                    flag = false;
                    break;
                case 3:
                    level = "Hard";
                    flag = false;
                    break;
            }
            if (flag) {
                System.out.println("Your choice is wrong");
            }
        }

        System.out.println("Input time");
        int time;
        while (true) {
            try {
                time = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.err.println("Input wrong format");
                ;
            }
        }

        Subject subject = new Subject(id, name, version, level, time);
        ReadAndWriteSubject.write("src\\test_codegym\\data\\subject.csv", subject.getLine());
        System.out.println("Add new successful");
    }
}
