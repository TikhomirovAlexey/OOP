package Study_2.ООП.homework.lesson5.presenters;

import Study_2.ООП.homework.lesson5.models.Table;

import java.util.Collection;
import java.util.Date;

public class BookingPresenter implements ViewObserver {

    private final Model tableModel;
    private final View bookingView;
    public BookingPresenter(Model tableModel, View bookingView){
        this.tableModel = tableModel;
        this.bookingView = bookingView;
        bookingView.setObserver(this);
    }

    private Collection<Table> loadTables(){
        return tableModel.loadTables();
    }

    public void showTables(){
        bookingView.showTables(loadTables());
    }

    public void printReservationTableResult(int reservationId, Date orderDate){
        bookingView.printReservationTableResult(reservationId, orderDate);
    }

    public void printReservationTableError(String errorMessage){
        bookingView.printReservationTableError(errorMessage);
    }

    public void printChangeReservationTableResult(int oldReservation) {
        bookingView.printChangeReservationTableResult(oldReservation);
    }

    public void printChangeReservationTableError(int oldReservation){
        bookingView.printChangeReservationTableError(oldReservation);
    }

    @Override
    public void onReservationTable(Date orderDate, int tableNo, String name) {
        try
        {
            int reservationId = tableModel.reservationTable(orderDate, tableNo, name);
            printReservationTableResult(reservationId, orderDate);
        }
        catch (RuntimeException e){
            printReservationTableError(e.getMessage());
        }

    }

    /**
     * Проверяет, существует ли бронирование под данным номером. Если да, то отменяет и возвращает true, иначе сообщает, что бронь не существует.
     */
    public boolean offReservationTable(int oldReservation) {
        boolean reservationId = tableModel.offReservationTable(oldReservation);
        if(reservationId){
            printChangeReservationTableResult(oldReservation);
        } else printChangeReservationTableError(oldReservation);
        return reservationId;
    }

    /**
     * Если бронь отменена создает новую с нужными параметрами.
     */
    public void changeReservationTable(int oldReservation, Date orderDate, int tableNo, String name){
        if(offReservationTable(oldReservation))
            onReservationTable(orderDate, tableNo, name);
    }

}
