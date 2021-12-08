package bsu.rfe.java.group6.lab1.ZAMARAEV.var13A;

public class Main {
    public Main() {
    }

    public static void main(String[] args) throws Exception {
        Food[] breakfast = new Food[args.length];

        for(int i = 0; i < args.length; ++i) {
            String[] parts = args[i].split("/");
            if (parts[0].equals("Cheese")) {
                breakfast[i] = new Cheese();
            } else if (parts[0].equals("Apple")) {
                breakfast[i] = new Apple(parts[1]);
            } else if (parts[0].equals("Tea")) {
                breakfast[i] = new Tea(parts[1]);
            }
        }

        Food[] var6 = breakfast;
        int var8 = breakfast.length;

        for(int var4 = 0; var4 < var8; ++var4) {
            Food item = var6[var4];
            item.consume();
        }

        Food food = new Tea("чёрный");

        System.out.println(food + ": " + countFoods(breakfast, food));
        printFoods(breakfast);
        System.out.println("Всего хорошего!");
    }

    static Integer countFoods(Food[] breakfast, Food food) {
        Integer count = 0;

        for(int i = 0; i < breakfast.length; ++i) {
            if (food.equals(breakfast[i])) {
                count = count + 1;
            }
        }

        return count;
    }

    static void printFoods(Food[] breakfast) {
        int c = 0;
        int a = 0;
        int p = 0;

        for(int i = 0; i < breakfast.length; ++i) {
            if (breakfast[i] instanceof Cheese) {
                ++c;
            } else if (breakfast[i] instanceof Apple) {
                ++a;
            } else if (breakfast[i] instanceof Tea) {
                ++p;
            }
        }

        System.out.println("CЫР - " + c);
        System.out.println("ЯБЛОКО - " + a);
        System.out.println("ЧАЙ - " + p);
    }
}