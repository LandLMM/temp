package com.designpatterns.strategia_rabat;

import com.designpatterns.strategia_rabat.rebate.RebateInterface;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private RebateInterface rebateInterface;

    private List<ProductItem> products;

    public ShoppingCart(RebateInterface rebateInterface) {
        this.rebateInterface = rebateInterface;
    }

    public void addProduct(Product product) {
        if(products == null)
            products = new ArrayList<>();
        boolean contain = false;
        for(ProductItem p : products) {
            if(p.getProduct().equals(product))
                contain = true;
        }
        if(contain) {
            for(ProductItem p : products) {
                if(p.getProduct().equals(product))
                    p.incrementQuantity();
            }
        } else {
            ProductItem productItem = new ProductItem(product,1);
            products.add(productItem);
        }
    }

    public void setRebateInterface(RebateInterface rebateInterface) {
        this.rebateInterface = rebateInterface;
    }


    public BigDecimal calculateShoppingCart() {
        return rebateInterface.calulateRebate(products);
    }
}
