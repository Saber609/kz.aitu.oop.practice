package kz.aitu.oop.practice.practice2;

import java.util.Objects;

public class Locomotives {
    private double speed;
    private int carriageTraction;

    public Locomotives(){

    }

    public Locomotives(double speed, int carriageTraction){
        this.carriageTraction = carriageTraction;
        this.speed = speed;
    }

    public double getSpeed() {
        return speed;
    }

    public int getCarriageTraction() {
        return carriageTraction;
    }

    public void setCarriageTraction(int carriageTraction) {
        this.carriageTraction = carriageTraction;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Locomotive speed = " + speed + ", carriageTraction = " + carriageTraction;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Locomotives that = (Locomotives) o;
        return Double.compare(that.speed, speed) == 0 && carriageTraction == that.carriageTraction;
    }

    @Override
    public int hashCode() {
        return Objects.hash(speed, carriageTraction);
    }
}