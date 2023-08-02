package com.company.gadget;

public class Gadget extends ElectricDevice {

    private int price;
    private String model;
    private String producator;

    public Gadget(int capacitate, int kw, int oreIncarcare, String deumire) {
        super(capacitate, kw, oreIncarcare, deumire);
    }


    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getProducator() {
        return producator;
    }

    public void setProducator(String producator) {
        this.producator = producator;
    }
}
