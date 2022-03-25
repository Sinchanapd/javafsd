package filters;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebServlet;

/**
 * Servlet implementation class LoginFilter
 */
@WebServlet("/LoginFilter")
public class LoginFilter implements Filter  {
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginFilter() {
        super();
        // TODO Auto-generated constructor stub
    }
    public void destroy() {
        // TODO Auto-generated method stub
}

/**
 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
 */
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        // TODO Auto-generated method stub
        // place your code here
        
        String userId = request.getParameter("userid");

        if( userId != null){
        	response.getWriter().write("passing through LoginFilter...............");
            chain.doFilter(request, response);
        }
        else           
            response.getWriter().write("blocked by LoginFilter as there is no userid");      
}

/**
 * @see Filter#init(FilterConfig)
 */
	public void init(FilterConfig fConfig) throws ServletException {
        // TODO Auto-generated method stub
}

}
