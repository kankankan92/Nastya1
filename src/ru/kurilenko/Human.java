package ru.kurilenko;

public class Human {
    private static int population = 0;
    private String name;
    private float temperature;
    static float GOOD_TEMPERATURE_MAX = 37f;
    static float GOOD_TEMPERATURE_MIN = 35.6f;
    int money;
    static int RICH = 10_000;
    boolean male;

    public static int getPopulation() {
        return population;
    }

    public boolean healthy() {
        return temperature < GOOD_TEMPERATURE_MAX && temperature > GOOD_TEMPERATURE_MIN;
    }

    public String getHelloString() {
        return "Hello," + name;
    }

    public boolean wealthy() {
        return money >= RICH;
    }

    @Override
    public String toString() {
        return (male ? "Man" : "Woman") + " " + name;
    }


    public Human(String name, float temperature, int money, boolean male) {
        this.name = name;
        this.temperature = temperature;
        this.money = money;
        this.male = male;
        population++;
    }


    public String getName() {
        return name;
    }

}
