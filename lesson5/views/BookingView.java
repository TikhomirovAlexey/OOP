package Study_2.ООП.homework.lesson5.views;

import Study_2.ООП.homework.lesson5.models.Table;
import Study_2.ООП.homework.lesson5.presenters.View;
import Study_2.ООП.homework.lesson5.presenters.ViewObserver;

import java.util.Collection;
import java.util.Date;

public class BookingView implements View {

    private ViewObserver observer;

    /**
     * Установить наблюдателя, отслеживающего действия пользователя
     * @param observer наблюдатель
     */
    public void setObserver(ViewObserver observer){
        this.observer = observer;
    }

    @Override
    public void printReservationTableResult(int reservationNo, Date orderDate) {
        System.out.printf("Столик успешно забронирован. Номер вашей брони: #%d. Дата бронирования: %s\n", reservationNo, orderDate);
    }

    @Override
    public void printChangeReservationTableResult(int oldReservation) {
        System.out.printf("Бронь #%d успешно отменена.\n", oldReservation);
    }

    @Override
    public void printChangeReservationTableError(int oldReservation) {
        System.out.printf("Бронь #%d не существует.\n", oldReservation);
    }

    @Override
    public void printReservationTableError(String errorMessage) {
        System.out.printf("Невозможно забронировать столик. \n%s\n", errorMessage);
    }

    @Override
    public void showTables(Collection<Table> tables) {
        for (Table table: tables) {
            System.out.println(table);
        }
    }

    public void reservationTable(Date reservationDate, int tableNo, String name){
        observer.onReservationTable(reservationDate, tableNo, name);
    }

    /**
     * TODO: реализовать функционал изменения бронирования столика самостоятельно в рамках домашнего задания
     * Действие клиента (пользователь нажал на кнопку изменения бронирования столика)
     * @param oldReservation идентификатор бронирования (старый)
     * @param reservationDate дата бронирования
     * @param tableNo номер столика
     * @param name имя
     */
    public void changeReservationTable(int oldReservation, Date reservationDate, int tableNo, String name){
        observer.changeReservationTable(oldReservation, reservationDate, tableNo, name);
    }

}
