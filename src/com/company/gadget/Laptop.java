package com.company.gadget;

public class Laptop extends Gadget {
    private String cpu;
    private String sistemOperarare;
    private String claviatura;
    private String monitor;

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getSistemOperarare() {
        return sistemOperarare;
    }

    public void setSistemOperarare(String sistemOperarare) {
        this.sistemOperarare = sistemOperarare;
    }

    public String getClaviatura() {
        return claviatura;
    }

    public void setClaviatura(String claviatura) {
        this.claviatura = claviatura;
    }

    public String getMonitor() {
        return monitor;
    }

    public void setMonitor(String monitor) {
        this.monitor = monitor;
    }
}
