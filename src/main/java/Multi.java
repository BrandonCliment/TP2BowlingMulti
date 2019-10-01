
import bowling.MultiPlayerGame;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pedago
 */
public class Multi implements MultiPlayerGame {
    ArrayList<Player> Joueurs = new ArrayList<Player>();

    @Override
    public String startNewGame(String[] playerName) throws Exception {
        for (int i=0; i<playerName.length;i++){
            Joueurs.add(new Player(playerName[i]));
        }
        return "Prochain tir : Joueur "+Joueurs.get(0).getname() + " tour n°"+ Joueurs.get(0).game.getFrameNumber() + ", boule n°" + Joueurs.get(0).game.getNextBallNumber();
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String lancer(int nombreDeQuillesAbattues) throws Exception {
        
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int scoreFor(String playerName) throws Exception {
        for (int i=0;i<Joueurs.size();i++){
            if (Joueurs.get(i).getname()==playerName){
                return Joueurs.get(i).game.score();
            }
        }
        throw new UnsupportedOperationException("Ptdr c ki"); //To change body of generated methods, choose Tools | Templates.
    }
    
}
