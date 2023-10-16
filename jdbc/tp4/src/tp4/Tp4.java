/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp4;

import ma.projet.beans.Developpeur;
import ma.projet.service.DeveloppeurService;
import ma.projet.service.ManagerService;

/**
 *
 * @author samia
 */
public class Tp4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
    //Teste Employe
DeveloppeurService ds = new DeveloppeurService();
//Création des developpeurs
ds.create(new Developpeur("Rami",12000 ));
ds.create(new Developpeur("Alaoui", 20000));
ManagerService ms = new ManagerService();
    
     }
}
    

