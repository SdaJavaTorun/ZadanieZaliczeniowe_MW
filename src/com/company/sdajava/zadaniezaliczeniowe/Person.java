package com.company.sdajava.zadaniezaliczeniowe;

/**
 * Created by RENT on 2017-03-18.
 */
public class Person {

    String imie;
    String nazwisko;
    char plec = 'K' & 'M';
    int numerDzialu;
    float placa;
    int wiek;
    int liczbaDzieci;
    boolean stanCywilny;

    public Person (){

    }

    public Person(String imie, String nazwisko, char plec, int numerDzialu, float placa, int wiek, int liczbaDzieci, boolean stanCywilny) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.plec = plec;
        this.numerDzialu = numerDzialu;
        this.placa = placa;
        this.wiek = wiek;
        this.liczbaDzieci = liczbaDzieci;
        this.stanCywilny = stanCywilny;
    }

    private String getImie() {
        return imie;
    }

    private void setImie(String imie) {
        this.imie = imie;
    }

    private String getNazwisko() {
        return nazwisko;
    }

    private void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    private char getPlec() {
        return plec;
    }

    private void setPlec(char plec) {
        this.plec = plec;
    }

    private int getNumerDzialu() {
        return numerDzialu;
    }

    private void setNumerDzialu(int numerDzialu) {
        this.numerDzialu = numerDzialu;
    }

    private float getPlaca() {
        return placa;
    }

    private void setPlaca(float placa) {
        this.placa = placa;
    }

    private int getWiek() {
        return wiek;
    }

    private void setWiek(int wiek) {
        this.wiek = wiek;
    }

    private int getLiczbaDzieci() {
        return liczbaDzieci;
    }

    public void setLiczbaDzieci(int liczbaDzieci) {
        this.liczbaDzieci = liczbaDzieci;
    }

    private boolean isStanCywilny() {
        return stanCywilny;
    }

    private void setStanCywilny(boolean stanCywilny) {
        this.stanCywilny = stanCywilny;
    }

    @Override
    public String toString() {
        return "Person{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", plec=" + plec +
                ", numerDzialu=" + numerDzialu +
                ", placa=" + placa +
                ", wiek=" + wiek +
                ", liczbaDzieci=" + liczbaDzieci +
                ", stanCywilny=" + stanCywilny +
                '}';

    }

    public void podstawoweInfo (){
        System.out.println( imie +" " + nazwisko + " " + "Płaca: " + placa + " zł");
    }



}
