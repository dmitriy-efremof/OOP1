package less1.practice;

import less1.practice.impl.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ProductMain {

    public static void main(String[] args) {
        Product bottle1 = new BottleOfWater("Родники", 55, LocalDate.of(2024, 5, 1));

        Product bottle2 = new BottleOfWater("Родники Газированная", 55, LocalDate.of(2024, 5, 1),
                true, EPackage.GLASS.getMaterial(), 0.5F);

        VendingMachine vm = new WaterVendingMachine();

        System.out.println(vm.getProducts());

        vm.addProducts(List.of(bottle1, bottle1, bottle1, bottle2, bottle2, bottle2));

        System.out.println(vm.getProducts());

        vm.getProduct("Родники");

        System.out.println(vm.getProducts());

        Product Coffee = new HotDrink("Кофе", 120, LocalDate.of(2024, 6, 24), 70, 0.33F, EPackage.PAPER.getMaterial());

        Product GreenTea = new HotDrink("Зеленый чай", 70, LocalDate.of(2024, 6, 24), 100, 0.4F, EPackage.PAPER.getMaterial());

        Product BlackTea = new HotDrink("Черный чай", 80, LocalDate.of(2024, 6, 24), 100, 0.4F, EPackage.PAPER.getMaterial());

        VendingMachine hvm = new HDVendingMachine();

        System.out.println(hvm.getProducts());

        hvm.addProducts(List.of(Coffee, GreenTea, BlackTea));

        System.out.println(hvm.getProducts());
    }
}
