/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import bowling.MultiPlayerGame;

/**
 *
 * @author pedago
 */
public class MultiTest {
    
        String[] players = { "John", "Paul", "Georges", "Ringo" };
        Multi mp = new Multi();
        
    
    public MultiTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        

        
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() throws Exception {
        System.out.println("New Test");
        System.out.println(mp.startNewGame(players));
    }
    
    @After
    public void tearDown() {
    }
    
    @Test // Premier joueur
    public void test1(){
        assertEquals(mp.Joueurs.get(0).getname(), "John");
        //System.out.println("MultiTest.test1()");
    }
    
    
    @Test // Premier joueur
    public void test2(){
        System.out.println(mp.lancer(10));
        System.out.println();
    }

    @Test // Premier joueur
    public void test3(){
        System.out.println(mp.lancer(3));
        System.out.println(mp.lancer(7));
        System.out.println();
    }
    
    @Test // Premier joueur
    public void test4(){
        System.out.println(mp.lancer(3));
        System.out.println(mp.lancer(4));
        System.out.println(mp.lancer(10));
        System.out.println(mp.lancer(5));
        System.out.println();
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
