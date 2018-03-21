package com.designpatterns.strategia_rabat.rebate;

import com.designpatterns.strategia_rabat.ProductItem;

import java.math.BigDecimal;
import java.util.List;

public interface RebateInterface {

    BigDecimal calulateRebate(List<ProductItem> products);

}
