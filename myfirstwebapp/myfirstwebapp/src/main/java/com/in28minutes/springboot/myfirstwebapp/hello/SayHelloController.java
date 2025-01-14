package com.in28minutes.springboot.myfirstwebapp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@Controller
public class SayHelloController {
	
	   //"say-hello => "Hello! What are you learning today?"
	
	   //say-hello 
	   //http://localhost:8080/say-hello
	   @RequestMapping("say-hello") 
	   @ResponseBody
	   public String sayHello() {
		      return "Hello! What are you learning today?";  
	   }
	   
	   
	   @RequestMapping("say-hello-html") 
	   @ResponseBody
	   public String sayHelloHtml() {
		      StringBuffer sb = new StringBuffer();
		      sb.append("<html>");
		      sb.append("<head>");
		      sb.append("<title> My First HTML Page - Changed</title>");
		      sb.append("</head>");
		      sb.append("<body>");
		      sb.append("<My first html page with body - Changed>");
		      sb.append("</body>");
		      sb.append("</html>");
		      sb.append("</html>");
		      
		      return sb.toString();  
	   }
	   
	   
	    //"say-hello-jsp" => sayHello.jsp
	    // /src/main/resources/META_INF/resources/WEB_INF/jsp/sayHello.jsp
	    // /src/main/resources/META_INF/resources/WEB_INF/jsp/welcome.jsp
	   // /src/main/resources/META_INF/resources/WEB_INF/jsp/login.jsp
	   // /src/main/resources/META_INF/resources/WEB_INF/jsp/todos.jsp
	  
	   @RequestMapping("say-hello-jsp")
		public String sayHelloJsp() {
			return "sayHello";
		}
}
