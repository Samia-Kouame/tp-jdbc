/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.projet.service;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import ma.projet.beans.Employe;
import ma.projet.beans.Message;
import ma.projet.connexion.Connexion;
import ma.projet.dao.IDao;

/**
 *
 * @author samia
 */
public class MessageService implements IDao<Message> {

    private EmployeService es;

    public MessageService() {
        es = new EmployeService();
    }

    @Override
    public boolean create(Message o) {
        try {
            String req = "insert into message (objet, sujet, date, idE, idR)" + "values(?,?,?,?,?)";
            PreparedStatement ps = Connexion.getConnection().prepareStatement(req);
            ps.setString(1, o.getObjet());
            ps.setString(2, o.getSujet());
            ps.setDate(3, (java.sql.Date) new Date(o.getDate().getTime()));
            ps.setInt(4, o.getIdE());
            ps.setInt(5, o.getIdR());
            if (ps.executeUpdate() == 1) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(MessageService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public boolean update(Message o) {
        try {
            String req = "update employe set nom = ? , prenom = ? where id =?";

            PreparedStatement ps = Connexion.getConnection().prepareStatement(req);
            ps.setString(1, o.getObjet());
            ps.setString(2, o.getSujet());
            ps.setDate(3, (java.sql.Date) o.getDate());
            ps.setInt(5, o.getIdR());
            ps.setInt(2, o.getIdE());
            ps.setInt(6, o.getId());
            if (ps.executeUpdate() == 1) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(EmployeService.class.getName()).log(Level.SEVERE,
                    null, ex);
        }
        return false;
    }

    @Override
    public boolean delete(Message o) {
        try {
            String req = "delete from employe where id = ?";
            PreparedStatement ps = Connexion.getConnection().prepareStatement(req);
            ps.setInt(1, o.getId());
            if (ps.executeUpdate() == 1) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(MessageService.class.getName()).log(Level.SEVERE, null, ex);
        }

        return false;
    }

    @Override
    public Message getById(int id) {
        Message employe = null;
        try {
            String req = "select * from message where id = ?";
            PreparedStatement ps = Connexion.getConnection().prepareStatement(req);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            Message message;
            if (rs.next()) {
                message = new Message(rs.getInt("id"), rs.getString("objet"), rs.getString("sujet"), rs.getDate("date"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(EmployeService.class.getName()).log(Level.SEVERE,
                    null, ex);
        }
        return employe;
    }

    @Override
    public List<Message> getAll() {
        List<Message> employes = new ArrayList<>();
        try {
            String req = "select * from message ";
            PreparedStatement ps = Connexion.getConnection().prepareStatement(req);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {

            }
        } catch (SQLException ex) {
            Logger.getLogger(MessageService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return employes;
    }

}
