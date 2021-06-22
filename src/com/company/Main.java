package com.company;

import com.company.composition.Dimenzije;
import com.company.composition.PC;
import com.company.composition.PcKuciste;
import com.company.composition.PcPloca;

public class Main {

    public static void main(String[] args) {
        Dimenzije dimenzije=new Dimenzije(120,50);
        PcKuciste pcKuciste=new PcKuciste("intel","HP",dimenzije);
        PcPloca pcPloca=new PcPloca("ACS120","Intel",4);
        PC thePc=new PC(pcKuciste, pcPloca);
        thePc.getPcPloca().loadProgram("Windows 10");

    }
}
