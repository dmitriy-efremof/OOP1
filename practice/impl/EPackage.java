package less1.practice.impl;

public enum EPackage {
    PLASTIC("пластик"), GLASS("стекло"), POLYETILEN("Полиэтилен"), PAPER("Бумага");

    private final String material;

    EPackage(String material) {
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }
}
