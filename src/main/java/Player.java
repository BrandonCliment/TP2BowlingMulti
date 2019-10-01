
import bowling.SinglePlayerGame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pedago
 */
public class Player {
    
    private String name;
    public SinglePlayerGame game;
   
    public Player(String s){
        this.name=s;
        this.game=new SinglePlayerGame();
    }
    
    public String getname(){
        return this.name;
    }
    

    
}
