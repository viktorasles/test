/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dicegame;

/**
 *
 * @author vikto_000
 */
public class GameMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        GameEngine main = new GameEngine();
        Player playa = new Player();
        GameTurn gTurn = new GameTurn();

        while (main.answer == 0) {
            gTurn.showTurns();
            main.guess();
            gTurn.turnPlus();
            main.reveal();
            main.playAgain();


        }

    }

}
