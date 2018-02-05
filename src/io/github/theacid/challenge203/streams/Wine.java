package io.github.theacid.challenge203.streams;

enum Line {
    PREMIUM, LUXURY
}

public class Wine {
    private String brand;
    private String name;
    private Line line;
    private double price;

    public Wine(String brand, String name, Line line, double price) {
        this.brand = brand;
        this.name = name;
        this.line = line;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Line getLine() {
        return line;
    }

    public void setLine(Line line) {
        this.line = line;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Wine{" +
                "brand='" + brand + '\'' +
                ", name='" + name + '\'' +
                ", line=" + line +
                ", price=" + price +
                '}';
    }
}
