package DAO;

import Model.Employee;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EmployeeDAO {

    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    public List<Employee> getAllEmployee() {
        DBContext db = new DBContext();
        List<Employee> employeeList = new ArrayList();
        try {
            conn = db.getConnection();
            String sql = """
                         SELECT * FROM Employee JOIN Department ON Employee.departmentID = Department.ID 
                                                 JOIN Major ON Employee.majorID = Major.ID""";
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                String ID = rs.getString(1);
                String name = rs.getString(2);
                String role = rs.getString(3);
                String departmentID = rs.getString(4);
                String majorID = rs.getString(5);
                String departmentName = rs.getString(7);
                String majorName = rs.getString(9);
                employeeList.add(new Employee(ID, name, role, departmentID, majorID, departmentName, majorName));
            }
            conn.close();
        } catch (Exception ex) {
            Logger.getLogger(EmployeeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return employeeList;
    }

    public Employee getEmployeeByID(String ID) {
        DBContext db = new DBContext();
        try {
            conn = db.getConnection();
            String sql = """
                         SELECT * FROM Employee JOIN Department ON Employee.departmentID = Department.ID 
                                                 JOIN Major ON Employee.majorID = Major.ID
                         WHERE Employee.ID = ?""";
            ps = conn.prepareStatement(sql);
            ps.setString(1, ID);
            rs = ps.executeQuery();
            if (rs.next()) {
                String name = rs.getString(2);
                String role = rs.getString(3);
                String departmentID = rs.getString(4);
                String majorID = rs.getString(5);
                String departmentName = rs.getString(7);
                String majorName = rs.getString(9);
                return new Employee(ID, name, role, departmentID, majorID, departmentName, majorName);
            }
        } catch (Exception ex) {
            Logger.getLogger(EmployeeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public void addEmployee(String name, String role, String departmentID, String majorID) {
        String ID = getIDForNewEmployee();
        DBContext db = new DBContext();
        try {
            conn = db.getConnection();
            String sql = "INSERT INTO Employee VALUES(?, ?, ?, ?, ?)";
            ps = conn.prepareStatement(sql);
            ps.setString(1, ID);
            ps.setString(2, name);
            ps.setString(3, role);
            ps.setString(4, departmentID);
            ps.setString(5, majorID);
            ps.executeUpdate();
            conn.close();
        } catch (Exception ex) {
            Logger.getLogger(EmployeeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void deleteEmployee(String ID) {
        DBContext db = new DBContext();
        try {
            conn = db.getConnection();
            String sql = "DELETE FROM Employee WHERE Employee.ID = ?";
            ps = conn.prepareStatement(sql);
            ps.setString(1, ID);
            ps.executeUpdate();
            conn.close();
        } catch (Exception ex) {
            Logger.getLogger(EmployeeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void deleteEmployeeByDepartmentID(String departmentID) {
        DBContext db = new DBContext();
        try {
            conn = db.getConnection();
            String sql = "DELETE FROM Employee WHERE Employee.departmentID = ?";
            ps = conn.prepareStatement(sql);
            ps.setString(1, departmentID);
            ps.executeUpdate();
            conn.close();
        } catch (Exception ex) {
            Logger.getLogger(EmployeeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void updateEmployee(String ID, String name, String role, String departmentID, String majorID) {
        DBContext db = new DBContext();
        try {
            conn = db.getConnection();
            String sql = """
                         UPDATE Employee
                         SET [name] = ?, [role] = ?, departmentID = ?, majorID = ? WHERE ID = ?""";
            ps = conn.prepareStatement(sql);
            ps.setString(1, name);
            ps.setString(2, role);
            ps.setString(3, departmentID);
            ps.setString(4, majorID);
            ps.setString(5, ID);
            ps.executeUpdate();
            conn.close();
        } catch (Exception ex) {
            Logger.getLogger(Employee.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String getIDForNewEmployee() {
        DBContext db = new DBContext();
        try {
            conn = db.getConnection();
            String sql = "SELECT TOP 1 * FROM Employee ORDER BY ID DESC";
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            if (rs.next()) {
                int n = Integer.parseInt(rs.getString(1).substring(1).trim()) + 1;
                return String.format("E%03d", n);
            }
        } catch (Exception ex) {
            Logger.getLogger(EmployeeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "E001";
    }

    public List<Employee> getAllEmployeeByForeignID(String dID, String mID) {
        DBContext db = new DBContext();
        List<Employee> employeeList = new ArrayList();
        try {
            conn = db.getConnection();
            if (!dID.equals("") && !mID.equals("")) {
                String sql = """
                         SELECT * FROM Employee JOIN Department ON Employee.departmentID = Department.ID 
                                                 JOIN Major ON Employee.majorID = Major.ID
                         WHERE Department.ID = ? AND Major.ID = ?""";
                ps = conn.prepareStatement(sql);
                ps.setString(1, dID);
                ps.setString(2, mID);
            } else if (!dID.equals("")) {
                String sql = """
                         SELECT * FROM Employee JOIN Department ON Employee.departmentID = Department.ID 
                                                 JOIN Major ON Employee.majorID = Major.ID
                         WHERE Department.ID = ?""";
                ps = conn.prepareStatement(sql);
                ps.setString(1, dID);
            } else {
                String sql = """
                         SELECT * FROM Employee JOIN Department ON Employee.departmentID = Department.ID 
                                                 JOIN Major ON Employee.majorID = Major.ID
                         WHERE Major.ID = ?""";
                ps = conn.prepareStatement(sql);
                ps.setString(1, mID);
            }
            rs = ps.executeQuery();
            while (rs.next()) {
                String ID = rs.getString(1);
                String name = rs.getString(2);
                String role = rs.getString(3);
                String departmentID = rs.getString(4);
                String majorID = rs.getString(5);
                String departmentName = rs.getString(7);
                String majorName = rs.getString(9);
                employeeList.add(new Employee(ID, name, role, departmentID, majorID, departmentName, majorName));
            }
            conn.close();
        } catch (Exception ex) {
            Logger.getLogger(EmployeeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return employeeList;
    }

    public List<Employee> getAllEmployeeSearchByNameAndForeignID(String searchName, String dID, String mID) {
        DBContext db = new DBContext();
        List<Employee> employeeList = new ArrayList();
        try {
            conn = db.getConnection();
            if (!dID.equals("") && !mID.equals("")) {
                String sql = "SELECT * FROM Employee JOIN Department ON Employee.departmentID = Department.ID " +
                                                 "JOIN Major ON Employee.majorID = Major.ID " +
                         "WHERE Employee.name LIKE '%" + searchName +"%' AND Department.ID = ? AND Major.ID = ?";
                ps = conn.prepareStatement(sql);
                ps.setString(1, dID);
                ps.setString(2, mID);
            } else if (!dID.equals("")) {
                String sql = "SELECT * FROM Employee JOIN Department ON Employee.departmentID = Department.ID " +
                                                 "JOIN Major ON Employee.majorID = Major.ID " +
                         "WHERE Employee.name LIKE '%" + searchName +"%' AND Department.ID = ?";
                ps = conn.prepareStatement(sql);
                ps.setString(1, dID);
            } else if (!mID.equals("")) {
                String sql = "SELECT * FROM Employee JOIN Department ON Employee.departmentID = Department.ID " +
                                                 "JOIN Major ON Employee.majorID = Major.ID " +
                         "WHERE Employee.name LIKE '%" + searchName +"%' AND Major.ID = ?";
                ps = conn.prepareStatement(sql);
                ps.setString(1, mID);
            } else {
                String sql = "SELECT * FROM Employee JOIN Department ON Employee.departmentID = Department.ID " +
                                                 "JOIN Major ON Employee.majorID = Major.ID " +
                         "WHERE Employee.name LIKE '%" + searchName +"%'";
                ps = conn.prepareStatement(sql);
            }
            rs = ps.executeQuery();
            while (rs.next()) {
                String ID = rs.getString(1);
                String name = rs.getString(2);
                String role = rs.getString(3);
                String departmentID = rs.getString(4);
                String majorID = rs.getString(5);
                String departmentName = rs.getString(7);
                String majorName = rs.getString(9);
                employeeList.add(new Employee(ID, name, role, departmentID, majorID, departmentName, majorName));
            }
            conn.close();
        } catch (Exception ex) {
            Logger.getLogger(EmployeeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return employeeList;
    }

}
