package kz.aitu.oop.practice.practice2;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Locomotives l1 = new Locomotives(66.3, 11);
        Locomotives l2 = new Locomotives(57.9, 7);
        Locomotives l3 = new Locomotives(74.2, 9);

        Car c1 = new DisabledCar("1");
        Car c2 = new Coupe("2");
        Car c3 = new Coupe("3");
        Car c4 = new Coupe("4");
        Car c5 = new Coupe("5");
        Car c6 = new Coach("6");
        Car c7 = new Coach("7");
        Car c8 = new Coach("8");
        Car c9 = new Coach("9");
        Car c10 = new Coach("10");
        Car c11 = new BoxCar();
        Car c12 = new RestaurantCar("11");
        Car c13 = new RestaurantCar("12");
        Car c14 = new SeatedCars("13");
        Car c15 = new SeatedCars("14");
        Car c16 = new LuxeCar("15");
        Car c17 = new LuxeCar("16");
        Car c18 = new LuxeCar("17");

        ArrayList<Car> a1 = new ArrayList<Car>();
        a1.add(c1);
        a1.add(c2);
        a1.add(c3);
        a1.add(c6);
        a1.add(c7);
        a1.add(c12);
        Train t1 = new Train("142", l1, 36.6, a1);
        Database.trains.add(t1);

        ArrayList<Car> a2 = new ArrayList<Car>();
        a2.add(c4);
        a2.add(c5);
        a2.add(c8);
        a2.add(c9);
        a2.add(c10);
        a2.add(c14);
        a2.add(c15);
        Train t2 = new Train("231", l2, 38.4, a2);
        Database.trains.add(t2);

        ArrayList<Car> a3 = new ArrayList<Car>();
        a3.add(c13);
        a3.add(c16);
        a3.add(c17);
        a3.add(c18);
        Train t3 = new Train("123", l3, 31.7, a3);
        Database.trains.add(t3);


        int a = 1;
        User u = new User();
        while (a != 0) {
            System.out.println("To register input 1, to buy or change a ticket 2," +
                    "\nto return ticket 3, to change train 4, to change car 5\n" +
                    "to quit 0");
            a = in.nextInt();
            if (a == 1) {
                System.out.println("input name");
                String name = in.next();
                u.setName(name);
                System.out.println("input age");
                a = in.nextInt();
                u.setAge(a);
                System.out.println("disability");
                boolean b = in.nextBoolean();
                u.setDisability(b);
                System.out.println(u.getDisability());
                Database.users.add(u);
            } else if (a == 2) {
                u.buyOrChangeTicket();
            } else if (a == 3) {
                u.returnTicket();
            } else if (a == 4) {
                Train t = u.chooseTrain();
                u.changeTrain(t);
            } else if(a == 5){
                Car c = u.chooseCar(u.getTicket().getTrain());
                u.changeCar(c);
            } else if(a == 0){
                break;
            }
        }

        System.out.println(u);

    }
}