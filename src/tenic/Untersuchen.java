/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tenic;

import tenic.Diebesmantel;
import tenic.Magierschuhe;
import tenic.Kriegerhelm;
import tenic.Diebesstiefel;
import tenic.Magiermantel;
import tenic.Kriegerpanzer;
import tenic.Kriegerstiefel;
import tenic.Diebeskapuze;
import tenic.Kriegerhandschuhe;
import tenic.Magierhandschuhe;
import tenic.Diebeshandschuhe;
import tenic.Magierhut;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 *
 * @author BFENNER
 */
public class Untersuchen {
    
    public void Action() throws IOException{
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(isr);
        System.out.println("Du wachst auf in einem Raum. \n"
                + "  Du siehst dich um und endeckst folgendes: \n"
                + "Drei Truhen, eine Tuer.\n"
                + "Was möchtest du tun? \n"
                + "u Die Truhen untersuchen \n"
                + "g Durch die Tuer gehen");
        String eingabe;
        eingabe = buffer.readLine();
        Tenic.abstand();
        switch(eingabe) {
            case "u":
                System.out.println("Die Erste Truhe hat ein Schwertsymbol aus Eisen eingraviert. \n"
                        + "Die Zweite Truhe hat zwei Dolchesymbole aus Stahl eingraviert.\n"
                        + "Die Dritte Truhe hat ein Pentagramm aus Obsidian eingebrannt\n"
                        + "Welche Truhe willst du oeffnen?\n"
                        + " 1 Schwert Truhe\n"
                        + " 2 Dolch Truhe\n"
                        + " 3 Pentagramm Truhe\n"
                        + " g Durch die Tuer gehen");
                eingabe = buffer.readLine();
                if(eingabe.equals("1") || eingabe.equals("2") || eingabe.equals("3")){
                    switch (eingabe) {
                        case "1":
                            Tenic.held.brust = new Kriegerpanzer();
                            Tenic.held.fuss = new Kriegerstiefel();
                            Tenic.held.hand = new Kriegerhandschuhe();
                            Tenic.held.kopf = new Kriegerhelm();           
                            break;
                        case "2":   
                            Tenic.held.brust = new Diebesmantel();
                            Tenic.held.fuss = new Diebesstiefel ();
                            Tenic.held.kopf = new Diebeskapuze ();
                            Tenic.held.hand = new Diebeshandschuhe();
                        break;
                        case "3":
                            Tenic.held.brust = new Magiermantel();
                            Tenic.held.fuss = new Magierschuhe ();
                            Tenic.held.kopf = new Magierhut ();
                            Tenic.held.hand = new Magierhandschuhe();
                            break;
                    }
                    System.out.println("Du findest in der Truhe folgendes\n"
                        + Tenic.held.brust.nameP + "\n"
                        + Tenic.held.fuss.nameP+"\n"
                        + Tenic.held.hand.nameP+"\n"
                        + Tenic.held.kopf.nameP+"\n"
                        + "und ziehst es an.");
                }
                break;
            case "g":
                System.out.println("Darauf hin gehst du durch die Tuere.");
                eingabe = buffer.readLine();
                Tenic.abstand();
                
                break;
        }
    }
}