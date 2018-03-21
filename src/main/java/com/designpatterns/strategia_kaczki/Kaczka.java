package com.designpatterns.strategia_kaczki;

import com.designpatterns.strategia_kaczki.kwakanie.KwakanieInterface;
import com.designpatterns.strategia_kaczki.latanie.LatanieInterface;

public abstract class Kaczka {

    protected KwakanieInterface kwakanieInterface;

    protected LatanieInterface latanieInterface;


    public void wykonajKwacz() {
        kwakanieInterface.kwacz();
    }


    public void plywaj() {
        System.out.println("Plywaj ! ");
    }

    public void wykonajLec() {
        latanieInterface.lec();
    }

    public abstract void wyswietl();



    public void setKwakanieInterface(KwakanieInterface kwakanieInterface) {
        this.kwakanieInterface = kwakanieInterface;
    }


}
