/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tenic;

import tenic.Brust;
import tenic.Fuss;
import tenic.Hand;
import tenic.Kopf;

/**
 *
 * @author BFENNER
 */
public class Wesen {

    Brust brust = null;
    Hand hand = null;
    Kopf kopf = null;
    Fuss fuss = null;

    int Level;
    int XP;
    int starke;
    int zauberkraft;
    int gerissenheit;
    int glueck;
    int lebenspunkte;
    int magiepunkte;
    int schaden;
    int ruestung = 0;
    String name;

    public int physicalDmg(Wesen gegner) {
        int pverteidung = getVerteidung();
        int machtSchaden = gegner.schaden;
        if (machtSchaden >= pverteidung) {
            machtSchaden -= pverteidung;
        } else {
            machtSchaden = 0;
        }
        this.lebenspunkte -= machtSchaden;
        return machtSchaden;
    }

    void magicDmg(int schaden) {
        int pverteidung = getVerteidung();
    }

    private int getVerteidung() {
        int verteidung = 0;
        if (brust != null) {
            verteidung += brust.schutz;
        }
        if (hand != null) {
            verteidung += hand.schutz;
        }
        if (kopf != null) {
            verteidung += kopf.schutz;
        }
        if (fuss != null) {
            verteidung += fuss.schutz;
        }
        return verteidung;
    }
}

class Held extends Wesen {

    int wechsel;

    Held() {

        Level = 1;
        XP = 0;
        wechsel = 30;

        starke = 5;
        zauberkraft = 5;
        gerissenheit = 5;
        glueck = (starke + zauberkraft + gerissenheit) / 3;
        lebenspunkte = 30 + (starke * 10) + (zauberkraft * 2) + (gerissenheit * 5);
        magiepunkte = 20 + (starke * 2) + (zauberkraft * 10) + (gerissenheit * 5);
        schaden = 2 * starke;
    }

}

class Goblin extends Wesen {

    Goblin() {
        XP = 30;
        starke = 5;
        zauberkraft = 0;
        gerissenheit = 3;
        glueck = 7;
        lebenspunkte = 30;
        magiepunkte = 0;
        schaden = 2 * starke;
        name = "Goblin";
    }

    Goblin(int level) {
        XP = 30;
        starke = 5;
        zauberkraft = 0;
        gerissenheit = 3;
        glueck = 7;
        lebenspunkte = 40;
        magiepunkte = 0;
        
        name = "Goblin";
        for (int i = 1; i <= level; i++) {
            XP += XP / 4;
            starke += 1;
            gerissenheit += 1;
            glueck += 1;
            lebenspunkte += 10;
            Level = level;
        }
        schaden = 2 * starke;
    }

}

class Troll extends Wesen {

    Troll() {
        XP = 3000;
        starke = 22;
        zauberkraft = 0;
        gerissenheit = 1;
        glueck = 2;
        lebenspunkte = 500;
        magiepunkte = 30;
        schaden = 2 * starke;
        name = "Troll";
    }
}
