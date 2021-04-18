package Valid;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;
import javax.servlet.http.*;
public class Data extends HttpServlet{

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       resp.setContentType("text/html");
       PrintWriter out = resp.getWriter();
       out.println("<h1> welcome to register servlet </h1>");
       String name =req.getParameter("user_name");
       String password = req.getParameter("user_password");
       String email = req.getParameter("user_email");
       String gender = req.getParameter("user_gender");
       String course = req.getParameter("user_course");
       String cond =req.getParameter("condition");
    //   out.println(cond);
      if(cond!=null)
       {
           out.println("<h2> name:"+name+"</h2>");
           out.println("<h2> password:"+password+"</h2>");
           out.println("<h2> email:"+email+"</h2>");
           out.println("<h2> gender:"+gender+"</h2>");
           out.println("<h2> course:"+course+"</h2>");
       }
       else
       { 
           out.println("<h2> You have not accepted terms and condition </h1>");
       // Include output of index.html
    // get the object of request dispatcher ------------------------------------------------------
       RequestDispatcher rd = request.getre       
}
    }
    
    
    
}

