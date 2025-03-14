package Control;

import DAO.EmployeeDAO;
import DAO.MonitoringAndTreatmentDAO;
import DAO.PatientDAO;
import Model.Employee;
import Model.Patient;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class AddMATServlet extends HttpServlet {

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
            out.println("<title>Servlet AddMonitoringAndTreatmentServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet AddMonitoringAndTreatmentServlet at " + request.getContextPath() + "</h1>");
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
        String monitorDate = request.getParameter("dateMonitorDate");
        String weight = request.getParameter("numWeight");
        String bloodPressure = request.getParameter("numBloodPressure");
        String respiratoryRate = request.getParameter("numRespiratoryRate");
        String medicalOrder = request.getParameter("txtMedicalOrder");
        String performDate = request.getParameter("datePerformDate");
        String orderPerform = request.getParameter("txtOrderPerform");
        String patientID = request.getParameter("txtPatientID");
        String employeeID = request.getParameter("txtEmployeeID");
        PatientDAO pDAO = new PatientDAO();
        EmployeeDAO eDAO = new EmployeeDAO();
        MonitoringAndTreatmentDAO mDAO = new MonitoringAndTreatmentDAO();
        Patient patient = pDAO.getPatientByID(patientID);
        Employee employee = eDAO.getEmployeeByID(employeeID);
        if (patient == null) {
            request.setAttribute("monitorDate", monitorDate);
            request.setAttribute("weight", weight);
            request.setAttribute("bloodPressure", bloodPressure);
            request.setAttribute("respiratoryRate", respiratoryRate);
            request.setAttribute("medicalOrder", medicalOrder);
            request.setAttribute("performDate", performDate);
            request.setAttribute("orderPerform", orderPerform);
            request.setAttribute("employeeID", employeeID);
            request.setAttribute("patientID", "ID Bệnh nhân không tồn tại");
            request.getRequestDispatcher("addmat.jsp").forward(request, response);
        }
        if (employee == null) {
            request.setAttribute("monitorDate", monitorDate);
            request.setAttribute("weight", weight);
            request.setAttribute("bloodPressure", bloodPressure);
            request.setAttribute("respiratoryRate", respiratoryRate);
            request.setAttribute("medicalOrder", medicalOrder);
            request.setAttribute("performDate", performDate);
            request.setAttribute("orderPerform", orderPerform);
            request.setAttribute("patientID", patientID);
            request.setAttribute("employeeID", "ID Nhân viên không tồn tại");
            request.getRequestDispatcher("addmat.jsp").forward(request, response);
        }
        mDAO.addMonitoringAndTreatment(monitorDate, Float.parseFloat(weight), Integer.parseInt(bloodPressure),
                Integer.parseInt(respiratoryRate), medicalOrder, performDate, orderPerform, patientID, employeeID);
        response.sendRedirect("showmatservlet");
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
