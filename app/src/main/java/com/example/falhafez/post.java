package com.example.falhafez;

import com.google.gson.annotations.SerializedName;

public class post {

    private String name;
    private String birthPlace;
    private int birthYearInLHijri;
    private int deathYearInLHijri;

    public post(String name, String birthPlace, int birthYearInLHijri, int deathYearInLHijri) {
        this.name = name;
        this.birthPlace = birthPlace;
        this.birthYearInLHijri = birthYearInLHijri;
        this.deathYearInLHijri = deathYearInLHijri;
    }

    public String getName() {
        return name;
    }

    public String getBirthPlace() {
        return birthPlace;
    }

    public int getBirthYearInLHijri() {
        return birthYearInLHijri;
    }

    public int getDeathYearInLHijri() {
        return deathYearInLHijri;
    }
}
