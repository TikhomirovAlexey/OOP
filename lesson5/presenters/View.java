package Study_2.ООП.homework.lesson5.presenters;

import Study_2.ООП.homework.lesson5.models.Table;

import java.util.Collection;
import java.util.Date;

public interface View {

    /**
     * Отображение списка столиков в приложении
     * @param tables список столиков
     */
    void showTables(Collection<Table> tables);

    /**
     * Установить наблюдателя, отслеживающего действия пользователя
     * @param observer наблюдатель
     */
    void setObserver(ViewObserver observer);

    void printReservationTableResult(int reservationNo, Date orderDate);

    void printReservationTableError(String errorMessage);

    void printChangeReservationTableResult(int oldReservation);

    void printChangeReservationTableError(int oldReservation);

}
