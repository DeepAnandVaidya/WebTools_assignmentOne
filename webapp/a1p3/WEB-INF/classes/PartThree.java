import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;

public class PartThree extends HttpServlet {
	
	//Initi life-cycle method
	public void init() {

	}


	public void handlerMethod(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String confirmPassword = request.getParameter("cpassword");
		String gender = request.getParameter("gender");
		String country = request.getParameter("country");
		String[] hobby = request.getParameterValues("hobby");
		String address = request.getParameter("address");
		String file = request.getParameter("image-file");
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<body>");
		out.println("<b>Email:</b> "+email+"<br />");
		out.println("<b>Password:</b> "+password+"<br />");
		out.println("<b>Confirmed Password:</b> "+confirmPassword+"<br />");
		out.println("<b>File:</b> "+file+"<br />");
		out.println("<b>Gender:</b> "+gender+"<br />");
		out.println("<b>Country:</b> "+country+"<br />");
		out.println("<b>Address:</b> "+address+"<br />");
		out.println("<b>Hobby:</b> <br />");
		out.println("<ul>");
		for(String s : hobby){
			out.println("<li>"+s+"</li>");
		}
		out.println("</ul>");
		out.println("</body>");
		out.println("</html>");
	}
	
	// service method
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		handlerMethod(request, response);
	}
	
	//destroy life-cycle method
	public void destroy() {

	}
}