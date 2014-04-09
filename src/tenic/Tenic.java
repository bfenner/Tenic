/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tenic;

import tenic.Ruestung;
import tenic.Held;
import java.awt.AWTException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



/**
 *
 * @author BFENNER
 */
public class Tenic {
    static Held held = new Held();
    static Kampf myBattle = new Kampf();
    static Ruestung myTank = new Ruestung();
    static Untersuchen myresearch = new Untersuchen();
      
     //Schlacht();
    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException, AWTException {
        // TODO code application logic here
       // Ruestung myTestRuestung = new Ruestung();
       // myTestRuestung.loadData("E:\\Documents\\Java\\Game Project\\Test.txt");
        //Klassen einbinden
        char Rüstung;
       myresearch.Action();
       Kampf fight1 = new Kampf(new Goblin(5));
       
  
    }


  static void abstand(){
  for( int i = 0; i < 25; i++ ) {
                System.out.println("");    
        }
  }
  
}


    
    
