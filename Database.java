package kz.aitu.oop.practice.practice2;

import java.util.ArrayList;

public class Database {
    protected static ArrayList<User> users = new ArrayList<>();
    protected static ArrayList<Train> trains = new ArrayList<>();
    protected static ArrayList<Ticket> tickets = new ArrayList<>();

    public static ArrayList<Train> getTrains() {
        return trains;
    }

    public static ArrayList<User> getUsers() {
        return users;
    }

    public static void setUsers(ArrayList<User> users) {
        Database.users = users;
    }

    public static void setTrains(ArrayList<Train> trains) {
        Database.trains = trains;
    }
}
