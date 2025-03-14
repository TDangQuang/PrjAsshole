package Control;

import DAO.DepartmentDAO;
import DAO.EmployeeDAO;
import DAO.MajorDAO;
import Model.Department;
import Model.Employee;
import Model.Major;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

public class ShowEmployeeServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ShowEmployeeServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ShowEmployeeServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        EmployeeDAO eDAO = new EmployeeDAO();
        List<Employee> employeeList = eDAO.getAllEmployee();
        request.setAttribute("employeeList", employeeList);
        DepartmentDAO dDAO = new DepartmentDAO();
        List<Department> departmentList = dDAO.getAllDepartment();
        request.setAttribute("departmentList", departmentList);
        MajorDAO mDAO = new MajorDAO();
        List<Major> majorList = mDAO.getAllMajor();
        request.setAttribute("majorList", majorList);
        request.getRequestDispatcher("showemployee.jsp").forward(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String departmentID = request.getParameter("filterDepartment");
        String majorID = request.getParameter("filterMajor");
        String employeeName = request.getParameter("search");
        String button = request.getParameter("button");
        request.setAttribute("departmentID", departmentID);
        request.setAttribute("majorID", majorID);
        request.setAttribute("employeeName", employeeName);
        EmployeeDAO eDAO = new EmployeeDAO();
        List<Employee> employeeList = new ArrayList();
        if (button.equals("FILTER")) {
            if (departmentID.equals("all") && majorID.equals("all")) {
                employeeList = eDAO.getAllEmployee();
            } else if (departmentID.equals("all")) {
                employeeList = eDAO.getAllEmployeeByForeignID("", majorID);
            } else if (majorID.equals("all")) {
                employeeList = eDAO.getAllEmployeeByForeignID(departmentID, "");
            } else {
                employeeList = eDAO.getAllEmployeeByForeignID(departmentID, majorID);
            }
            request.setAttribute("employeeName", "");
        } else {
            if (departmentID.equals("all") && majorID.equals("all")) {
                employeeList = eDAO.getAllEmployeeSearchByNameAndForeignID(employeeName, "", "");
            } else if (departmentID.equals("all")) {
                employeeList = eDAO.getAllEmployeeSearchByNameAndForeignID(employeeName, "", majorID);
            } else if (majorID.equals("all")) {
                employeeList = eDAO.getAllEmployeeSearchByNameAndForeignID(employeeName, departmentID, "");
            } else {
                employeeList = eDAO.getAllEmployeeSearchByNameAndForeignID(employeeName, departmentID, majorID);
            }
        }
        request.setAttribute("employeeList", employeeList);
        DepartmentDAO dDAO = new DepartmentDAO();
        List<Department> departmentList = dDAO.getAllDepartment();
        request.setAttribute("departmentList", departmentList);
        MajorDAO mDAO = new MajorDAO();
        List<Major> majorList = mDAO.getAllMajor();
        request.setAttribute("majorList", majorList);
        request.getRequestDispatcher("showemployee.jsp").forward(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
