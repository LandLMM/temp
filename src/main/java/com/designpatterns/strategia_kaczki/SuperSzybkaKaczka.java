package com.designpatterns.strategia_kaczki;

import com.designpatterns.strategia_kaczki.kwakanie.SuperKwacz;
import com.designpatterns.strategia_kaczki.latanie.LatamBoMamSkrzydla;

public class SuperSzybkaKaczka extends Kaczka {

    public SuperSzybkaKaczka() {
        kwakanieInterface = new SuperKwacz();
        latanieInterface = new LatamBoMamSkrzydla();
    }

    @Override
    public void wyswietl() {
        System.out.println("Jestem super szybka kaczka !");
    }

}
