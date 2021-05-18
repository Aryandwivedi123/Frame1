package edu;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class FirstServlet extends HttpServlet {
public void doGet(HttpServletRequest request, HttpServletResponse response){
try{
response.setContentType("text/html");
PrintWriter out = response.getWriter();
String n=request.getParameter("userName");
out.print("hello world "+n);
HttpSession session=request.getSession();
session.setAttribute("username",n);
out.print("<a href='servelet'>visit</a>");
out.close();
}catch(Exception e){System.out.println(e);}
}