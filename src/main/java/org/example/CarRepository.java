package org.example;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;



public class CarRepository {

    static List<Car> cars = new ArrayList<>();

    static List<org.example.Owner> owners = new ArrayList<>();

    static {

        cars.add(new Car(101, "Thar", "Manhindra", Date.valueOf("2020-05-07"), "MH02AG4528"));

        cars.add(new Car(205, "Thar", "Manhindra", Date.valueOf("2018-09-07"), "MH16AG4520"));

        cars.add(new Car(456, "Dzire", "Maruti", Date.valueOf("2016-05-07"), "HR02AG4523"));

        cars.add(new Car(157, "Sonet", "KIA", Date.valueOf("2024-05-07"), "MH02AP4588"));

        cars.add(new Car(752, "Sierra", "Tata", Date.valueOf("2025-05-07"), "MH02AG4528"));

        cars.add(new Car(951, "Nexon", "Tata", Date.valueOf("2026-05-17"), "MH02AG4028"));

        cars.add(new Car(188, "Nexon", "Tata", Date.valueOf("2022-05-07"), "MH02AG1526"));

        cars.add(new Car(305, "Alto", "Maruti", Date.valueOf("2018-05-07"), "PB02AG4523"));

        cars.add(new Car(177, "Swift", "Maruti", Date.valueOf("2017-05-07"), "MH06AG4528"));

        cars.add(new Car(101, "Swift", "Manhindra", Date.valueOf("2015-05-07"), "HP02AG4528"));

        cars.add(new Car(166, "Nexon", "Tata", Date.valueOf("2021-05-07"), "HP02AG4500"));

        cars.add(new Car(167, "Nexon", "Tata", Date.valueOf("2021-05-07"), "HP02AG4501"));



        owners.add(new org.example.Owner(21, "Sumit", "male", List.of(cars.get(0), cars.get(1))));

        owners.add(new org.example.Owner(12, "vipin", "male", null));

        owners.add(new org.example.Owner(26, "Rajni", "female", List.of(cars.get(7), cars.get(6), cars.get(3))));

        owners.add(new org.example.Owner(35, "Amita", "female", List.of(cars.get(4), cars.get(8))));

        owners.add(new org.example.Owner(96, "Ram", "male", List.of(cars.get(9))));

        owners.add(new org.example.Owner(48, "Krishan", "male", List.of(cars.get(10))));

        owners.add(new org.example.Owner(22, "Deepak", "male", List.of(cars.get(11))));

        owners.add(new org.example.Owner(51, "Geeta", "female", null));

        owners.add(new org.example.Owner(63, "Sachin", "male", null));



    }



    public static List<Car> getCars() {

        return cars;

    }



    public static List<org.example.Owner> getOwners() {

        return owners;

    }

}