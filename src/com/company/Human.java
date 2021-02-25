package com.company;

import java.util.HashMap;

public class Human {
    private HashMap<Integer, String> passport = new HashMap();
    private String name;
    private int passportNumber;

    public HashMap<Integer, String> getPassport() {
        return passport;
    }

    public void setPassport(HashMap<Integer, String> passport) {
        this.passport = passport;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(int passportNumber) {
        this.passportNumber = passportNumber;
    }

    public Human(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "Имя человека " + name + '\'';
    }
    public  Human(){

    }
}
