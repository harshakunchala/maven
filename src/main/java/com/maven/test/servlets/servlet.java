package com.maven.test.servlets;
import java.io.IOException;
import java.io.PrintWriter;

import javax.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.json.simple.JSONObject;

public class servlet extends HttpServlet
{
	
	public void service(HttpServletRequest req,HttpServletResponse res)  throws IOException
    {
        int i=Integer.parseInt(req.getParameter("num1"));
        int j=Integer.parseInt(req.getParameter("num2"));

        int k=i+j;
        System.out.println("the result is "+ k);
        PrintWriter out=res.getWriter();
        out.println("result is "+k);
        JSONObject obj=new JSONObject();  
        obj.put("value is ",k); 
        out.println("result is "+obj);
        
    }


}
