package Study_2.ООП.homework.lesson5.presenters;

import java.util.Date;

public interface ViewObserver {

    void onReservationTable(Date orderDate, int tableNo, String name);

    boolean offReservationTable(int oldReservation);

    void changeReservationTable(int oldReservation, Date orderDate, int tableNo, String name);
}
