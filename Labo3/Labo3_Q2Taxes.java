import java.text.*; // pour utiliser DecimalFormat pour l'affichage de nombres reels
public class Labo3_Q2Taxes {

    final static double TPS = 0.06;
    final static double TVQ = 0.075;

    public static DecimalFormat dec2 = new DecimalFormat ( "0.00" );  // pour l'affichage de reels avec deux decimales

    public static void main (String[] params) {

        double montant;
        double tps = 0;
        double tvq = 0;
        char reponse;

        System.out.print("Entrez un montant : ");
        montant = Clavier.lireDouble();

        System.out.print("Est-ce que la TPS s'applique ('O', 'o') ? ");
        reponse = Clavier.lireCharLn();

        if(reponse == 'O' || reponse == 'o'){
            tps = montant * TPS;
            System.out.println("TPS = " + dec2.format(tps));
        }

        System.out.print("Est-ce que la TVQ s'applique ('O', 'o') ? ");
        reponse = Clavier.lireCharLn();

        if(reponse == 'O' || reponse == 'o'){
            tvq = (montant + tps) * TVQ;
            System.out.println("TVQ = " + dec2.format(tvq));
        }

        System.out.print("Montant total (avec taxe(s) si applicable) = " + dec2.format((montant + tps + tvq)));

    } // main

} // Q2Taxes
