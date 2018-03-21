package com.designpatterns.strategia_kaczki;

import com.designpatterns.strategia_kaczki.kwakanie.Piszcz;
import com.designpatterns.strategia_kaczki.latanie.NieLatam;

public class GumowaKaczka extends Kaczka {

    public GumowaKaczka() {
        kwakanieInterface = new Piszcz();
        latanieInterface = new NieLatam();
    }

    @Override
    public void wyswietl() {
        System.out.println("Jestem Gumowa Kaczka ! ");
    }

}
