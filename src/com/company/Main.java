package com.company;

import com.company.auto.AutovehiculCombustibil;
import com.company.auto.AutovehiculElectric;
import com.company.gadget.Laptop;
import com.company.gadget.Trotineta;
import com.company.person.Programator;

public class Main {

    public static void main(String[] args) {

        // Object Oriented Programming - Programarea orientate pe obiect

        // Incapsularea - Protejare de modificare nedorita a unei clase

        // Mostenire - Mostenim toate metodele si variabilele de la clasa parinte

        // Manager, Programator -> Person

        Programator programator = new Programator();
        programator.setAge(22);
        programator.setNume("Ion");

//        AutovehiculElectric tesla = new AutovehiculElectric();
//        tesla.model = "Model 3";
//        tesla.producator = "Tesla";
//
//       AutovehiculCombustibil bmw = new AutovehiculCombustibil();
//       bmw.capacitateMotor = 3;
//       bmw.producator = "bmw";
//       bmw.model = "seria 3";

        Laptop laptop = new Laptop();
        laptop.setClaviatura("EN");
        laptop.setDeumire("HP");
        laptop.setOreIncarcare(2);

        Trotineta trotineta = new Trotineta();
        trotineta.setDeumire("Xiaomi");
        trotineta.setViteza(200);
        trotineta.setOreIncarcare(5);
    }
}
