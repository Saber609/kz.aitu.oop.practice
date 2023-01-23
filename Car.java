package kz.aitu.oop.practice.practice2;

import java.util.Objects;

public class Car {
    private String id;
    private String name;
    private int capacity;

    public String getId() {
        return id;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return name + " id = " + id + ", capacity = " + capacity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return capacity == car.capacity && id.equals(car.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, capacity);
    }
}
