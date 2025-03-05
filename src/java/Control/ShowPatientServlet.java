package Control;

import Control.*;
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
import java.util.ArrayList;
import java.util.List;

public class ShowPatientServlet extends HttpServlet {

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
            out.println("<title>Servlet ShowPatientServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ShowPatientServlet at " + request.getContextPath() + "</h1>");
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
        PatientDAO pDAO = new PatientDAO();
        List<Patient> patientList = pDAO.getAllPatient();
        request.setAttribute("patientList", patientList);
        ObjectDAO oDAO = new ObjectDAO();
        List<ObjectForTestScan> objectList = oDAO.getAllObject();
        request.setAttribute("objectList", objectList);
        request.getRequestDispatcher("showpatient.jsp").forward(request, response);
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
        String objectID = request.getParameter("filter");
        String patientName = request.getParameter("search");
        String button = request.getParameter("button");
        request.setAttribute("objectID", objectID);
        request.setAttribute("patientName", patientName);
        PatientDAO pDAO = new PatientDAO();
        List<Patient> patientList = new ArrayList();
        if (button.equals("FILTER")) {
            if (objectID.equals("all")) {
                patientList = pDAO.getAllPatient();
            } else {
                patientList = pDAO.getAllPatientByObjectID(objectID);
            }
            request.setAttribute("patientName", "");
        } else {
            List<Patient> tempList = new ArrayList();
            if (objectID.equals("all")) {
                tempList = pDAO.getAllPatient();
            } else {
                tempList = pDAO.getAllPatientByObjectID(objectID);
            }
            for (Patient p : tempList) {
                if (p.getName().toLowerCase().contains(patientName.toLowerCase())) {
                    patientList.add(p);
                }
            }
        }
        request.setAttribute("patientList", patientList);
        ObjectDAO oDAO = new ObjectDAO();
        List<ObjectForTestScan> objectList = oDAO.getAllObject();
        request.setAttribute("objectList", objectList);
        request.getRequestDispatcher("showpatient.jsp").forward(request, response);
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
