import java.awt.*;
import java.util.Random;

import javax.print.DocFlavor.URL;
import javax.swing.*;


public class View extends JFrame {


    public static JButton[][] CaseJeu;
    JPanel jeuPanel = new JPanel(new FlowLayout());
    public static JPanel Grille_du_jeu = new JPanel(new GridLayout(4, 10));
    JFrame fenetre;
    public static JButton reset;
    public static JButton niveau;

    View(int niv) {


        fenetre = new JFrame("Miner View bomb");
        CaseJeu = new JButton[4][10];
        reset = new JButton("Pret a commencer le jeu ");
        niveau = new JButton("Niveau: "+ niv);
        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fenetre.setSize(new Dimension(400, 230));
        fenetre.setResizable(false);
        fenetre.setLocationRelativeTo(null);

        jeuPanel.add(Grille_du_jeu, BorderLayout.CENTER);
        jeuPanel.setBackground(Color.black);
        JPanel menu = new JPanel(new FlowLayout());
        menu.add(reset);
        menu.add(niveau);
        menu.setBackground(Color.black);
        fenetre.add(jeuPanel, BorderLayout.NORTH);
        fenetre.add(menu, BorderLayout.CENTER);



        for (int ligne = 0; ligne < 4; ligne++) {
            for (int colonne = 0; colonne < 10; colonne++) {
                String[] arr = { "Melancolie", "horreur", "tristesse", "bombe", "bombe", "bombe"};
               java.net.URL u1 = getClass().getClassLoader().getResource("image.jpg");
               java.net.URL u2 = getClass().getClassLoader().getResource("image1.png");
               java.net.URL u3 = getClass().getClassLoader().getResource("image2.jpg");
               java.net.URL u4 = getClass().getClassLoader().getResource("image3.png");
               java.net.URL[] arr1 = {u1,u2,u3,u4};
                Random random = new Random();
                Random random1 =  new Random();

                int select = random.nextInt(arr.length);
                int select1 = random1.nextInt(arr1.length);
                ImageIcon iconA = new ImageIcon(arr1[select1]);
                View.CaseJeu[ligne][colonne] = new JButton("",iconA);
                View.CaseJeu[ligne][colonne].setRolloverIcon(iconA);
                View.CaseJeu[ligne][colonne].setPreferredSize(new Dimension(40, 40));
                int finalLigne = ligne;
                int finalColonne = colonne;
                View.CaseJeu[ligne][colonne].addActionListener(e -> View.CaseJeu[finalLigne][finalColonne].setText(arr[select]));
                View.CaseJeu[ligne][colonne].getText();
                View.Grille_du_jeu.add(View.CaseJeu[ligne][colonne]);
            }
        }
        fenetre.setVisible(true);
    }


    }




