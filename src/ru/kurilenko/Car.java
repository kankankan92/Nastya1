package ru.kurilenko;

public class Car {

    private int probeg;
    private static int totalProbeg;

    public void run(int km){
        probeg = probeg + km;
        totalProbeg = totalProbeg + probeg;
    }

    public static int stats(){
        return totalProbeg;
    }

    public int getProbeg() {
        return probeg;
    }

}
