package kz.bitlab.techorda.db;
public class Items {
    private int id;
    private String name;
    private String ram;
    private String memory;
    private String os;
    private double price;

    // Конструкторы
    public Items() {}

    public Items(int id, String name, String ram, String memory, String os, double price) {
        this.id = id;
        this.name = name;
        this.ram = ram;
        this.memory = memory;
        this.os = os;
        this.price = price;
    }

    // Геттеры и сеттеры
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
