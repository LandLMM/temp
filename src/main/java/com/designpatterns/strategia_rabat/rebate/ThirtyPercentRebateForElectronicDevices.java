package com.designpatterns.strategia_rabat.rebate;

import com.designpatterns.strategia_rabat.Product;
import com.designpatterns.strategia_rabat.ProductItem;

import java.math.BigDecimal;
import java.util.List;

public class ThirtyPercentRebateForElectronicDevices implements RebateInterface {

    private BigDecimal rebate = new BigDecimal(0.7);


    @Override
    public BigDecimal calulateRebate(List<ProductItem> products) {
        BigDecimal sum = new BigDecimal(0);
        for(ProductItem p : products) {
            String productName = p.getProduct().getName();
            BigDecimal productPrice = p.getProduct().getPrice();
            BigDecimal productQuantity = new BigDecimal(p.getQuantity());
            if(productName.equals("Komputer") || productName.equals("Mysz")) {
                BigDecimal productPriceAfterDiscount = productPrice.multiply(rebate);
                sum = sum.add(productPriceAfterDiscount.multiply(productQuantity));
            } else {
                sum = sum.add(productPrice.multiply(productQuantity));
            }
        }
        return sum;
    }
}

