package com.intermediate.classesandobjects;

public class CarsApp {
    /**
     * access modifiers
     * MODIFFIER    CLASS   PQCKAGE     SUBCLASS    WORLD
     * public       yes     yes         yes         yes
     * protected    yes     yes         yes         no
     * defqult      yes     yes         no          no
     * private      yes     no          no          no
     *
     *
     * @param args
     */
    public static void main(String[] args) {
        DodgeChallenger redDodgeChallenger = new DodgeChallenger("red", (byte)3, (short)450, (short)717, (short)7700, 40000, 15000, true);
        redDodgeChallenger.getDescription();
        redDodgeChallenger.startTheEngine();

        System.out.println("----------------------------------------------");
        DodgeChallenger orangeDodgeChallenger = new DodgeChallenger("orange", (byte)1, (short)392, (short)492, (short)6700, 30000, 10000, false);
        orangeDodgeChallenger.getDescription();
        orangeDodgeChallenger.startTheEngine();
    }

}
