
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.util.Enumeration;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class sql extends HttpServlet {


        @Override
        public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
    {
        try
        {
           
        res.setContentType("text/html");
        PrintWriter out=res.getWriter();
        ServletConfig s=this.getServletConfig();
        res.getWriter().print(s.getServletName()+"<br>");
        Connection con=null;
        String a=req.getParameter("t1");
        String b=req.getParameter("t2");
        String c=req.getParameter("t3");
        Enumeration e=s.getInitParameterNames();
        while(e.hasMoreElements())
        {
            String name=(String)e.nextElement();
            res.getWriter().print(name+" "+s.getInitParameter(name)+"<br");
        }
        //Class.forName("com.mysql.cj.jbbc.Driver").newInstance();
        //con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cse?autoRecoonecr=true&useSSL=false","root","root");
        catch(Exception e){
                }
                }
        }
    }

