/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tenic;

/**
 *
 * @author BFENNER
 */
public class Ruestung {
    String nameP;
    int schutz;    
}

class Fuss extends Ruestung {
}
class Kopf extends Ruestung {
}
class Hand extends Ruestung {
}
class Brust extends Ruestung  {
}

class Kriegerpanzer extends Brust {
    public Kriegerpanzer() {
        nameP = "Kriegspanzer";
        schutz = 7;
    }
}
class Diebesmantel extends Brust {
    public Diebesmantel() {
        nameP = "Diebesmantel";
        schutz = 5;
    }
}
class Magiermantel extends Brust {
    public Magiermantel() {
        nameP = "Magiermantel";
        schutz = 1;
    }
}    

class Kriegerhandschuhe extends Hand {
    public Kriegerhandschuhe() {
        nameP = "Kriegerhandschuhe";
        schutz = 3;
    }
}
class Diebeshandschuhe extends Hand {
    public Diebeshandschuhe() {
        nameP = "Diebeshandschuhe";
        schutz = 2;
    }
}
class Magierhandschuhe extends Hand {
    public Magierhandschuhe() {
        nameP = "Magierhandschuhe";
        schutz = 1;
    }
}

class Kriegerstiefel extends Fuss {
    public Kriegerstiefel() {
        nameP = "Kriegerstiefel";
        schutz = 3;
    }
}
class Diebesstiefel extends Fuss {
    public Diebesstiefel() {
        nameP = "Diebesstiefel";
        schutz = 2;
    }
}
class Magierschuhe extends Fuss {
    public Magierschuhe() {
        nameP = "Magierschuhe";
        schutz = 1;
    }
}

class Kriegerhelm extends Kopf {
    public Kriegerhelm() {
        nameP = "Kriegerhelm";
        schutz = 4;
    }
}
class Diebeskapuze extends Kopf {
    public Diebeskapuze() {
        nameP = "Diebeskapuze";
        schutz = 3;
    }
}
class Magierhut extends Kopf {
    public Magierhut() {
        nameP = "Magierhut";
        schutz = 1;
    }
}