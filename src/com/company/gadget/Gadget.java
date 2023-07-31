package com.company.gadget;

public class Gadget extends ElectricDevice {
    private String deumire;
    private int price;
    private String model;
    private String producator;

    public String getDeumire() {
        return deumire;
    }

    public void setDeumire(String deumire) {
        this.deumire = deumire;
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
