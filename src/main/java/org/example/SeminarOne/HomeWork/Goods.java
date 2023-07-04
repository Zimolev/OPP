package org.example.SeminarOne.HomeWork;

public class Goods {
    private String name;
    private Double price;
    private Integer rank;

    public Goods(String name, Double price, Integer rank) {
        this.name = name;
        this.price = price;
        this.rank = rank;
    }
    public String getName() {
        return name;
    }
    public Double getPrice() {
        return price;
    }
    public Integer getRank() {
        return rank;
    }
}
