package com.company;

import com.company.auto.Autovehicul;
import com.company.auto.AutovehiculCombustibil;
import com.company.auto.AutovehiculElectric;
import com.company.figuri.Cerc;
import com.company.figuri.Figura;
import com.company.figuri.Patrat;
import com.company.gadget.ElectricDevice;
import com.company.gadget.Gadget;
import com.company.gadget.Laptop;
import com.company.gadget.Trotineta;
import com.company.person.Programator;
import com.company.service.AfisareService;

public class Main {

    public static void main(String[] args) {

        // Object Oriented Programming - Programarea orientate pe obiect

        // Incapsularea - Protejare de modificare nedorita a unei clase

        // Mostenire - Mostenim toate metodele si variabilele de la clasa parinte

        // Abstractizarea - Obligatiunea copiilor de a implementa metodele abstracte ale parentelui

        // Polimorfizm - Posibiliatatea ca o clasa sa preia mai multe forme (Atunci cand clasa parinte poate primit ca parametru orice copil
        //                                                                              al sau si poate afisa metodele speicifice a acestora)

        // Manager, Programator -> Person

//        afisareAutovehicul(new AutovehiculCombustibil());
//        afisareAutovehicul(new AutovehiculElectric());
//
//
//        Autovehicul autovehiculCombustibil2 = new AutovehiculCombustibil();
//        Autovehicul autovehiculCombustibil3 = new AutovehiculElectric();

//        AfisareService afisareService = new AfisareService();
//
//        afisareService.afisare(new Gadget(5000, 50, 2, "Gadget"));
//        afisareService.afisare(new Laptop(2000, 20, 4, "Laptop"));
//        afisareService.afisare(new Trotineta(3000, 30, 3, "Trotineta"));
//        afisareService.afisare(new ElectricDevice(4000, 40, 4, "ElectricDevice"));


        Figura figura1 = new Patrat();
        Figura figura2 = new Cerc();

        figura1.calculareArea();
        figura2.calculareArea();


    }

//    public static void afisareAutovehiculComb(AutovehiculCombustibil autovehiculCombustibil) {
//        System.out.println(autovehiculCombustibil.getNume());
//        System.out.println(autovehiculCombustibil.getProducator());
//    }
//
//    public static void afisareAutovehiculElec(AutovehiculElectric  autovehiculElectric) {
//        System.out.println(autovehiculElectric.getNume());
//        System.out.println(autovehiculElectric.getProducator());
//    }

    public static void afisareAutovehicul(Autovehicul autovehicul) {
        System.out.println(autovehicul.getNume());
        System.out.println(autovehicul.getProducator());
    }

}
