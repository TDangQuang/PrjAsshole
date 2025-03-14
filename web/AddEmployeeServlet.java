
package Control;

import DAO.DepartmentDAO;
import DAO.EmployeeDAO;
import DAO.MajorDAO;
import Model.Department;
import Model.Major;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.List;

public class AddEmployeeServlet extends HttpServlet {
   
    /** 
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
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
            out.println("<title>Servlet AddEmployeeServlet</title>");  
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet AddEmployeeServlet at " + request.getContextPath () + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    } 

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /** 
     * Handles the HTTP <code>GET</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        DepartmentDAO dDAO = new DepartmentDAO();
        List<Department> departmentList = dDAO.getAllDepartment();
        request.setAttribute("departmentList", departmentList);
        MajorDAO mDAO = new MajorDAO();
        List<Major> majorList = mDAO.getAllMajor();
        request.setAttribute("majorList", majorList);
        request.getRequestDispatcher("addemployee.jsp").forward(request, response);
    } 

    /** 
     * Handles the HTTP <code>POST</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        String name = request.getParameter("txtName");
        String role = request.getParameter("txtRole");
        String departmentID = request.getParameter("selDepartmentID");
        if (departmentID.equals("none")) departmentID = null;
        String majorID = request.getParameter("selMajorID");
        if (majorID.equals("none")) majorID = null;
        EmployeeDAO eDAO = new EmployeeDAO();
        eDAO.addEmployee(name, role, departmentID, majorID);
        response.sendRedirect("showemployeeservlet");
    }

    /** 
     * Returns a short description of the servlet.
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
