package Study_2.ООП.homework.lesson5.models;

import java.util.ArrayList;
import java.util.Collection;

public class ReservationsMemory {
    
    private final Collection<Reservation> reservations = new ArrayList<>();

    public Collection<Reservation> getReservations() {
        return reservations;
    }
}
