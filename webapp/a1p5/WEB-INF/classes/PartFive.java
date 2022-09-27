import java.io.IOException;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.util.Enumeration;
import java.util.Map;
import java.util.Locale;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.DispatcherType;
import javax.servlet.ServletInputStream;



public class PartFive extends HttpServlet {
	
	//Initi life-cycle method
	public void init() {

	}

	// service method
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		long date = getLastModified(request);
		String encoding = request.getCharacterEncoding();
		int contentLength = request.getContentLength();
		long contentLengthLong = request.getContentLengthLong();
		String contentType = request.getContentType();
		String localAddr = request.getLocalAddr();
		String localName = request.getLocalName();
		int localPort = request.getLocalPort();
		String protocol = request.getProtocol();
		String remoteAddr = request.getRemoteAddr();
		String remoteHost = request.getRemoteHost();
		int remotePort = request.getRemotePort();
		String scheme = request.getScheme();
		String serverName = request.getServerName();
		int serverPort = request.getServerPort();
		Map<String,String[]> parameterMap = request.getParameterMap();
		Enumeration attrNames = request.getAttributeNames();
		DispatcherType dt = request.getDispatcherType();
		ServletInputStream inputStream = request.getInputStream();
		Locale locale = request.getLocale();
		Enumeration locales = request.getLocales();
		Enumeration paramNames = request.getParameterNames();
		// BufferedReader reader = request.getReader();


		
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<body>");
		out.println("<h1 ALIGN=\"CENTER\">Assignment One Part 5</h1>");
		out.println("<h4 ALIGN=\"CENTER\">Create a servlet to use and display all the getX() methods from the HttpServletRequest class and from the super interface ServletRequest</h4>");
		out.println("<ul>");
		out.println("<li><h4>HttpServletRequest class getX() methods</h4></li>");
		out.println("<ul>");
		out.println("<li><h5>getLastModified() returns the time the HttpServletRequest object was last modified, in milliseconds since midnight January 1, 1970 GMT.</h5><p>"+date+"</p></li>");
		out.println("</ul>");
		out.println("<li><h4>ServletRequest super class getX() methods</h4></li>");
		out.println("<ul>");
		out.println("<li><h5>getCharacterEncoding() returns name of the character encoding used in the body of this request.</h5><p>"+encoding+"</p></li>");
		out.println("<li><h5>getContentLength() returns the length, in bytes, of the request body and made available by the input stream, or -1 if the length is not known ir is greater than Integer.MAX_VALUE.</h5><p>"+contentLength+"</p></li>");
		out.println("<li><h5>getContentLengthLong() returns the length, in bytes, of the request body and made available by the input stream, or -1 if the length is not known.</h5><p>"+contentLengthLong+"</p></li>");
		out.println("<li><h5>getContentType() returns the MIME type of the body of the request, or null if the type is not known.</h5><p>"+contentType+"</p></li>");
		out.println("<li><h5>getLocalAddr() returns the Internet Protocol (IP) address of the interface on which the request was received.</h5><p>"+localAddr+"</p></li>");
		out.println("<li><h5>getLocalName() returns the the host name of the Internet Protocol (IP) interface on which the request was received.</h5><p>"+localName+"</p></li>");
		out.println("<li><h5>getLocalPort() returns the Internet Protocol (IP) port number of the interface on which the request was received.</h5><p>"+localPort+"</p></li>");
		out.println("<li><h5>getProtocol() returns the name and version of the protocol the request uses in the form protocol/majorVersion.minorVersion, for example, HTTP/1.1.</h5><p>"+protocol+"</p></li>");
		out.println("<li><h5>getRemoteAddr() returns the Internet Protocol (IP) address of the client or last proxy that sent the request.</h5><p>"+remoteAddr+"</p></li>");
		out.println("<li><h5>remoteHost() returns the fully qualified name of the client or the last proxy that sent the request.</h5><p>"+remoteAddr+"</p></li>");
		out.println("<li><h5>getRemotePort() returns the Internet Protocol (IP) source port of the client or last proxy that sent the request.</h5><p>"+remotePort+"</p></li>");
		out.println("<li><h5>getScheme() returns the name of the scheme used to make this request, for example, http, https, or ftp.</h5><p>"+scheme+"</p></li>");
		out.println("<li><h5>getServerName() returns the host name of the server to which the request was sent.</h5><p>"+serverName+"</p></li>");
		out.println("<li><h5>getServerPort() returns the port number to which the request was sent.</h5><p>"+serverPort+"</p></li>");
		out.println("<li><h5>getAttributeNames() returns an Enumeration containing the names of the attributes available to this request.</h5></li>");
		out.println("<ul>");
		while(attrNames.hasMoreElements()) {
			String attributeName = (String)attrNames.nextElement();
			out.println("<li><p>"+attributeName+"</p></li>");
		}
		out.println("</ul>");
		out.println("<li><h5>getDispatcherType() gets the dispatcher type of this request.</h5><p>"+dt+"</p></li>");
		out.println("<li><h5>getInputStream() retrieves the body of the request as binary data using a ServletInputStream.</h5><p>"+inputStream+"</p></li>");
		out.println("<li><h5>getLocale() returns the preferred Locale that the client will accept content in, based on the Accept-Language header.</h5><p>"+locale+"</p></li>");
		out.println("<li><h5>getLocales() returns an Enumeration of Locale objects indicating, in decreasing order starting with the preferred locale, the locales that are acceptable to the client based on the Accept-Language header.</h5></li>");
		out.println("<ul>");
		while(locales.hasMoreElements()) {
			out.println("<li><p>"+locales.nextElement()+"</p></li>");
		}
		out.println("</ul>");
		out.println("<li><h5>getParameterNames() returns an Enumeration of String objects containing the names of the parameters contained in this request.</h5></li>");
		out.println("<ul>");
		while(paramNames.hasMoreElements()) {
			out.println("<li><p>"+paramNames.nextElement()+"</p></li>");
		}
		out.println("</ul>");
		// out.println("<li><h5>getReader() retrieves the body of the request as character data using a BufferedReader.</h5><p>"+reader+"</p></li>");
		out.println("</ul>");
		out.println("</ul>");
		out.println("</body>");
		out.println("</html>");
	}
	
	//destroy life-cycle method
	public void destroy() {

	}
}