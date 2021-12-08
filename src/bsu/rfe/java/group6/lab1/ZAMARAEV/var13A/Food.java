package bsu.rfe.java.group6.lab1.ZAMARAEV.var13A;

public class Food implements Consumable {
    private String name;

    public String getName() {
        return this.name;
    }

    public Food(String name) {
        this.name = name;
    }

    public String toString() {
        return this.name;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Food)) {
            return false;
        } else {
            return this.name != null && ((Food)obj).name != null ? this.name.equals(((Food)obj).name) : false;
        }
    }

    @Override
    public void consume() {

    }
}