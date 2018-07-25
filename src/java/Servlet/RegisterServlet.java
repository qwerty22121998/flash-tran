/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import DAO.userDAO;
import Entity.User;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author qwert
 */
public class RegisterServlet extends HttpServlet {

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
            String error = "";
            String uid, fullname, pwd, email, dob, gender, phone, address, desc;
            uid = request.getParameter("uid");
            if (uid.isEmpty()) {
                error += "Please enter username";
            }
            pwd = request.getParameter("pwd");
            if (pwd.isEmpty()) {
                error += "<br>" + "Please enter password";
            }
            fullname = request.getParameter("pwd");
            if (fullname.isEmpty()) {
                error += "<br>" + "Please enter your full name";
            }
            email = request.getParameter("email");
            if (email.isEmpty()) {
                error += "<br>" + "Please enter email";
            }
            dob = request.getParameter("dob");
            if (dob.isEmpty()) {
                error += "<br>" + "Please enter day of birth";
            }
            gender = request.getParameter("gender");
            if (gender.isEmpty()) {
                error += "<br>" + "Please choose gender";
            }
            phone = request.getParameter("phone");
            if (phone.isEmpty()) {
                error += "<br>" + "Please enter phone number";
            }
            address = request.getParameter("address");
            if (address.isEmpty()) {
                error += "<br>" + "Please enter your address";
            }
            desc = request.getParameter("desc");
            if (!uid.isEmpty() && new userDAO().getUser(uid) != null) {
                error += "<br>" + "Username is not available";
            }
            if (!error.isEmpty()) {
                response.sendRedirect("register.jsp?error=" + error);
            } else {
                User newUser = new User(uid, fullname, email, pwd, address, desc, phone, gender.equals("male"), new SimpleDateFormat("yyyy-MM-dd").parse(dob));
                new userDAO().newUser(newUser);
                response.sendRedirect("login?uid=" + uid + "&pwd=" + pwd);
                System.out.println("OJ");
            }
        } catch (Exception ex) {
            response.sendRedirect("register.jsp?error=Something happened, try again!");
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
