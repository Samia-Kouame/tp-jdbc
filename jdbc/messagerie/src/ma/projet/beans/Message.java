/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.projet.beans;

import java.util.Date;

/**
 *
 * @author samia
 */
public class Message {
    private int id;
    private int idE;
    private int idR;
    private String objet;
    private String sujet;
    private Date date;
    private String EmpEmetteur ;
    private String EmpRecepteur ;

    public String getEmpEmetteur() {
        return EmpEmetteur;
    }

    public int getIdE() {
        return idE;
    }

    public void setIdE(int idE) {
        this.idE = idE;
    }

    public int getIdR() {
        return idR;
    }

    public void setIdR(int idR) {
        this.idR = idR;
    }

    public void setEmpEmetteur(String EmpEmetteur) {
        this.EmpEmetteur = EmpEmetteur;
    }

    public String getEmpRecepteur() {
        return EmpRecepteur;
    }

    public void setEmpRecepteur(String EmpRecepteur) {
        this.EmpRecepteur = EmpRecepteur;
    }

    public Message() {
    }

    public Message(String objet, String sujet, Date date) {
        this.objet = objet;
        this.sujet = sujet;
        this.date = date;
    }

    public Message(int idE, int idR, String objet, String sujet, Date date, String EmpEmetteur, String EmpRecepteur) {
        this.idE = idE;
        this.idR = idR;
        this.objet = objet;
        this.sujet = sujet;
        this.date = date;
        this.EmpEmetteur = EmpEmetteur;
        this.EmpRecepteur = EmpRecepteur;
    }

    

    public Message(int id, String objet, String sujet, Date date) {
        this.id = id;
        this.objet = objet;
        this.sujet = sujet;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getObjet() {
        return objet;
    }

    public void setObjet(String objet) {
        this.objet = objet;
    }

    public String getSujet() {
        return sujet;
    }

    public void setSujet(String sujet) {
        this.sujet = sujet;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Message{" + "objet=" + objet + ", sujet=" + sujet + ", date=" + date + '}';
    }

    
    
}
