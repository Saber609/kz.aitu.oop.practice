package kz.aitu.oop.practice.practice2;
import javax.xml.crypto.Data;
import java.util.Date;
import java.util.Scanner;

public class User {
    private String id;
    private String name;
    private int age;
    private boolean disability;
    private Ticket ticket;

    public User(){

    }
    public User(String id, String name, int age, boolean disability){
        this.age = age;
        this.id = id;
        this.name = name;
        this.disability = disability;
    }

    public String getId() {
        return id;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
    public boolean getDisability(){
        return disability;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void buyOrChangeTicket() {
        System.out.println("input month");
        int m = in.nextInt();
        System.out.println("input day");
        int d = in.nextInt();
        Date date = new Date(2023 - 1900, m - 1, d);
        Train t = chooseTrain();
        Car c = chooseCar(t);
        Ticket ticket = new Ticket(date, t, c);
        this.ticket = ticket;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDisability(boolean disability) {
        this.disability = disability;
    }

    public void returnTicket(){
        this.ticket = null;
    }

    public void changeTrain(Train train){
        this.ticket.setTrain(train);
    }

    public void changeCar(Car car){
        this.ticket.setCar(car);
    }
    Scanner in = new Scanner(System.in);

    public Train chooseTrain() {

        for (Train t : Database.trains){
            System.out.println(t);
        }
        System.out.println("input id");
        String tid = in.next();
        for(Train t : Database.trains){
            if(t.equals(new Train(tid))){
                return t;
            }
        }
        return null;
    }

    public Car chooseCar(Train t){
        for(Car c : t.getCars()){
            System.out.println(c);
        }
        System.out.println("input car id");
        String cid = in.next();
        for(Car c : t.getCars()){
            if(c.getId().equals(cid)){
                return c;
            }
        }
        return null;
    }
    @Override
    public String toString() {
        return "User id = " + id + ", name = " + name + ", age = " + age + ", disability = " + disability + ticket;
    }
}