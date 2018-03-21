package com.designpatterns.strategia_rabat.rebate;

import com.designpatterns.strategia_rabat.ProductItem;

import java.math.BigDecimal;
import java.util.List;

public class NoRebate implements RebateInterface {


    @Override
    public BigDecimal calulateRebate(List<ProductItem> products) {
        BigDecimal sum = new BigDecimal(0);
        for(ProductItem p : products) {
            BigDecimal productPrice = p.getProduct().getPrice();
            BigDecimal productQuantity = new BigDecimal(p.getQuantity());
            sum = sum.add(productPrice.multiply(productQuantity));
        }

        return sum;
    }
}
