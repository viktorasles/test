/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dicegame;

import java.util.Random;

/**
 *
 * @author vikto_000
 */
public class Die {

    private int dieA;     // A private variables to hold the eyes of my dice 
    private int dieB;
    public int diceSum;

    public int roll() // method to roll my dice and give the result
    {
        Random randomGenerator = new Random();
        dieA = randomGenerator.nextInt(6) + 1;
        dieB = randomGenerator.nextInt(6) + 1;
        diceSum = dieA + dieB;

        return diceSum;
    }

    public int firstDie() {
        return dieA;
    }

    public int secondDie() {
        return dieB;
    }

}
