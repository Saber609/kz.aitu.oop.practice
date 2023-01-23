package kz.aitu.oop.practice.practice2;

import java.util.ArrayList;
import java.util.Objects;

public class Train {
    private Locomotives locomotive;
    private String id;
    private double travelTime;
    private ArrayList<Car> cars;

    private String direction;

    public Train(String id){
        this.id = id;
    }

    public Train(String id, Locomotives locomotive, double travelTime, ArrayList<Car> cars){
        this(id);
        this.cars = cars;
        this.locomotive = locomotive;
        this.travelTime = travelTime;
        this.direction = "Astana-Almaty";
    }

    public String getId() {
        return id;
    }

    public String getDirection() {
        return direction;
    }

    public ArrayList<Car> getCars() {
        return cars;
    }

    public double getTravelTime() {
        return travelTime;
    }

    public Locomotives getLocomotive() {
        return locomotive;
    }

    public void setCars(ArrayList<Car> cars) {
        this.cars = cars;
    }

    public void setLocomotive(Locomotives locomotive) {
        this.locomotive = locomotive;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public void setTravelTime(double travelTime) {
        this.travelTime = travelTime;
    }

    @Override
    public String toString() {
        return "Train id = " + id +" "+ locomotive + ", travelTime = " + travelTime + "hours, direction = "
                + direction + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Train train = (Train) o;
        return id.equals(train.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(locomotive, id, travelTime, cars, direction);
    }
}
