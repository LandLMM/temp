package com.designpatterns.strategia_kaczki;

import com.designpatterns.strategia_kaczki.kwakanie.NieKwacze;
import com.designpatterns.strategia_kaczki.latanie.LatamBoMamSkrzydla;

public class PlaskonosKaczka extends Kaczka {

    public PlaskonosKaczka() {
        kwakanieInterface = new NieKwacze();
        latanieInterface = new LatamBoMamSkrzydla();
    }

    public void wyswietl() {
        System.out.println("Jestem plaskonosa kaczka !");
    }
}
