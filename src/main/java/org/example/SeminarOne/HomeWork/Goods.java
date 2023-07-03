package org.example.SeminarOne.HomeWork;

public class Goods {
    private String name;
    private Double price;
    private Integer rank;

    public Goods() {
    }

    public Goods(String name, Double price, Integer rank) {
        this.name = name;
        this.price = price;
        this.rank = rank;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", rank=" + rank +
                '}';
    }
}
