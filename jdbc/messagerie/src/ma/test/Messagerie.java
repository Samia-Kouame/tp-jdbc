/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.test;

import java.util.Date;
import ma.projet.beans.Employe;
import ma.projet.service.EmployeService;

/**
 *
 * @author samia
 */
public class Messagerie {
     public static void main(String[] args) {
    //Teste Employe
EmployeService es = new EmployeService();
//Création des employes
es.create(new Employe("LACHGAR", "Mohamed"));
es.create(new Employe("RAMI", "ALI"));
es.create(new Employe("SAFI", "Fatima"));
     }}