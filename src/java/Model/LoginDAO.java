
package DAO;

import Model.Login;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LoginDAO {
    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    public List<Login> getAllLogin() {
        DBContext db = new DBContext();
        List<Login> loginList = new ArrayList();
        try {
            conn = db.getConnection();
            String sql = "SELECT * FROM Login";
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                String employeeID = rs.getString(1);
                String username = rs.getString(2);
                String password = rs.getString(3);
                String loginRole = rs.getString(4);
                loginList.add(new Login(employeeID, username, password, loginRole));
            }
            conn.close();
        } catch (Exception ex) {
            Logger.getLogger(LoginDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return loginList;
    }
    
    public Login getLoginByUsernameAndPassword(String username, String password) {
        DBContext db = new DBContext();
        try {
            conn = db.getConnection();
            String sql = "SELECT * FROM Login WHERE username = ? AND [password] = ?";
            ps = conn.prepareStatement(sql);
            ps.setString(1, username);
            ps.setString(2, password);
            rs = ps.executeQuery();
            while (rs.next()) {
                String employeeID = rs.getString(1);
                String loginRole = rs.getString(4);
                return new Login(employeeID, username, password, loginRole);
            }
        } catch (Exception ex) {
            Logger.getLogger(LoginDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
