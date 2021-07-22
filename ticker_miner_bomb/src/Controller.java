import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

public class Controller implements ActionListener{
    Model model;
    View view;

     Controller(Model model , View view){
         this.model = model;
         this.view = view;

         for (int ligne = 0; ligne < 4; ligne++) {
             for (int colonne = 0; colonne < 10; colonne++) {
                 View.CaseJeu[ligne][colonne].addActionListener( this);
//                 View.CaseJeu[ligne][colonne].addActionListener(e -> View.CaseJeu[Ligne][Colonne].setText(arr[select]));
             }
         }
     }

    @Override
    public void actionPerformed(ActionEvent e) {


        if(((JButton) e.getSource()).getText().equals("")){
            if(Model.getScore() > 10000){
                Model.setNiv(Model.getNiv()+1);
                View.reset.setText("Bravo vous avez passez au niveau "+ Model.getNiv());
                new View(Model.getNiv());
//                Model.setScore(Model.getScore()-10000);
            }


            Model.setC(Model.getC());
            for (int ligne = 0; ligne < 4; ligne++) {
                for (int colonne = 0; colonne < 10; colonne++) {

                    ArrayList<String> resultat = new ArrayList<String>();
                    resultat.add(View.CaseJeu[ligne][colonne].getText());
                    if (resultat.get(Model.getCompteur()) == "bombe" ) {
                        Model.setScore(Model.getScore() - 1000);
                        View.reset.setText("BOMBE!!!!: " + Model.getScore());
                        Model.setI(Model.getI()+1);
                    }
                    else if(resultat.get(Model.getCompteur()) == "Melancolie"){
                        Model.setScore(Model.getScore()+10);
                        View.reset.setText("Vous avez gagnez des points, Score: " + Model.getScore());
                        Model.setI(Model.getI()+1);
                    }
                    else if(resultat.get(Model.getCompteur()) == "mort"){
                        Model.setScore(Model.getScore()+1000);
                        View.reset.setText("Vous avez gagnez des points, Score: " + Model.getScore());
                        Model.setI(Model.getI()+1);
                    }
                    else if(resultat.get(Model.getCompteur()) == "tristesse"){
                        Model.setScore(Model.getScore()+2000);
                        View.reset.setText("Vous avez gagnez des points, Score: " + Model.getScore());
                        Model.setI(Model.getI()+1);
                    }
                    else if(resultat.get(Model.getCompteur()) == "horreur"){
                        Model.setScore(Model.getScore()+5000);
                        View.reset.setText("Vous avez gagnez des points, Score: " + Model.getScore());
                        Model.setI(Model.getI()+1);
                    }


                }
            }




        }

    }
}
