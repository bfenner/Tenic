/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tenic;

import tenic.Held;
import tenic.Goblin;
import tenic.Wesen;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author BFENNER
 */
public class Kampf {
    
    public Kampf() {
        
    }
    
    public Kampf(Wesen gegner) throws IOException {
        //gegner.lebenspunkte = gegner.lebenspunkte - Tenic.held.schaden;
        //gegner.lebenspunkte -= Tenic.held.schaden;
        System.out.println("Ein " + gegner.name + " ist vor ihnen erschienen");
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(isr);
        String eingabe;
        eingabe = buffer.readLine();
        String Gegner = null;
        
        System.out.println(gegner.name + "\n"
                + "Level: " + gegner.Level + "\n"
                + "Starke: " + gegner.starke + "\n"
                + "Gerissenheit: " + gegner.gerissenheit + "\n"
                + "Zauberkraft: " + gegner.zauberkraft + "\n"
                + "Glueck: " + gegner.glueck + "\n"
                + "LP: " + gegner.lebenspunkte + "\n"
                + "MP: " + gegner.magiepunkte);
        
        do {
            System.out.println("LEVEL: " + Tenic.held.Level + "\n"
                    + "HP: " + Tenic.held.lebenspunkte + "\n"
                    + "MP: " + Tenic.held.magiepunkte);
            System.out.println("\n\nWas möchten sie tun? \n"
                    + " a Angreifen \n"
                    + " m Magie\n");
            
            eingabe = buffer.readLine();
            switch (eingabe) {
                case "a":
                    System.out.println("angriff");
                    gegner.lebenspunkte = gegner.lebenspunkte - Tenic.held.schaden;
                    System.out.println("Du hast " + Tenic.held.schaden + " Schaden angerichtet. \n"
                            + " Der " + gegner.name + " hat noch " + gegner.lebenspunkte + " Lebenspunkte");
                    break;
                case "m":
                    System.out.println("magie");
                    Tenic.abstand();
                    System.out.println("Welche Magie möchten sie Anwenden? \n"
                            + " f Feuer \n"
                            + " e Eis");
                    eingabe = buffer.readLine();
                    switch (eingabe) {
                        case "f":
                            Tenic.abstand();
                            if (Tenic.held.magiepunkte >= 0) {
                                gegner.lebenspunkte = gegner.lebenspunkte - 15;
                                Tenic.held.magiepunkte = Tenic.held.magiepunkte - 30;
                                System.out.println("Dein Feuerball fügt dem " + gegner.name + " 15 Schaden zu. \n"
                                        + gegner.name + " Lebenspunkte:" + gegner.lebenspunkte);
                            } else {
                                System.out.println("Dein Feuerball verpufft sofort in deiner Hand\n"
                                        + "Durch ueber Muedung erleidest du 10 Schanden.\n"
                                        + "Der " + gegner.name + " lacht dich aus.");
                                Tenic.held.lebenspunkte -= 10;
                            }
                            break;
                        case "e":
                            Tenic.abstand();
                            if (Tenic.held.magiepunkte >= 0) {
                                gegner.lebenspunkte = gegner.lebenspunkte - 25;
                                Tenic.held.magiepunkte = Tenic.held.magiepunkte - 50;
                                System.out.println("Dein Eisspeer fügt dem " + gegner.name + " 25 Schaden zu. \n"
                                        + gegner.name + " Lebenspunkte:" + gegner.lebenspunkte);
                            } else {
                                System.out.println("Dein Eisspeer schmilzt sofort in deiner Hand\n"
                                        + "Durch ueber Muedung erleidest du 20 Schanden.\n"
                                        + "Der " + gegner.name + " lacht dich aus.");
                                Tenic.held.lebenspunkte -= 20;
                            }
                            break;
                    }
                    break;
            }
            if (gegner.lebenspunkte > 0) {
                Tenic.held.physicalDmg(gegner);
                System.out.println("Der " + gegner.name + " greift dich an\n"
                        + "Der " + gegner.name + "macht " + gegner.schaden + "\n"
                        + "Du hast noch " + Tenic.held.lebenspunkte + " Lebenspunkte");
            } else {
                switch (eingabe) {
                    case "a":
                        System.out.println("Der " + gegner.name + " röchelt und fällt zu Boden");
                        Gegner = "e";
                        break;
                    case "f":
                        System.out.println("Der " + gegner.name + " schreit und zerfällt zu Asche");
                        Gegner = "e";
                        break;
                    case "e":
                        System.out.println("Der " + gegner.name + " friert ein und zerspringt in Tausend Stücke");
                        Gegner = "e";
                        break;
                }
                
            }
        } while (gegner.lebenspunkte > 1 && Tenic.held.lebenspunkte > 1);
        if ("e".equals(Gegner)) {
        } else {
            System.out.println("Du bist gestorben");
            System.exit(0);
        }
        Tenic.held.XP += gegner.XP;
        if (Tenic.held.XP >= Tenic.held.wechsel) {
            Tenic.held.wechsel += Tenic.held.wechsel / 2;
            System.out.println("Du spuerst wie deine Kräfte wachsen doch in welche Richtung sollen sie wachsen?\n"
                    + "1 Mut\n"
                    + "2 Verstand\n"
                    + "3 Inteligenz");
            eingabe = buffer.readLine();
            switch (eingabe) {
                case "1":
                    System.out.println("Held Staerke:" + Tenic.held.starke + " +1");
                    Tenic.held.starke += 1;
                    Tenic.held.Level += 1;
                    break;
                case "2":
                    System.out.println("Held Gerissenheit:" + Tenic.held.gerissenheit + " +1");
                    Tenic.held.gerissenheit += 1;
                    Tenic.held.Level += 1;
                    break;
                case "3":
                    System.out.println("Held Zauberkraft:" + Tenic.held.zauberkraft + " +1");
                    Tenic.held.zauberkraft += 1;
                    Tenic.held.Level += 1;
                    break;
            }
            
        }
    }
}
