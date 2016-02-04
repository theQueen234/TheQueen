import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class ServletTest extends HttpServlet{
	private String message;
	public void init() throws ServletException{
		message="Hello Dumpass";
	}
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
		try{
		response.setContentType("text/html");
		PrintWriter outt=response.getWriter();
		outt.println("<!DOCTYPE HTML><html lang=\"en\"><html><body><h1>"+message+"</h1></body></html>");
		}catch(Exception e){response.setContentType("text/html");
		PrintWriter outt=response.getWriter();outt.println(e);}
		}
	public void destroy(){}
}
/* this is stupid /*