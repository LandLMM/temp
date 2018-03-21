package com.designpatterns.strategia_kaczki;

import com.designpatterns.strategia_kaczki.kwakanie.Kwacz;
import com.designpatterns.strategia_kaczki.latanie.LatamBoMamSkrzydla;

public class DzikaKaczka extends Kaczka {

    public DzikaKaczka() {
        kwakanieInterface = new Kwacz();
        latanieInterface = new LatamBoMamSkrzydla();
    }

    public void wyswietl() {
        System.out.println("Jestem dzika kaczka !");
    }
}
