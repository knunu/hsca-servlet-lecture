package hsca.servlet;

import javax.servlet.*;
import java.io.IOException;
import java.io.PrintWriter;

public class ServletInterfaceImplDemo implements Servlet {
	private ServletConfig config = null;

	@Override
	public void init(ServletConfig config) throws ServletException {
		this.config = config;
	}

	@Override
	public ServletConfig getServletConfig() {
		return config;
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");

		PrintWriter out = res.getWriter();
		out.print("<html><body>");
		out.print("<b>Hi, Servlet implementing servlet interface!</b>");
		out.print("</body></html>");
	}

	@Override
	public String getServletInfo() {
		return config.getServletName();
	}

	@Override
	public void destroy() {
		System.out.println("Servlet is destroyed.");
	}
}
