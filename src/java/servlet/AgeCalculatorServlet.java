
package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AgeCalculatorServlet extends HttpServlet {
   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
        return;        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
         String agegiven = request.getParameter("age");
         
        
        //System.out.println(age);
   
        if (agegiven == null || agegiven.equals("")){
            
            String message = "You must give a correct age.";
            request.setAttribute("message", message);
            
            getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
            return;            
        }
        
             try 
             {
                 int age = Integer.parseInt(agegiven);
                 age++;
                  request.setAttribute("age", "Your age next birthday will be: " + age);
                 
             }
             catch(Exception e)
             {
                  String message = "You must enter a numeric value.";
                  request.setAttribute("message", message);
                  getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
                  return;
             }
                  
                          
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
        
        return;
        
        
    }

}
