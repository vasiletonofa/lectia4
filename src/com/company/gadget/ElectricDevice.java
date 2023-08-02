package com.company.gadget;

public class ElectricDevice {
    private int capacitateBatereie;
    private int kw;
    private int oreIncarcare;
    private String deumire;


    public ElectricDevice(int capacitate, int kw, int oreIncarcare, String deumire) {
        setCapacitateBatereie(capacitate);
        setKw(kw);
        setOreIncarcare(oreIncarcare);
        setDeumire(deumire);
    }


    public int getCapacitateBatereie() {
        return capacitateBatereie;
    }

    public void setCapacitateBatereie(int capacitateBatereie) {
        this.capacitateBatereie = capacitateBatereie;
    }

    public int getKw() {
        return kw;
    }

    public void setKw(int kw) {
        this.kw = kw;
    }

    public int getOreIncarcare() {
        return oreIncarcare;
    }

    public void setOreIncarcare(int oreIncarcare) {
        this.oreIncarcare = oreIncarcare;
    }

    public String getDeumire() {
        return deumire;
    }

    public void setDeumire(String deumire) {
        this.deumire = deumire;
    }
}
