package DAO;

import Model.Patient;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.*;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PatientDAO {

    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    public List<Patient> getAllPatient() {
        DBContext db = new DBContext();
        List<Patient> patientList = new ArrayList();
        try {
            conn = db.getConnection();
            String sql = "SELECT * FROM Patient p LEFT JOIN ObjectForTestScan o ON p.objectID = o.ID";
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                String ID = rs.getString(1);
                String name = rs.getString(2);
                String gender = rs.getString(3);
                String DOB = rs.getString(4);
                int age = rs.getInt(5);
                String job = rs.getString(6);
                String address = rs.getString(7);
                String nation = rs.getString(8);
                String workplace = rs.getString(9);
                String objectID = rs.getString(10);
                String objectName = rs.getString(12);
                patientList.add(new Patient(ID, name, gender, DOB, age, job, address, nation, workplace, objectID, objectName));
            }
            conn.close();
        } catch (Exception ex) {
            Logger.getLogger(PatientDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return patientList;
    }

    public Patient getPatientByID(String ID) {
        DBContext db = new DBContext();
        try {
            conn = db.getConnection();
            String sql = "SELECT * FROM Patient p LEFT JOIN ObjectForTestScan o ON p.objectID = o.ID WHERE p.ID = ?";
            ps = conn.prepareStatement(sql);
            ps.setString(1, ID);
            rs = ps.executeQuery();
            if (rs.next()) {
                String name = rs.getString(2);
                String gender = rs.getString(3);
                String DOB = rs.getString(4);
                int age = rs.getInt(5);
                String job = rs.getString(6);
                String address = rs.getString(7);
                String nation = rs.getString(8);
                String workplace = rs.getString(9);
                String objectID = rs.getString(10);
                String objectName = rs.getString(12);
                return new Patient(ID, name, gender, DOB, age, job, address, nation, workplace, objectID, objectName);
            }
        } catch (Exception ex) {
            Logger.getLogger(PatientDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public void addPatient(String name, String gender, String DOB, int age,
            String job, String address, String nation, String workplace, String objectID) {
        String ID = getIDForNewPatient();
        DBContext db = new DBContext();
        try {
            conn = db.getConnection();
            String sql = "INSERT INTO Patient VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            ps = conn.prepareStatement(sql);
            ps.setString(1, ID);
            ps.setString(2, name);
            ps.setString(3, gender);
            ps.setString(4, DOB);
            ps.setInt(5, age);
            ps.setString(6, job);
            ps.setString(7, address);
            ps.setString(8, nation);
            ps.setString(9, workplace);
            ps.setString(10, objectID);
            ps.executeUpdate();
            conn.close();
        } catch (Exception ex) {
            Logger.getLogger(PatientDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void deletePatient(String ID) {
        DBContext db = new DBContext();
        try {
            conn = db.getConnection();
            String sql = "DELETE FROM Patient WHERE Patient.ID = ?";
            ps = conn.prepareStatement(sql);
            ps.setString(1, ID);
            ps.executeUpdate();
            conn.close();
        } catch (Exception ex) {
            Logger.getLogger(PatientDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void updatePatient(String ID, String name, String gender, String DOB, int age,
            String job, String address, String nation, String workplace, String objectID) {
        DBContext db = new DBContext();
        try {
            conn = db.getConnection();
            String sql = """
                         UPDATE Patient
                         SET [name] = ?, gender = ?, DOB = ?, age = ?, job = ?, [address] = ?, nation = ?, workplace = ?, objectID = ? WHERE ID = ?""";
            ps = conn.prepareStatement(sql);
            ps.setString(1, name);
            ps.setString(2, gender);
            ps.setString(3, DOB);
            ps.setInt(4, age);
            ps.setString(5, job);
            ps.setString(6, address);
            ps.setString(7, nation);
            ps.setString(8, workplace);
            ps.setString(9, objectID);
            ps.setString(10, ID);
            ps.executeUpdate();
            conn.close();
        } catch (Exception ex) {
            Logger.getLogger(PatientDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public String getIDForNewPatient() {
        DBContext db = new DBContext();
        try {
            conn = db.getConnection();
            String sql = "SELECT TOP 1 * FROM Patient ORDER BY ID DESC";
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            if (rs.next()) {
                int n = Integer.parseInt(rs.getString(1).substring(1).trim()) + 1;
                return String.format("P%03d", n);
            }
        } catch (Exception ex) {
            Logger.getLogger(PatientDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "P001";
    }
    
    public List<Patient> getAllPatientByObjectID(String objectID) {
        DBContext db = new DBContext();
        List<Patient> patientList = new ArrayList();
        try {
            conn = db.getConnection();
            String sql = "SELECT * FROM Patient p JOIN ObjectForTestScan o ON p.objectID = o.ID WHERE o.ID = ?";
            ps = conn.prepareStatement(sql);
            ps.setString(1, objectID);
            rs = ps.executeQuery();
            while (rs.next()) {
                String ID = rs.getString(1);
                String name = rs.getString(2);
                String gender = rs.getString(3);
                String DOB = rs.getString(4);
                int age = rs.getInt(5);
                String job = rs.getString(6);
                String address = rs.getString(7);
                String nation = rs.getString(8);
                String workplace = rs.getString(9);
                String objectName = rs.getString(12);
                patientList.add(new Patient(ID, name, gender, DOB, age, job, address, nation, workplace, objectID, objectName));
            }
            conn.close();
        } catch (Exception ex) {
            Logger.getLogger(PatientDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return patientList;
    }

}
