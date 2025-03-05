
package DAO;

import Model.ObjectForTestScan;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ObjectDAO {
    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    public List<ObjectForTestScan> getAllObject() {
        DBContext db = new DBContext();
        List<ObjectForTestScan> objectList = new ArrayList();
        try {
            conn = db.getConnection();
            String sql = "SELECT * FROM ObjectForTestScan";
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                String ID = rs.getString(1);
                String name = rs.getString(2);
                objectList.add(new ObjectForTestScan(ID, name));
            }
            conn.close();
        } catch (Exception ex) {
            Logger.getLogger(ObjectDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return objectList;
    }
    
    public ObjectForTestScan getObjectByID(String ID) {
        DBContext db = new DBContext();
        try {
            conn = db.getConnection();
            String sql = "SELECT * FROM ObjectForTestScan WHERE ID = ?";
            ps = conn.prepareStatement(sql);
            ps.setString(1, ID);
            rs = ps.executeQuery();
            if (rs.next()) {
                String name = rs.getString(2);
                return new ObjectForTestScan(ID, name);
            }
        } catch (Exception ex) {
            Logger.getLogger(ObjectDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public void addObject(String name) {
        String ID = getIDForNewObject();
        DBContext db = new DBContext();
        try {
            conn = db.getConnection();
            String sql = "INSERT INTO ObjectForTestScan VALUES (?, ?)";
            ps = conn.prepareStatement(sql);
            ps.setString(1, ID);
            ps.setString(2, name);
            ps.executeUpdate();
            conn.close();
        } catch (Exception ex) {
            Logger.getLogger(ObjectDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void deleteObject(String ID) {
        DBContext db = new DBContext();
        try {
            conn = db.getConnection();
            String sql = "DELETE FROM ObjectForTestScan WHERE ID = ?";
            ps = conn.prepareStatement(sql);
            ps.setString(1, ID);
            ps.executeUpdate();
            conn.close();
        } catch (Exception ex) {
            Logger.getLogger(ObjectDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void updateObject(String ID, String name) {
        DBContext db = new DBContext();
        try {
            conn = db.getConnection();
            String sql = "UPDATE ObjectForTestScan SET [name] = ? WHERE ID = ?";
            ps = conn.prepareStatement(sql);
            ps.setString(1, name);
            ps.setString(2, ID);
            ps.executeUpdate();
            conn.close();
        } catch (Exception ex) {
            Logger.getLogger(ObjectDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public String getIDForNewObject() {
        DBContext db = new DBContext();
        try {
            conn = db.getConnection();
            String sql = "SELECT TOP 1 * FROM ObjectForTestScan ORDER BY ID DESC";
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            if (rs.next()) {
                int n = Integer.parseInt(rs.getString(1).substring(1).trim()) + 1;
                return String.format("O%03d", n);
            }
        } catch (Exception ex) {
            Logger.getLogger(ObjectDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "O001";
    }
}
