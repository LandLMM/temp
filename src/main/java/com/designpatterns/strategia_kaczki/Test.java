package com.designpatterns.strategia_kaczki;

import com.designpatterns.strategia_kaczki.kwakanie.Kwacz;

import java.util.ArrayList;
import java.util.List;

public class Test {


    public static void main(String[] args) {
        List<Kaczka> kaczkas = new ArrayList<Kaczka>();
        Kaczka dzikaKaczka = new DzikaKaczka();

        kaczkas.add(dzikaKaczka);

        Kaczka plaskonos = new PlaskonosKaczka();
        kaczkas.add(plaskonos);

        Kaczka gumowaKaczka = new GumowaKaczka();
        kaczkas.add(gumowaKaczka);

        Kaczka superSzybka = new SuperSzybkaKaczka();
        kaczkas.add(superSzybka);

        kaczkas.forEach(kaczka -> {
            kaczka.wyswietl();
            kaczka.plywaj();
            kaczka.wykonajKwacz();
            kaczka.wykonajLec();
        });

        kaczkas.forEach(kaczka -> {
            kaczka.setKwakanieInterface(new Kwacz());
        });

        kaczkas.forEach(kaczka -> {
            kaczka.wyswietl();
            kaczka.plywaj();
            kaczka.wykonajKwacz();
            kaczka.wykonajLec();
        });
    }
}
