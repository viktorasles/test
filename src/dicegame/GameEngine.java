/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dicegame;

import javax.swing.JOptionPane;

/**
 *
 * @author vikto_000
 */
public class GameEngine {

    Die dice = new Die();
    Player playa = new Player();
    GameTurn gTurn = new GameTurn();

    int answer = 0;

    public void guess() {

        dice.roll();
//        gTurn.addCompDice();
        String bet = JOptionPane.showInputDialog(null, "You have " + playa.getCredits() + " credits. \n How much would you like to bet?");
        String[] vals3 = bet.split("\\s+");
        playa.theBet = Integer.parseInt(vals3[0]);

        if (playa.theBet <= playa.getCredits()) {

            JOptionPane.showMessageDialog(null, "The computer has rolled " + dice.diceSum + " what were the face values of the dice?");
            String firstGuess = JOptionPane.showInputDialog(null, "Guess the value of one of the dice");
            String secondGuess = JOptionPane.showInputDialog(null, "Guess the value of the other die");
            String[] vals = firstGuess.split("\\s+");
            gTurn.guessOne = Integer.parseInt(vals[0]);
            String[] vals2 = secondGuess.split("\\s+");
            gTurn.guessTwo = Integer.parseInt(vals2[0]);
        } else {
            JOptionPane.showMessageDialog(null, "You cannot bet more than you own :)");
            guess();
        }
        playa.BalanceSubtract();

    }

    public void reveal() {
        JOptionPane.showMessageDialog(null, "The computer rolled " + dice.firstDie() + " and " + dice.secondDie()
                + " \n You have guessed " + gTurn.guessOne + " and " + gTurn.guessTwo);
        if ((gTurn.guessOne == dice.firstDie() && gTurn.guessTwo == dice.secondDie()) || (gTurn.guessOne == dice.secondDie() && gTurn.guessTwo == dice.firstDie())) {
            JOptionPane.showMessageDialog(null, "Great Succsess!");
            if (dice.diceSum == 2 || dice.diceSum == 3 || dice.diceSum == 11 || dice.diceSum == 12) {
                playa.setCredits(playa.theBet * 1.5);
                playa.BalanceAdd();
                JOptionPane.showMessageDialog(null, "Congrats!  You now have " + playa.getCredits() + " credits!");

            } else if (dice.diceSum == 4 || dice.diceSum == 5 || dice.diceSum == 9 || dice.diceSum == 10) {
                playa.setCredits(playa.theBet * 2);
                playa.BalanceAdd();
                JOptionPane.showMessageDialog(null, "Congrats! You now have " + playa.getCredits() + " credits!");

            } else if ( dice.diceSum == 6 || dice.diceSum == 7 ){
                playa.setCredits(playa.theBet * 3);
                playa.BalanceAdd();
                JOptionPane.showMessageDialog(null, "Congrats!  You now have " + playa.getCredits() + " credits!");

            }
        } else {
            JOptionPane.showMessageDialog(null, "Sorry, you lost your bet \n You have " + playa.getCredits() + " credits left.");

        }
//        gTurn.addStats();
//        System.out.println(gTurn.gameStats);

    }

    public int playAgain() {

        if (playa.getCredits() == 0) {

            JOptionPane.showMessageDialog(null, "You're out of credit :((( ");
            answer = 1;

        } else {

            int playOrQuit = JOptionPane.QUESTION_MESSAGE;
            String[] choice = {"Play again", "End and show stats"};
            answer = JOptionPane.showOptionDialog(null,
                    "Would you like to play again?", "Option Dialog Box", 0, playOrQuit, null, choice, "Play again");

        }
        return answer;
    }

}
