package case_study.service.implement.design_pattern.singleton;

import case_study.models.booking_contracts.Booking;
import case_study.utils.BookingComparator;
import case_study.utils.ReadAndWrite;

import java.util.List;
import java.util.TreeSet;

public class BookingList {
    private static TreeSet<Booking> bookingSet = new TreeSet<>(new BookingComparator());

    private BookingList(){}

    public static TreeSet<Booking> getBookingSet() {
        bookingSet.clear();
        List<String[]> list = ReadAndWrite.read("src\\case_study\\data\\booking.csv");
        for (String[] item: list){
            bookingSet.add(new Booking(Integer.parseInt(item[0]),
                    item[1],
                    item[2],
                    item[3],
                    item[4],
                    item[5]));
        }
        return bookingSet;
    }
}
