package case_study.service.implement.regex;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.ResolverStyle;
import java.util.Scanner;

public class BookingRegex {
    public static Scanner scanner = new Scanner(System.in);

    public static void dateTimeCheck(String startTime) throws Exception {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/uuuu").withResolverStyle(ResolverStyle.STRICT);
        LocalDate.parse(startTime, formatter);
    }

    public static String time(){
        String time;
        while (true) {
            try {
                time = scanner.nextLine();
                dateTimeCheck(time);
                break;
            } catch (Exception e) {
                System.err.println("Input wrong format");
            }
        }
        return time;
    }
}
