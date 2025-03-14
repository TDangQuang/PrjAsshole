
package DAO;

import Model.Department;
import Model.Major;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MajorDAO {
    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    public List<Major> getAllMajor() {
        DBContext db = new DBContext();
        List<Major> majorList = new ArrayList();
        try {
            conn = db.getConnection();
            String sql = "SELECT * FROM Major";
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                String ID = rs.getString(1);
                String name = rs.getString(2);
                majorList.add(new Major(ID, name));
            }
            conn.close();
        } catch (Exception ex) {
            Logger.getLogger(MajorDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return majorList;
    }

    public Major getMajorByID(String ID) {
        DBContext db = new DBContext();
        try {
            conn = db.getConnection();
            String sql = "SELECT * FROM Major WHERE ID = ?";
            ps = conn.prepareStatement(sql);
            ps.setString(1, ID);
            rs = ps.executeQuery();
            if (rs.next()) {
                String name = rs.getString(2);
                return new Major(ID, name);
            }
        } catch (Exception ex) {
            Logger.getLogger(MajorDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public String getIDForNewMajor() {
        DBContext db = new DBContext();
        try {
            conn = db.getConnection();
            String sql = "SELECT TOP 1 * FROM Major ORDER BY ID DESC";
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            if (rs.next()) {
                int n = Integer.parseInt(rs.getString(1).substring(1).trim()) + 1;
                return String.format("M%03d", n);
            }
        } catch (Exception ex) {
            Logger.getLogger(MajorDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "M001";
    }

    public void addMajor(String name) {
        String ID = getIDForNewMajor();
        DBContext db = new DBContext();
        try {
            conn = db.getConnection();
            String sql = "INSERT INTO Major VALUES(?, ?)";
            ps = conn.prepareStatement(sql);
            ps.setString(1, ID);
            ps.setString(2, name);
            ps.executeUpdate();
            conn.close();
        } catch (Exception ex) {
            Logger.getLogger(MajorDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void deleteMajor(String ID) {
        DBContext db = new DBContext();
        try {
            conn = db.getConnection();
            String sql = "DELETE FROM Major WHERE Major.ID = ?";
            ps = conn.prepareStatement(sql);
            ps.setString(1, ID);
            ps.executeUpdate();
            conn.close();
        } catch (Exception ex) {
            Logger.getLogger(MajorDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void updateMajor(String ID, String name) {
        DBContext db = new DBContext();
        try {
            conn = db.getConnection();
            String sql = """
                         UPDATE Major
                         SET [name] = ? WHERE ID = ?""";
            ps = conn.prepareStatement(sql);
            ps.setString(1, name);
            ps.setString(2, ID);
            ps.executeUpdate();
            conn.close();
        } catch (Exception ex) {
            Logger.getLogger(MajorDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
