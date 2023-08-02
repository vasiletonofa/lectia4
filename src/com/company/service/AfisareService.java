package com.company.service;

import com.company.figuri.Figura;
import com.company.gadget.ElectricDevice;
import com.company.gadget.Gadget;
import com.company.gadget.Laptop;
import com.company.gadget.Trotineta;

public class AfisareService {

    public void afisare(ElectricDevice electricDevice) { //  new Laptop()
        System.out.println("Device: " + electricDevice.getDeumire() +
                " capacitate: " +  electricDevice.getCapacitateBatereie() + " kw:" + electricDevice.getKw() +
                " ore incarcare: "+ electricDevice.getOreIncarcare());

    }

    public void calculareArea(Figura figura) { // Cerc
        figura.calculareArea();
    }

}
