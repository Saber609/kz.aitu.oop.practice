package kz.aitu.oop.practice.practice2;

import java.util.Date;
import java.util.Objects;

public class Ticket {
    private Date date;
    private Train train;
    private Car car;

    public Ticket(){}
    public Ticket(Date date, Train train, Car car){
        this.car = car;
        this.date = date;
        this.train = train;
    }

    public Car getCar() {
        return car;
    }

    public Date getDate() {
        return date;
    }

    public Train getTrain() {
        return train;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setTrain(Train train) {
        this.train = train;
    }

    @Override
    public String toString() {
        return ", Ticket date = " + date + train + car;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ticket ticket = (Ticket) o;
        return date.equals(ticket.date) && train.equals(ticket.train) && car.equals(ticket.car);
    }

    @Override
    public int hashCode() {
        return Objects.hash(date, train, car);
    }
}
