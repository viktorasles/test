/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dicegame;

import java.util.ArrayList;

/**
 *
 * @author vikto_000
 */
public class GameTurn {

    Die dice = new Die();
    Player playa = new Player();

    private int turns = 0;

    public int guessOne;

    public int guessTwo;

    public void turnPlus() {
        turns++;
    }

    public void showTurns() {
        System.out.println(turns);
    }

    public int getTurns() {

        return turns;
    }

//    ArrayList<Integer> gameStats = new ArrayList<Integer>();
//
//    public void addStats() {
//
//        gameStats.add(guessOne);
//        gameStats.add(guessTwo);
//        gameStats.add(playa.castedBet);
//        gameStats.add(playa.castedEarnings);
//        gameStats.add(playa.castedLoss);
//
//    }
//
////    public void addCompDice() {
//
//        gameStats.add(dice.firstDie());
//        gameStats.add(dice.secondDie());
//        gameStats.add(dice.diceSum);
//
//    }

}
