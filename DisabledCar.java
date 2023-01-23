package kz.aitu.oop.practice.practice2;

public class DisabledCar extends Car{
    public DisabledCar(String id){
        this.setCapacity(5);
        this.setId(id);
        this.setName("disable car");
    }
}
