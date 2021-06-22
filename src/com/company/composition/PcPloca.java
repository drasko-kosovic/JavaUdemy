package com.company.composition;

public class PcPloca {
    private String model;
    private String proizvodjac;
    private int brojSlotova;

    public PcPloca(String model, String proizvodjac, int brojSlotova) {
        this.model = model;
        this.proizvodjac = proizvodjac;
        this.brojSlotova = brojSlotova;
    }

    public void loadProgram(String program){
        System.out.println("Ucitan je program "+program);

    }

    public String getModel() {
        return model;
    }

    public String getProizvodjac() {
        return proizvodjac;
    }

    public int getBrojSlotova() {
        return brojSlotova;
    }
}
