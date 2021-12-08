package bsu.rfe.java.group6.lab1.ZAMARAEV.var13A;

public class Apple extends Food {
    private String size;

    public boolean equals(Object obj) {
        if (!(obj instanceof Apple)) {
            return false;
        } else if (this.size != null && ((Apple)obj).size != null) {
            return !this.size.equals(((Apple)obj).size) ? false : super.equals(obj);
        } else {
            return false;
        }
    }

    public String getSize() {
        return this.size;
    }

    public Apple(String size) {
        super("Яблоко");
        this.size = size;
    }

    public void consume() {
        System.out.println(this + " съедено");
    }

    public String toString() {
        String var10000 = super.toString();
        return var10000 + " размера '" + this.size.toUpperCase() + "'";
    }
}
