
package Control;

import DAO.MonitoringAndTreatmentDAO;
import Model.MonitoringAndTreatment;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class UpdateMATServlet extends HttpServlet {
   
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
            out.println("<title>Servlet UpdateMATServlet</title>");  
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet UpdateMATServlet at " + request.getContextPath () + "</h1>");
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
        MonitoringAndTreatmentDAO mDAO = new MonitoringAndTreatmentDAO();
        MonitoringAndTreatment mat = mDAO.getMonitoringAndTreatmentByID(ID);
        request.setAttribute("mat", mat);
        request.getRequestDispatcher("updatemat.jsp").forward(request, response);
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
        String monitorDate = request.getParameter("dateMonitorDate");
        String weight = request.getParameter("numWeight");
        String bloodPressure = request.getParameter("numBloodPressure");
        String respiratoryRate = request.getParameter("numRespiratoryRate");
        String medicalOrder = request.getParameter("txtMedicalOrder");
        String performDate = request.getParameter("datePerformDate");
        String orderPerform = request.getParameter("txtOrderPerform");
        String patientID = request.getParameter("txtPatientID");
        String employeeID = request.getParameter("txtEmployeeID");
        MonitoringAndTreatmentDAO mDAO = new MonitoringAndTreatmentDAO();
        mDAO.updateMonitoringAndTreatment(ID, monitorDate, Float.parseFloat(weight), Integer.parseInt(bloodPressure), 
                Integer.parseInt(respiratoryRate), medicalOrder, performDate, orderPerform, patientID, employeeID);
        response.sendRedirect("showmatservlet");
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
