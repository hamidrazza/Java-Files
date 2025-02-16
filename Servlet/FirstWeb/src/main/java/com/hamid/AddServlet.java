package com.hamid;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


//@WebServlet("/hello-servlet")
public class AddServlet extends HttpServlet {

    // service() provides two methods :- doGet() && doPost()
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        int i = Integer.parseInt(req.getParameter("num1"));
        int j = Integer.parseInt(req.getParameter("num2"));

        int k = i+j;
        /*PrintWriter out = res.getWriter();
        out.println("Addition is : " + k);
        */

        // Now we print using the another servlet class
        // **** Request Dispatcher ****
        RequestDispatcher rd = req.getRequestDispatcher("sq");
        rd.forward(req, res);

    }
}
