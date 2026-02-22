package net.imane.pres;

import net.imane.dao.DaoImpl;
import net.imane.metier.MetierImpl;
import net.imane.net.imane.ext.DaoImplV2;

public class Pres1 {

    public static void main(String[] args) {
        DaoImplV2 dao = new DaoImplV2();
        MetierImpl metier = new MetierImpl(dao);
       // metier.setDao(dao);
        System.out.println("Resultat : "+metier.calcul());
    }
}
