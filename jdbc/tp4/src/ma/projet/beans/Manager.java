/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.projet.beans;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author samia
 */
public class Manager extends Personne {
    List<Developpeur> employes = new ArrayList<>();

    public Manager(String nom, double salaire) {
        super( nom, salaire);
    }

    public Manager(int aInt, String string, String string0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
