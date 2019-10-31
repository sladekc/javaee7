package de.akdb.oesio.soap.client.web;

import de.akdb.oesio.soap.service.helloService.Hello;
import de.akdb.oesio.soap.service.helloService.HelloService;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.WebServiceRef;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "HelloServlet", urlPatterns = {"/HelloServlet"})
public class HelloServlet extends HttpServlet {
    @WebServiceRef(wsdlLocation = "http://localhost:8080/soap-service/Hello?WSDL")
    private HelloService service;

    /**
     * Processes requests for both HTTP <code>GET</code>
     * and <code>POST</code> methods.
     *
     * @param request  servlet request
     * @param response servlet response
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html;charset=UTF-8");

        String helloArgument = "Servlet2";

        try (PrintWriter out = response.getWriter()) {
            out.println("<html lang=\"en\">");
            out.println("<head>");
            out.println("<title>Servlet HelloServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet HelloServlet at " +
                    request.getContextPath() + "</h1>");
            out.println("<p>" + sayHello(helloArgument) + "</p>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // doGet and doPost methods, which call processRequest, and
    //   getServletInfo method
    private String sayHello(String arg0) {
        Hello port = service.getHelloPort();
        return port.sayHello(arg0);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        processRequest(req, resp);
    }
}