package com.company.composition;

public class PC {
    private PcKuciste pcKuciste;
    private PcPloca pcPloca;

    public PC(PcKuciste pcKuciste, PcPloca pcPloca) {
        this.pcKuciste = pcKuciste;
        this.pcPloca = pcPloca;
    }

    public PcKuciste getPcKuciste() {
        return pcKuciste;
    }

    public PcPloca getPcPloca() {
        return pcPloca;
    }
}
