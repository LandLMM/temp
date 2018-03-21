package com.designpatterns.strategia_rabat.rebate;

import com.designpatterns.strategia_rabat.ProductItem;

import java.math.BigDecimal;
import java.util.List;

public class TenPercentRebate implements RebateInterface {

    private final BigDecimal rebate = new BigDecimal(0.9);

    @Override
    public BigDecimal calulateRebate(List<ProductItem> products) {
        BigDecimal sum = new BigDecimal(0);
        for(ProductItem p : products) {
            BigDecimal productPrice = p.getProduct().getPrice();
            BigDecimal productPriceAfterDiscount = productPrice.multiply(rebate);
            BigDecimal productQuantity = new BigDecimal(p.getQuantity());
            sum = sum.add(productPriceAfterDiscount.multiply(productQuantity));
        }

        return sum;
    }
}
