package org.example.StreamAPI;



import Car;

import java.util.List;



public class Owner {

    int ownerid;

    String name;

    String gender;

    List<Car> cars;



    public Owner(int ownerid, String name, String gender, List<Car> cars) {

        super();

        this.ownerid = ownerid;

        this.name = name;

        this.gender = gender;

        this.cars = cars;

    }



    public int getOwnerid() {

        return ownerid;

    }



    public void setOwnerid(int ownerid) {

        this.ownerid = ownerid;

    }



    public String getName() {

        return name;

    }



    public void setName(String name) {

        this.name = name;

    }



    public String getGender() {

        return gender;

    }



    public void setGender(String gender) {

        this.gender = gender;

    }



    public List<Car> getCars() {

        return cars;

    }



    public void setCars(List<Car> cars) {

        this.cars = cars;

    }



    @Override

    public String toString() {

        return "Owner [ownerid=" + ownerid + ", name=" + name + ", gender=" + gender + ", cars=" + cars + "]";

    }



}