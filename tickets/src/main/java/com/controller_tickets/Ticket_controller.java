package com.controller_tickets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;
//import com.agile.modal.ContactDetails;
import com.madal.TicketDetails;
import com.service_tickets.Serviceimp;

@WebServlet("/ticket")

public class Ticket_controller extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Serviceimp si=new Serviceimp();
/*	public void doPost(HttpServletRequest request ,HttpServletResponse response) throws IOException {
		

				PrintWriter out = response.getWriter();
				response.setContentType("text/html");
				String email=request.getParameter("email");
				String problem_Type=request.getParameter("problem_Type");
				String problem_Description=request.getParameter("problem_Description");
				
				TicketDetails td=new TicketDetails();
				td.setEmail(email);
				td.setProblem_Type(problem_Type);
				td.setProblem_Description(problem_Description);
				
				si.ticketAdd(td);
				
	}*/
	
    /*protected void doGet(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException
    {	
    	//int i=0;//delete ticket
     	PrintWriter out = response.getWriter();
    	response.setContentType("text/html");
    	
    	System.out.println("before");
    	
    	
      	    	PrintWriter out = response.getWriter();
    	response.setContentType("text/html");
    	int id = Integer.parseInt(request.getParameter("id"));	
    	 ContactDetails cd=new ContactDetails();
    	cd.setId(id);
    	 int i=conser.delete(cd);    		 
    	 if(i!=0)
    	    {
    		 
    	    out.print(i+"item delete ");
    	    	
    	    }
    	
    	List<TicketDetails> i= si.ticketView();
       System.out.println("finally");
   	
   	    out.print(i);

 	    
        
    }*/
    protected void doPut(HttpServletRequest request,HttpServletResponse response) throws IOException
    {
    	PrintWriter out = response.getWriter();
    	response.setContentType("text/html");
   	 TicketDetails cd=new TicketDetails();
    	String group=request.getParameter("group");
    	String problem_Type=request.getParameter("problem_Type");
    	
   cd.setProblem_Type(problem_Type);
   cd.setEmail(group);
    	int i= si.ticketUpdate(cd);
    	
     if(i!=0)
 	   
     out.print(i+"item updated ");

 	  
    }
    	 
  /*  protected void doGet(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException
    {	//based on id select ticket
    	
     	PrintWriter out = response.getWriter();
    	response.setContentType("text/html");
    	
    	System.out.println("before");
    	int id =Integer.parseInt(request.getParameter("id"));
    	
    	
      	 
    	List<TicketDetails> i= si.ticketViewRow(id);
       System.out.println("finally");
   	
   	    out.print(i);

   	    ObjectMapper mapper=new ObjectMapper();
   	    String newjson =mapper.writeValueAsString(i);
   	    out.println(newjson);
  }*/
  /*  protected void doGet(HttpServletRequest request,
            HttpServletResponse response) throws IOException
           
    {
       	PrintWriter out = response.getWriter();
    	response.setContentType("text/html");
    	//int id = Integer.parseInt(request.getParameter("id"));	
    	// TicketDetails t=new TicketDetails();
    	//t.setId(id);
    //	 int i=si.ticketdelete(t);   
    	int i=si.allTicketDelete(); 		 
    	 if(i!=0)
    	    {
    		 
    	    out.print(i+"item delete ");
    	    	
    	    }
    	*/
    
    protected void doGet(HttpServletRequest request,
            HttpServletResponse response) throws IOException
           
    {
       	PrintWriter out = response.getWriter();
    	response.setContentType("text/html");
    	int id = Integer.parseInt(request.getParameter("id"));	
    	 TicketDetails t=new TicketDetails();
    t.setId(id);
    // int i=si.ticketdelete(t);   
    	int i=si.ticketdelete(t); 		 
    	 if(i!=0)
    	    {
    		 
    	    out.print(i+"item delete ");
    	    	
    	    }
    }


	    
    }     

