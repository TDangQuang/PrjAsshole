package DAO;

import Model.MonitoringAndTreatment;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MonitoringAndTreatmentDAO {

    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    public List<MonitoringAndTreatment> getAllMonitoringAndTreatment() {
        DBContext db = new DBContext();
        List<MonitoringAndTreatment> monitoringAndTreatmentList = new ArrayList();
        try {
            conn = db.getConnection();
            String sql = """
                         SELECT * FROM MonitoringAndTreatment m JOIN Patient ON m.patientID = Patient.ID
                                                                JOIN Employee ON m.employeeID = Employee.ID""";
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                String ID = rs.getString(1);
                String monitorDate = rs.getString(2);
                float weight = rs.getFloat(3);
                int bloodPressure = rs.getInt(4);
                int respiratoryRate = rs.getInt(5);
                String medicalOrder = rs.getString(6);
                String performDate = rs.getString(7);
                String orderPerform = rs.getString(8);
                String patientID = rs.getString(9);
                String patientName = rs.getString(12);
                String employeeID = rs.getString(10);
                String employeeName = rs.getString(21);
                monitoringAndTreatmentList.add(new MonitoringAndTreatment(ID, monitorDate, weight, bloodPressure, respiratoryRate, medicalOrder, performDate,
                        orderPerform, patientID, patientName, employeeID, employeeName));
            }
            conn.close();
        } catch (Exception ex) {
            Logger.getLogger(MonitoringAndTreatmentDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return monitoringAndTreatmentList;
    }

    public MonitoringAndTreatment getMonitoringAndTreatmentByID(String ID) {
        DBContext db = new DBContext();
        try {
            conn = db.getConnection();
            String sql = """
                         SELECT * FROM MonitoringAndTreatment m JOIN Patient ON m.patientID = Patient.ID
                                                                JOIN Employee ON m.employeeID = Employee.ID
                         WHERE m.ID = ?""";
            ps = conn.prepareStatement(sql);
            ps.setString(1, ID);
            rs = ps.executeQuery();
            if (rs.next()) {
                String monitorDate = rs.getString(2);
                float weight = rs.getFloat(3);
                int bloodPressure = rs.getInt(4);
                int respiratoryRate = rs.getInt(5);
                String medicalOrder = rs.getString(6);
                String performDate = rs.getString(7);
                String orderPerform = rs.getString(8);
                String patientID = rs.getString(9);
                String patientName = rs.getString(12);
                String employeeID = rs.getString(10);
                String employeeName = rs.getString(21);
                return new MonitoringAndTreatment(ID, monitorDate, weight, bloodPressure, respiratoryRate, medicalOrder, performDate,
                        orderPerform, patientID, patientName, employeeID, employeeName);
            }
        } catch (Exception ex) {
            Logger.getLogger(MonitoringAndTreatmentDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public void addMonitoringAndTreatment(String monitorDate, double weight, int bloodPressure, int respiratoryRate, String medicalOrder, String performDate,
            String orderPerform, String patientID, String employeeID) {
        String ID = getIDForNewMonitoringAndTreatment();
        DBContext db = new DBContext();
        try {
            conn = db.getConnection();
            String sql = "INSERT INTO MonitoringAndTreatment VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            ps = conn.prepareStatement(sql);
            ps.setString(1, ID);
            ps.setString(2, monitorDate);
            ps.setFloat(3, (float) weight);
            ps.setInt(4, bloodPressure);
            ps.setInt(5, respiratoryRate);
            ps.setString(6, medicalOrder);
            ps.setString(7, performDate);
            ps.setString(8, orderPerform);
            ps.setString(9, patientID);
            ps.setString(10, employeeID);
            ps.executeUpdate();
            conn.close();
        } catch (Exception ex) {
            Logger.getLogger(MonitoringAndTreatmentDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void deleteMonitoringAndTreatment(String ID) {
        DBContext db = new DBContext();
        try {
            conn = db.getConnection();
            String sql = "DELETE FROM MonitoringAndTreatment WHERE MonitoringAndTreatment.ID = ?";
            ps = conn.prepareStatement(sql);
            ps.setString(1, ID);
            ps.executeUpdate();
            conn.close();
        } catch (Exception ex) {
            Logger.getLogger(MonitoringAndTreatmentDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void deleteMonitoringAndTreatmentByPatientID(String patientID) {
        DBContext db = new DBContext();
        try {
            conn = db.getConnection();
            String sql = "DELETE FROM MonitoringAndTreatment WHERE MonitoringAndTreatment.patientID = ?";
            ps = conn.prepareStatement(sql);
            ps.setString(1, patientID);
            ps.executeUpdate();
            conn.close();
        } catch (Exception ex) {
            Logger.getLogger(MonitoringAndTreatmentDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void deleteMonitoringAndTreatmentByEmployeeID(String employeeID) {
        DBContext db = new DBContext();
        try {
            conn = db.getConnection();
            String sql = "DELETE FROM MonitoringAndTreatment WHERE MonitoringAndTreatment.employeeID = ?";
            ps = conn.prepareStatement(sql);
            ps.setString(1, employeeID);
            ps.executeUpdate();
            conn.close();
        } catch (Exception ex) {
            Logger.getLogger(MonitoringAndTreatmentDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void updateMonitoringAndTreatment(String ID, String monitorDate, double weight, int bloodPressure, int respiratoryRate, String medicalOrder,
            String performDate, String orderPerform, String patientID, String employeeID) {
        DBContext db = new DBContext();
        try {
            conn = db.getConnection();
            String sql = """
                         UPDATE MonitoringAndTreatment
                         SET monitorDate = ?, [weight] = ?, bloodPressure = ?, respiratoryRate = ?, medicalOrder = ?, performDate = ?, orderPerform = ?, 
                         patientID = ?, employeeID = ? WHERE ID = ?""";
            ps = conn.prepareStatement(sql);
            ps.setString(1, monitorDate);
            ps.setFloat(2, (float) weight);
            ps.setInt(3, bloodPressure);
            ps.setInt(4, respiratoryRate);
            ps.setString(5, medicalOrder);
            ps.setString(6, performDate);
            ps.setString(7, orderPerform);
            ps.setString(8, patientID);
            ps.setString(9, employeeID);
            ps.setString(10, ID);
            ps.executeUpdate();
            conn.close();
        } catch (Exception ex) {
            Logger.getLogger(MonitoringAndTreatmentDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String getIDForNewMonitoringAndTreatment() {
        DBContext db = new DBContext();
        try {
            conn = db.getConnection();
            String sql = "SELECT TOP 1 * FROM MonitoringAndTreatment ORDER BY ID DESC";
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            if (rs.next()) {
                int n = Integer.parseInt(rs.getString(1).substring(3).trim()) + 1;
                return String.format("MAT%03d", n);
            }
        } catch (Exception ex) {
            Logger.getLogger(MonitoringAndTreatmentDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "MAT001";
    }
    
    public List<MonitoringAndTreatment> getAllMonitoringAndTreatmentBySearchName(String pName, String eName) {
        DBContext db = new DBContext();
        List<MonitoringAndTreatment> monitoringAndTreatmentList = new ArrayList();
        try {
            conn = db.getConnection();
            if (!pName.equals("") && !eName.equals("")) {
                String sql = "SELECT * FROM MonitoringAndTreatment m JOIN Patient ON m.patientID = Patient.ID " +
                                                                    "JOIN Employee ON m.employeeID = Employee.ID " +
                              "WHERE Patient.name LIKE '%" + pName +"%'  AND Employee.name LIKE '%" + eName +"%'";
                ps = conn.prepareStatement(sql);
            } else if (!pName.equals("")) {
                String sql = "SELECT * FROM MonitoringAndTreatment m JOIN Patient ON m.patientID = Patient.ID " +
                                                                    "JOIN Employee ON m.employeeID = Employee.ID " +
                              "WHERE Patient.name LIKE '%" + pName +"%'";
                ps = conn.prepareStatement(sql);
            } else {
                String sql = "SELECT * FROM MonitoringAndTreatment m JOIN Patient ON m.patientID = Patient.ID " +
                                                                    "JOIN Employee ON m.employeeID = Employee.ID " +
                              "WHERE Employee.name LIKE '%" + eName +"%'";
                ps = conn.prepareStatement(sql);
            }
            rs = ps.executeQuery();
            while (rs.next()) {
                String ID = rs.getString(1);
                String monitorDate = rs.getString(2);
                float weight = rs.getFloat(3);
                int bloodPressure = rs.getInt(4);
                int respiratoryRate = rs.getInt(5);
                String medicalOrder = rs.getString(6);
                String performDate = rs.getString(7);
                String orderPerform = rs.getString(8);
                String patientID = rs.getString(9);
                String patientName = rs.getString(12);
                String employeeID = rs.getString(10);
                String employeeName = rs.getString(21);
                monitoringAndTreatmentList.add(new MonitoringAndTreatment(ID, monitorDate, weight, bloodPressure, respiratoryRate, medicalOrder, performDate,
                        orderPerform, patientID, patientName, employeeID, employeeName));
            }
            conn.close();
        } catch (Exception ex) {
            Logger.getLogger(MonitoringAndTreatmentDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return monitoringAndTreatmentList;
    }
}
