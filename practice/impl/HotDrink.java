package less1.practice.impl;

import less1.practice.Product;

import java.time.LocalDate;

public class HotDrink extends Product {
    private int temperature;
    private float volume;
    private String pack;

    public HotDrink(String name, double price, LocalDate releaseDate, int temperature) {
        super(name, price, releaseDate);
        this.temperature = 70;
        this.volume = 0.33f;
        this.pack = EPackage.PAPER.getMaterial();
    }

    public HotDrink(String name, double price, LocalDate releaseDate, int temperature, float volume, String pack) {
        super(name, price, releaseDate);
        this.temperature = temperature;
        this.volume = volume;
        this.pack = pack;
    }

    public int getTemperature() {
        return temperature;
    }

    public float getVolume() {
        return volume;
    }

    public String getPack() {
        return pack;
    }

    @Override
    public String toString() {
//        return super.toString() + "Температура напитка: " + temperature;
        return "HotDrink{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", releaseDate=" + releaseDate +
                ", Температура напитка:" + temperature +
                ", volume=" + volume +
                ", pack='" + pack + '\'' +
                '}';
    }
}
