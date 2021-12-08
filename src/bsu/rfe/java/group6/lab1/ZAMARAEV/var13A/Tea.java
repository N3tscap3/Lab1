package bsu.rfe.java.group6.lab1.ZAMARAEV.var13A;

public class Tea extends Food {
    private String color;

    public boolean equals(Object obj) {
        if (!(obj instanceof Tea)) {
            return false;
        } else if (this.color != null && ((Tea)obj).color != null) {
            return !this.color.equals(((Tea)obj).color) ? false : super.equals(obj);
        } else {
            return false;
        }
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Tea(String color) {
        super("Чай");
        this.color = color;
    }

    public void consume() {
        System.out.println(this + " выпит");
    }

    public String toString() {
        String var10000 = super.toString();
        return var10000 + " цвета '" + this.color.toUpperCase() + "'";
    }
}

