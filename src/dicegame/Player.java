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
public class Player {

    Die dice = new Die();

    private double credits = 100;

    double theBet;

    private double newCredits;

    public double getCredits() {
        
        return credits;
    }

    public void setCredits(double addCredits) {

        newCredits = addCredits;

    }

    public void BalanceSubtract() {

        credits = credits - theBet;
  
    }

    public void BalanceAdd() {

        credits = credits + newCredits;
  
    }
    
//    int castedBet = (int)theBet;
//    int castedEarnings = (int)BalanceAdd();
//    int castedLoss = (int)BalanceSubtract();
    
}
    
   

