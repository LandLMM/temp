package com.designpatterns.factory_rabat;

import com.designpatterns.strategia_rabat.rebate.NoRebate;
import com.designpatterns.strategia_rabat.rebate.RebateInterface;
import com.designpatterns.strategia_rabat.rebate.TenPercentRebate;
import com.designpatterns.strategia_rabat.rebate.ThirtyPercentRebateForElectronicDevices;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

public class RebateFactory {

    public RebateInterface retrieveRebateInterface(LocalDate date) {
        int dayOfMonth = date.getDayOfMonth();
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        Month month = date.getMonth();
        if (dayOfMonth == 24 && month.equals(Month.DECEMBER))
            return new ThirtyPercentRebateForElectronicDevices();
        else if (dayOfWeek.equals(DayOfWeek.SATURDAY) || dayOfWeek.equals(DayOfWeek.SUNDAY))
            return new TenPercentRebate();
        else
            return new NoRebate();
    }
}
