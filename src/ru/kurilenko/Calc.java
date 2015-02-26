package ru.kurilenko;

public class Calc {
    private static int usages;

    static private void stats(){
        usages ++;
        System.out.println("Статистика посчитана!");
    }

    static void use(){
        usages++;
    }

    static int summ(int i, int j){
        stats();
        return i + j;
    }

    static int diff(int i, int j){
        stats();
        return i - j;
    }

    private Calc(){}

    public static int countUsages() {
        return usages;
    }
}
