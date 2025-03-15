
package Model;

public class Login {
    private String employeeID, username, password, loginRole;

    public Login() {
    }

    public Login(String employeeID, String username, String password, String loginRole) {
        this.employeeID = employeeID;
        this.username = username;
        this.password = password;
        this.loginRole = loginRole;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getLoginRole() {
        return loginRole;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setLoginRole(String loginRole) {
        this.loginRole = loginRole;
    }

    @Override
    public String toString() {
        return "Login{" + "employeeID=" + employeeID + ", username=" + username + ", password=" + password + ", loginRole=" + loginRole + '}';
    }
    
}
