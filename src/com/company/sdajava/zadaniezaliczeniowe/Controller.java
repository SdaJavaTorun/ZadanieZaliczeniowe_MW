package com.company.sdajava.zadaniezaliczeniowe;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by RENT on 2017-03-18.
 */
public class Controller {

    public UserInput userInput = new UserInput();
    public List <Person>  workerList = new ArrayList<>();

    public void addPerson ()throws IOException {
        System.out.println("Dodaję pracownika: ");
        workerList.add(userInput.populatePerson());
    }

    public void showWorkers () throws IOException{
        System.out.println("W firmie aktualnie pracuje " + workerList.size() + " pracowników"); // w trakcie tworzenia
    }



}
