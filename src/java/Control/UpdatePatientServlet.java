
package Control;

import DAO.ObjectDAO;
import DAO.PatientDAO;
import Model.ObjectForTestScan;
import Model.Patient;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.List;

public class UpdatePatientServlet extends HttpServlet {
   
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
            out.println("<title>Servlet UpdatePatientServlet</title>");  
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet UpdatePatientServlet at " + request.getContextPath () + "</h1>");
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
        String ID = request.getParameter("id");
        PatientDAO pDAO = new PatientDAO();
        Patient patient = pDAO.getPatientByID(ID);
        request.setAttribute("patient", patient);
        ObjectDAO oDAO = new ObjectDAO();
        List<ObjectForTestScan> objectList = oDAO.getAllObject();
        request.setAttribute("objectList", objectList);
        request.getRequestDispatcher("updatepatient.jsp").forward(request, response);
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
        String ID = request.getParameter("txtID");
        String name = request.getParameter("txtName");
        String gender = request.getParameter("radioGender");
        String DOB = request.getParameter("dateDOB");
        int age = Integer.parseInt(request.getParameter("numAge"));
        String job = request.getParameter("txtJob");
        String address = request.getParameter("txtAddress");
        String nation = request.getParameter("txtNation");
        String workplace = request.getParameter("txtWorkplace");
        String objectID = request.getParameter("selObjectID");
        if (objectID.equals("none")) objectID = null;
        PatientDAO pDAO = new PatientDAO();
        pDAO.updatePatient(ID, name, gender, DOB, age, job, address, nation, workplace, objectID);
        response.sendRedirect("showpatientservlet");
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
