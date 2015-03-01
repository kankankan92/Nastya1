package ru.kurilenko;

public class Car {

    private int probeg;
    private static int totalProbeg;

    public int run(int km){
        probeg = probeg + km;
        totalProbeg = totalProbeg + km;
        return km;
    }

    public static int stats(){
        return totalProbeg;
    }

    public int getProbeg() {
        return probeg;
    }

}
