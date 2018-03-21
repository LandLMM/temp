package com.designpatterns.strategia_rabat;

import com.designpatterns.factory_rabat.RebateFactory;
import com.designpatterns.strategia_rabat.rebate.RebateInterface;
import com.designpatterns.strategia_rabat.rebate.TenPercentRebate;
import com.designpatterns.strategia_rabat.rebate.ThirtyPercentRebateForElectronicDevices;

import java.math.BigDecimal;
import java.math.MathContext;
import java.time.LocalDate;

import static java.time.LocalDate.*;

public class Test {


    public static void main(String[] args) {
        Product product = new Product("Gitara", new BigDecimal(50));
        Product product1 = new Product("Komputer", new BigDecimal(1000));
        Product product2 = new Product("Klapki", new BigDecimal(300));
        Product product3 = new Product("Mysz", new BigDecimal(100));

        RebateFactory rebateFactory = new RebateFactory();
        RebateInterface rebateInterface = rebateFactory.retrieveRebateInterface(of(2017,12,24));
        ShoppingCart shoppingCart = new ShoppingCart(rebateInterface);

        shoppingCart.addProduct(product);
        shoppingCart.addProduct(product);

        shoppingCart.addProduct(product1);
        shoppingCart.addProduct(product2);

        BigDecimal sum = shoppingCart.calculateShoppingCart();

        System.out.println(sum.round(MathContext.DECIMAL32));

        shoppingCart.setRebateInterface(new ThirtyPercentRebateForElectronicDevices());
        sum = shoppingCart.calculateShoppingCart();
        System.out.println(sum.round(MathContext.DECIMAL32));


    }

}
