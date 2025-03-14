
package Control;

import DAO.MonitoringAndTreatmentDAO;
import Model.MonitoringAndTreatment;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

public class ShowMATServlet extends HttpServlet {
   
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
            out.println("<title>Servlet ShowMonitoringAndTreatmentServlet</title>");  
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ShowMonitoringAndTreatmentServlet at " + request.getContextPath () + "</h1>");
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
        MonitoringAndTreatmentDAO mDAO = new MonitoringAndTreatmentDAO();
        List<MonitoringAndTreatment> matList = mDAO.getAllMonitoringAndTreatment();
        request.setAttribute("matList", matList);
        request.getRequestDispatcher("showmat.jsp").forward(request, response);
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
        String matID = request.getParameter("searchMAT");
        String patientName = request.getParameter("searchPatient");
        String employeeName = request.getParameter("searchEmployee");
        request.setAttribute("matID", matID);
        request.setAttribute("patientName", patientName);
        request.setAttribute("employeeName", employeeName);
        MonitoringAndTreatmentDAO mDAO = new MonitoringAndTreatmentDAO();
        List<MonitoringAndTreatment> matList = new ArrayList();
        if (matID.isEmpty()) {
            matList = mDAO.getAllMonitoringAndTreatmentBySearchName(patientName, employeeName);
            request.setAttribute("patientName", patientName);
            request.setAttribute("employeeName", employeeName);
            request.setAttribute("matID", "");
        } else {
            matList.add(mDAO.getMonitoringAndTreatmentByID(matID));
            request.setAttribute("patientName", "");
            request.setAttribute("employeeName", "");
            request.setAttribute("matID", matID);
        }
        request.setAttribute("matList", matList);
        request.getRequestDispatcher("showmat.jsp").forward(request, response);
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
