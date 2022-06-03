package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ArithmeticCalculatorArithmetic extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        getServletContext().getRequestDispatcher("/WEB-INF/ArithmeticCalculator.jsp").forward(request, response);
        return;

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String firstVal = request.getParameter("calca");
        String secondVal = request.getParameter("calcb");
        String arithmetic = request.getParameter("arith");
        request.setAttribute("firstVal", firstVal);
        request.setAttribute("secondVal", secondVal);

        if (firstVal == null || secondVal == null || firstVal.equals("") || secondVal.equals("")) {
            String message = "Invlaid";
            request.setAttribute("message", message);

            getServletContext().getRequestDispatcher("/WEB-INF/ArithmeticCalculator.jsp").forward(request, response);
            return;

        }

        try {
            int value1 = Integer.parseInt(firstVal);
            int value2 = Integer.parseInt(secondVal);
            if (arithmetic.equals("+")) {
                int result = value1 + value2;
                request.setAttribute("message", result);              
            }
            else if(arithmetic.equals("-")){
                int result = value1 - value2;
                request.setAttribute("message", result);                
            }
            else if(arithmetic.equals("*")){
                int result = value1 * value2;
                request.setAttribute("message", result);                
            }
            else if(arithmetic.equals("%")){
                int result = value1 % value2;
                request.setAttribute("message", result);                
            }
            
        } catch (Exception e) {
            String message = "Invalid";
            request.setAttribute("message", message);
            getServletContext().getRequestDispatcher("/WEB-INF/ArithmeticCalculator.jsp").forward(request, response);
            return;
        }

        getServletContext().getRequestDispatcher("/WEB-INF/ArithmeticCalculator.jsp").forward(request, response);
        return;
    }

}
