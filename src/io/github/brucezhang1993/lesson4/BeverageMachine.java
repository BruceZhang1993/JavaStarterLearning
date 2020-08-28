package io.github.brucezhang1993.lesson4;

import java.util.*;

abstract class Beverage {
    public abstract String toString();
}

class Coffee extends Beverage {
    String type = "咖啡";
    Set<String> additions = new HashSet<>();
    static String[] availableAdditions = {"加糖", "加奶"};

    public void addAddition(String addition) {
        additions.add(addition);
    }

    @Override
    public String toString() {
        StringBuilder tmp = new StringBuilder();
        for (String addition: additions) {
            tmp.append(addition);
        }
        if (additions.isEmpty()) {
            tmp.append("普通");
        }
        tmp.append(type);
        return tmp.toString();
    }
}

class MineralWater extends Beverage {
    String type = "矿泉水";

    @Override
    public String toString() {
        return type;
    }
}

class Cola extends Beverage {
    String type = "可乐";
    String vendor;
    static String[] availableVendors = {"可口", "百事"};

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    @Override
    public String toString() {
        return vendor + type;
    }
}

public class BeverageMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("选择要购买的饮料");
        System.out.println("1. 咖啡");
        System.out.println("2. 矿泉水");
        System.out.println("3. 可乐");
        int choose = scanner.nextInt();
        scanner.nextLine();
        Beverage beverage;
        switch (choose) {
            case 1:
                beverage = new Coffee();
                break;
            case 2:
                beverage = new MineralWater();
                break;
            case 3:
                beverage = new Cola();
                break;
            default:
                return;
        }
        if (beverage instanceof Coffee) {
            for (String availableAddition : Coffee.availableAdditions) {
                System.out.print("是否" + availableAddition + "?(y/n)");
                String ch = scanner.nextLine();
                if ("y".equals(ch)) {
                    ((Coffee) beverage).addAddition(availableAddition);
                }
            }
        }
        if (beverage instanceof Cola) {
            System.out.println("选择可乐");
            for (int i = 1; i <= Cola.availableVendors.length; i++) {
                System.out.print(i + ": " + Cola.availableVendors[i - 1] + "可乐 ");
            }
            System.out.println();
            int choice = scanner.nextInt();
            ((Cola) beverage).setVendor(Cola.availableVendors[choice - 1]);
        }
        System.out.println("你选择购买 " + beverage);
    }
}
