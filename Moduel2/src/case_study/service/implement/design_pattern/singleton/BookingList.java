package case_study.service.implement.design_pattern.singleton;

import case_study.models.booking_contracts.Booking;
import case_study.utils.BookingComparator;
import case_study.utils.ReadAndWrite;

import java.util.TreeSet;

public class BookingList {
    private static TreeSet<Booking> bookingSet = null;

    private BookingList(){}

    public static TreeSet<Booking> getBookingSet() {
        TreeSet<Booking> bookingSet = new TreeSet<>(new BookingComparator());
        try {
            bookingSet = ReadAndWrite.readFileTree("src\\case_study\\data\\booking.csv");
        } catch (NullPointerException e) {
        }
        return bookingSet;
    }
}
