package com.company.composition;

public class PcKuciste {
    private String model;
    private String proizvodjac;
    private Dimenzije dimenzije;

    public PcKuciste(String model, String proizvodjac, Dimenzije dimenzije) {
        this.model = model;
        this.proizvodjac = proizvodjac;
        this.dimenzije = dimenzije;
    }

    public void pritisniDugme(){
        System.out.println("dugme je pritisnuto");
    }

    public String getModel() {
        return model;
    }

    public String getProizvodjac() {
        return proizvodjac;
    }

    public Dimenzije getDimenzije() {
        return dimenzije;
    }
}
