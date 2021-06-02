import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author aryan
 */
public class NewServlet extends HttpServlet {

    public void init(ServletConfig config)throws ServletException
    {  
    }
    
  @Override
  public void doGet(HttpServletRequest request,HttpServletResponse response)
                        throws ServletException,IOException
    {   response.setContentType("text/html");
        PrintWriter out=response.getWriter();
try{
	Class.forName("com.mysql.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/aryan","root","");
   Statement st=(Statement) con.createStatement();
   ResultSet rs;
        rs = st.executeQuery("select * from emp");
   while(rs.next())
   { out.println("<p>"+rs.getInt(1));
     out.println(rs.getString(2));
     out.println(rs.getString(3)+"</p>");
    }
}catch(Exception e)
{out.println("<p>inside exception"+e.toString()+"</p>");}
 }//doGet()
  
   public void destroy()
    {   out.close();
    }
  
}
