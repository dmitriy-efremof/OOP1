package less1.practice.impl;

import less1.practice.Product;
import less1.practice.VendingMachine;

import java.util.List;

public class HDVendingMachine extends VendingMachine {
    public HDVendingMachine() { super(); }

    public HDVendingMachine(List<Product> products) { super(products); }

    @Override
    public void addProducts(List<Product> products) { this.products.addAll(products); }
}
