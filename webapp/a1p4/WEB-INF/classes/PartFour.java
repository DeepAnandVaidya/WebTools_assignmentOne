import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.Map;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;

//@WebServlet("/PartThree")
public class PartFour extends HttpServlet {
	
	//Initi life-cycle method
	public void init() {

	}
	
	public void handler(HttpServletRequest request, HttpServletResponse response) throws IOException{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String academicTerm = request.getParameter("academic-term");
		String academicYear = request.getParameter("academic-year");
		String employeeStatus = request.getParameter("emp-status");
		
		String studentName = request.getParameter("student-name");
		String employeeRel = request.getParameter("employee-rel");
		String nuid = request.getParameter("nuid");
		String employeeName = request.getParameter("employee-name");
		String empNuid = request.getParameter("employee-nuid");
		String department = request.getParameter("department");
		String location = request.getParameter("location");
		String phoneNum = request.getParameter("phone-no");
		String supervisorName = request.getParameter("supervisor-name");
		
		String program = request.getParameter("program");
		String courseNumOne = request.getParameter("course-num-one");
		String courseNameOne = request.getParameter("course-name-one");
		String supervisorSignOne = request.getParameter("supervisor-sign-one");
		String creditHoursOne = request.getParameter("credit-hours-one");
		String daysOne = request.getParameter("days-one");
		String timeOne = request.getParameter("time-one");
		String courseNumTwo = request.getParameter("course-num-two");
		String courseNameTwo = request.getParameter("course-name-two");
		String supervisorSignTwo = request.getParameter("supervisor-sign-two");
		String creditHoursTwo = request.getParameter("credit-hours-two");
		String daysTwo = request.getParameter("days-two");
		String timeTwo = request.getParameter("time-two");
		String courseNumThree = request.getParameter("course-num-three");
		String courseNameThree = request.getParameter("course-name-three");
		String supervisorSignThree = request.getParameter("supervisor-sign-three");
		String creditHoursThree = request.getParameter("credit-hours-three");
		String daysThree = request.getParameter("days-three");
		String timeThree = request.getParameter("time-three");
		
		String empSign = request.getParameter("emp-sign");
		String date = request.getParameter("date");
		
		String hrmApproval = request.getParameter("hrm-approval");
		String secFiveDate = request.getParameter("sec-five-date");
	
		
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<body>");
		out.println("<h1 ALIGN=\"CENTER\">Assignment One Part 4</h1>");
		out.println("<h4 ALIGN=\"CENTER\">Create an HTML form to capture the information as shown in the fee waiver PDF page</h4>");
		out.println("<h4>Form submission details</h4>");
		
		// All sections
		out.println("<ul>");
		
		// Section One Start
		out.println("<li><h4>Section One</h4></li>");
		out.println("<ul>");
		out.println("<li><b>Academic Term: </b>"+academicTerm+"</li>");
		out.println("<li><b>Academic Year: </b>"+academicYear+"</li>");
		out.println("<li><b>Employee Status: </b>"+employeeStatus+"</li>");
		out.println("</ul>");
		// Section One End
		
		// Section Two Start
		out.println("<li><h4>Section Two</h4></li>");
		out.println("<ul>");
		out.println("<li><b>Student's Name: </b>"+studentName+"</li>");
		out.println("<li><b>Relationship to Employee: </b>"+employeeRel+"</li>");
		out.println("<li><b>Student's NUID: </b>"+nuid+"</li>");
		out.println("<li><b>Employee's Name: </b>"+employeeName+"</li>");
		out.println("<li><b>Employee's NUID: </b>"+empNuid+"</li>");
		out.println("<li><b>Department: </b>"+department+"</li>");
		out.println("<li><b>Campus Location: </b>"+location+"</li>");
		out.println("<li><b>Phone Number: </b>"+phoneNum+"</li>");
		out.println("<li><b>Supervisor's Name: </b>"+supervisorName+"</li>");
		out.println("</ul>");
		// Section Two End
		
		// Section Three Start
		out.println("<li><h4>Section Three</h4></li>");
		out.println("<ul>");
		out.println("<li><b>Applicable Program: </b>"+program+"</li>");
		out.println("<li>");
		out.println("<table BORDER=1>");
		out.println("<tr>");
		out.println("<th>Course No.</th>");
		out.println("<th>Course Name</th>");
		out.println("<th>Supervisor Signature</th>");
		out.println("<th>Credit Hrs.</th>");
		out.println("<th>Day(s)</th>");
		out.println("<th>Time</th>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<td>"+courseNumOne+"</td>");
		out.println("<td>"+courseNameOne+"</td>");
		out.println("<td>"+supervisorSignOne+"</td>");
		out.println("<td>"+creditHoursOne+"</td>");
		out.println("<td>"+daysOne+"</td>");
		out.println("<td>"+timeOne+"</td>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<td>"+courseNumTwo+"</td>");
		out.println("<td>"+courseNameTwo+"</td>");
		out.println("<td>"+supervisorSignTwo+"</td>");
		out.println("<td>"+creditHoursTwo+"</td>");
		out.println("<td>"+daysTwo+"</td>");
		out.println("<td>"+timeTwo+"</td>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<td>"+courseNumThree+"</td>");
		out.println("<td>"+courseNameThree+"</td>");
		out.println("<td>"+supervisorSignThree+"</td>");
		out.println("<td>"+creditHoursThree+"</td>");
		out.println("<td>"+daysThree+"</td>");
		out.println("<td>"+timeThree+"</td>");
		out.println("</tr>");
		out.println("</table>");
		out.println("</li>");
		out.println("</ul>");
		// Section Three End
		
		// Section Four Start
		out.println("<li><h4>Section Four</h4></li>");
		out.println("<ul>");
		out.println("<li><b>Employee's Signature: </b>"+empSign+"</li>");
		out.println("<li><b>Date: </b>"+date+"</li>");
		out.println("</ul>");
		// Section Four End
		
		// Section Five Start
		out.println("<li><h4>Section Five</h4></li>");
		out.println("<ul>");
		out.println("<li><b>HRM Approval: </b>"+hrmApproval+"</li>");
		out.println("<li><b>Date: </b>"+secFiveDate+"</li>");
		out.println("</ul>");
		// Section Five End

		
		out.println("</ul>");
		out.println("</body>");
		out.println("</html>");
	}

	// service method
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		handler(request,response);
	}
	
	// service method
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		handler(request,response);
	}
	
	//destroy life-cycle method
	public void destroy() {

	}
}