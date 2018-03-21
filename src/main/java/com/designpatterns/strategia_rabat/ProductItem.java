package com.designpatterns.strategia_rabat;

public class ProductItem {

    public ProductItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    private Product product;
    private int quantity;

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void incrementQuantity() {
        this.quantity = this.quantity +1;
    }
}
