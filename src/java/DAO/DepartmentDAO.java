
package DAO;

import Model.Department;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DepartmentDAO {
    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    public List<Department> getAllDepartment() {
        DBContext db = new DBContext();
        List<Department> departmentList = new ArrayList();
        try {
            conn = db.getConnection();
            String sql = "SELECT * FROM Department";
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                String ID = rs.getString(1);
                String name = rs.getString(2);
                String description = rs.getString(3);
                String location = rs.getString(4);
                departmentList.add(new Department(ID, name, description, location));
            }
            conn.close();
        } catch (Exception ex) {
            Logger.getLogger(DepartmentDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return departmentList;
    }

    public Department getDepartmentByID(String ID) {
        DBContext db = new DBContext();
        try {
            conn = db.getConnection();
            String sql = "SELECT * FROM Department WHERE ID = ?";
            ps = conn.prepareStatement(sql);
            ps.setString(1, ID);
            rs = ps.executeQuery();
            if (rs.next()) {
                String name = rs.getString(2);
                String description = rs.getString(3);
                String location = rs.getString(4);
                return new Department(ID, name, description, location);
            }
        } catch (Exception ex) {
            Logger.getLogger(DepartmentDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public String getIDForNewDepartment() {
        DBContext db = new DBContext();
        try {
            conn = db.getConnection();
            String sql = "SELECT TOP 1 * FROM Department ORDER BY ID DESC";
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            if (rs.next()) {
                int n = Integer.parseInt(rs.getString(1).substring(1).trim()) + 1;
                return String.format("D%03d", n);
            }
        } catch (Exception ex) {
            Logger.getLogger(DepartmentDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "D001";
    }

    public void addDepartment(String name, String description, String location) {
        String ID = getIDForNewDepartment();
        DBContext db = new DBContext();
        try {
            conn = db.getConnection();
            String sql = "INSERT INTO Department VALUES(?, ?, ?, ?)";
            ps = conn.prepareStatement(sql);
            ps.setString(1, ID);
            ps.setString(2, name);
            ps.setString(3, description);
            ps.setString(4, location);
            ps.executeUpdate();
            conn.close();
        } catch (Exception ex) {
            Logger.getLogger(DepartmentDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void deleteDepartment(String ID) {
        DBContext db = new DBContext();
        try {
            conn = db.getConnection();
            String sql = "DELETE FROM Department WHERE Department.ID = ?";
            ps = conn.prepareStatement(sql);
            ps.setString(1, ID);
            ps.executeUpdate();
            conn.close();
        } catch (Exception ex) {
            Logger.getLogger(DepartmentDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void updateDepartment(String ID, String name, String description, String location) {
        DBContext db = new DBContext();
        try {
            conn = db.getConnection();
            String sql = """
                         UPDATE Department
                         SET [name] = ?, [description] = ?, [location] = ? WHERE ID = ?""";
            ps = conn.prepareStatement(sql);
            ps.setString(1, name);
            ps.setString(2, description);
            ps.setString(3, location);
            ps.setString(4, ID);
            ps.executeUpdate();
            conn.close();
        } catch (Exception ex) {
            Logger.getLogger(DepartmentDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public List<Department> getAllDepartmentSearchByName(String searchName) {
        DBContext db = new DBContext();
        List<Department> departmentList = new ArrayList();
        try {
            conn = db.getConnection();
            String sql = "SELECT * FROM Department WHERE Department.name LIKE '% " + searchName + "%'";
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                String ID = rs.getString(1);
                String name = rs.getString(2);
                String description = rs.getString(3);
                String location = rs.getString(4);
                departmentList.add(new Department(ID, name, description, location));
            }
            conn.close();
        } catch (Exception ex) {
            Logger.getLogger(DepartmentDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return departmentList;
    }
}
