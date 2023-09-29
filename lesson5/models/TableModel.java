package Study_2.ООП.homework.lesson5.models;

import Study_2.ООП.homework.lesson5.presenters.Model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

public class TableModel implements Model {

    private Collection<Table> tables;
    private ReservationsMemory reservationsMemory = new ReservationsMemory();

    /**
     * Получить все столики
     * @return
     */
    public Collection<Table> loadTables(){
        if (tables == null)
        {
            tables = new ArrayList<>();

            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
        }

        return tables;
    }

    /**
     * Бронирование столика
     * @param reservationDate Дата бронирования
     * @param tableNo Номер столика
     * @param name Имя клиента
     */
    public int reservationTable(Date reservationDate, int tableNo, String name){
        for (Table table: tables) {
            if (table.getNo() == tableNo){
                Reservation reservation = new Reservation(reservationDate, name);
                reservationsMemory.getReservations().add(reservation);
                return reservation.getId();
            }
        }
        throw new RuntimeException("Некорректный номер столика.");
    }

    /**
     * TODO: Разработать самостоятельно в рамках домашней работы
     * Поменять бронь столика
     * 
     * Если столик забронирован, отменяет бронь не изменяя память бронирования.
     */
    public boolean offReservationTable(int oldReservation){
        for (Reservation res: reservationsMemory.getReservations()) {
            if (res.getId() == oldReservation){
                return true;
            }
        }
        return false;
        // ...
        // TODO: Для создания новой брони, можно воспользоваться уже существующим методом reservationTable
    }

}
