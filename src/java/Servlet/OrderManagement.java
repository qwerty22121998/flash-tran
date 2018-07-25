/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import DAO.orderDAO;
import Entity.User;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author qwert
 */
public class OrderManagement extends HttpServlet {

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
        request.setCharacterEncoding("UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            if (request.getParameter("accept") != null) {
                User currentUser = (User) request.getSession().getAttribute("user");
                String uid = currentUser.getUsername();
                int oid = Integer.valueOf(request.getParameter("oid"));
                int ok = new orderDAO().AcceptOrder(oid, uid);
                if (ok == 0) {
                    response.sendRedirect("error.jsp");
                } else {
                    response.sendRedirect("order.jsp?id=" + oid);
                }
            } else if (request.getParameter("delete") != null) {
                int oid = Integer.valueOf(request.getParameter("oid"));
                int ok = new orderDAO().DeleteOrder(oid);
                if (ok == 0) {
                    response.sendRedirect("error.jsp");
                } else {
                    response.sendRedirect("home.jsp");
                }
            } else if (request.getParameter("supsend") != null) {
                int oid = Integer.valueOf(request.getParameter("oid"));
                int ok = new orderDAO().AcceptOrder(oid, "");
                if (ok == 0) {
                    response.sendRedirect("error.jsp");
                } else {
                    response.sendRedirect("order.jsp?id=" + oid);
                }

            }
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
        processRequest(request, response);
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
        processRequest(request, response);
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
