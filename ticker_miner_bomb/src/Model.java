import javax.swing.*;

public class Model {
      static int i;
    static int compteur = 0;
     static int score = 0;
     static int c = 0;

     static  int niv = 1;

    public static int getCompteur() {
        return compteur;
    }

    public void setCompteur(int compt) {
        compteur = compt;
    }

    public static int getScore() {
        return score;
    }

    public static void setScore(int s) {
        score = s;
    }

    public static int getC() {
        return c;
    }

    public static void setC(int co) {
       c = co;
    }

    public static int getI() {
        return i;
    }

    public static void setI(int io) {
        i = io;
    }

    public static int getNiv() {
        return niv;
    }

    public static void setNiv(int niveau) {
        niv = niveau;
    }
}
