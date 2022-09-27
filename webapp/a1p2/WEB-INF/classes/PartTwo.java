import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PartTwo extends HttpServlet {
	
	//Initi life-cycle method
	public void init() {

	}

	// service method
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		//out.println("<!DOCTYPE html>\n<html>\n<body>\nHEY THERE!\n</body>\n</html>");
		
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<body>");
		out.println("<h1 ALIGN=\"CENTER\">Assignment One Part 2</h1>");
		out.println("<h4 ALIGN=\"CENTER\">Write a servlet, to be created and deployed manually without using any IDE to display request headers</h4>");
		out.println("<table BORDER=1 ALIGN=\"CENTER\">");
		out.println("<tr>");
		out.println("<th>Header Name</th>");
		out.println("<th>Header Value</th>");
		out.println("</tr>");
		
		
		Enumeration headerNames = request.getHeaderNames();
		while(headerNames.hasMoreElements()) {
			String headerName = (String)headerNames.nextElement();
			out.println("<tr><td>" + headerName);
			out.println("    <TD>" + request.getHeader(headerName));
		}
		
		out.println("</table>");
		out.println("</body>");
		out.println("</html>");
	}
	
	//destroy life-cycle method
	public void destroy() {

	}
}