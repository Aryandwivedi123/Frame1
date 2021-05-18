package edu2;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;
public class MyFilter implements Filter{
public void init(FilterConfig arg0) throws ServletException {}
public void doFilter(ServletRequest req, ServletResponse resp,
FilterChain chain) throws IOException, ServletException {
PrintWriter out=resp.getWriter();
out.print("filter servlet execution before");
chain.doFilter(req, resp);
out.print("filter is servlet execution after");
}
public void destroy() {}
} 