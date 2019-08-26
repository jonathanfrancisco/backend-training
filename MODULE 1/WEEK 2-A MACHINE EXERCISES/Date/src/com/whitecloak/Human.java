package com.whitecloak;


import java.time.LocalDate;
import java.time.Period;

public class Human {

    private String name;
    private String birthDate;

    public Human(String name, String birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public int getAge() {
        LocalDate currentDate = LocalDate.now();
        LocalDate birthDate = LocalDate.parse(this.birthDate);
        return Period.between(birthDate, currentDate).getYears();
    }

}
