package com.company.sdajava.zadaniezaliczeniowe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;

/**
 * Created by RENT on 2017-03-18.
 */
public class UserInput {

    public Person populatePerson() throws IOException {

        Person person = new Person(); //Tworzymy nowego pracownika w konsoli

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));


        try {

            System.out.println("Proszę uzupełnić dane pracownika");


            System.out.println("Imię pracownika: ");
            person.imie = bufferedReader.readLine();
            System.out.println("Nazwisko pracownika: ");
            person.nazwisko = bufferedReader.readLine();
            System.out.println("Płeć: ");
            System.out.println("Wprowadź K lub M");

            person.plec = (char) bufferedReader.read();

            do {
                person.plec = (char) bufferedReader.read();
            } while (person.plec == 'K' || person.plec == 'M');

            System.out.println("Numer działu: ");
            person.numerDzialu = bufferedReader.read();
            System.out.println("Płaca: ");
            person.placa = bufferedReader.read();
            System.out.println("Wiek: ");
            person.wiek = bufferedReader.read();
            System.out.println("Liczba dzieci: ");
            person.liczbaDzieci = bufferedReader.read();
            System.out.println("Stan cywilny: ");
            person.stanCywilny = bufferedReader.ready();

        } catch (InputMismatchException error) {
            System.out.println("Błąd: zły format danych");
            System.exit(1);   // dobrze by było, gdyby po wpisaniu złych danych nie wypieprzało nas z programu..
        }
        return person;
    }
}







