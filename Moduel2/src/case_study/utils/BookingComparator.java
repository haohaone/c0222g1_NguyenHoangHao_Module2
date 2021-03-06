package case_study.utils;

import case_study.models.booking_contracts.Booking;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Comparator;

public class BookingComparator implements Comparator<Booking>{
    @Override
    public int compare(Booking o1, Booking o2) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/uuuu");
        LocalDate startDate1 = LocalDate.parse(o1.getStarTime(), formatter);
        LocalDate startDate2 = LocalDate.parse(o2.getStarTime(), formatter);
        LocalDate endDate1 = LocalDate.parse(o1.getEndTime(), formatter);
        LocalDate endDate2 = LocalDate.parse(o2.getEndTime(), formatter);
        if (startDate1.compareTo(startDate2) < 0){
            return  -1;
        }else  if (startDate1.compareTo(startDate2) > 0){
            return  1;
        }else {
            if (endDate1.compareTo(endDate2) > 0){
                return 1;
            }else if (endDate1.compareTo(endDate2) < 0){
                return  -1;
            }else {
                return 1;
            }
        }
    }
}
