package com.dao_tickets;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


import com.madal.TicketDetails;
import com.util.Connectionss;

//import com.agile.util.Connectionss;

public class  Daoimp implements Dao {
	TicketDetails t=new TicketDetails();
	public int add(TicketDetails t) {
		// TODO Auto-generated method stub
		int i=0;
		try {
		 Connection connection = Connectionss.m();
		 System.out.println("daoimp");
	
		   PreparedStatement ps = connection.prepareStatement("INSERT INTO tickets(email,problem_Type,problem_Description) VALUES (?,?, ?)");
		   
		    ps.setString(1,t.getEmail());
		    
		    ps.setString(2,t.getProblem_Type() );
		    ps.setString(3,t.getProblem_Description());
		   
		
		  
		    
		    System.out.println("after");
		        
		    
		       i= ps.executeUpdate();
		      if (i!=0)
		      {
		    	  System.out.println("insert data");
		    	  
		      }
		}catch(Exception e)
		{e.printStackTrace();
		} 
		return i;
	     //   cd.toString();
	}

	public List<TicketDetails> views() {
		// TODO Auto-generated method stub
		
		List<TicketDetails> ll=new ArrayList();
		TicketDetails cnt=new TicketDetails();
		try {
		Connection connection =Connectionss.m();
		System.out.println("dao imp");
		PreparedStatement s = connection.prepareStatement("SELECT * FROM tickets");
		System.out.println("after ");
		ResultSet ps=s.executeQuery();
       
	      while(ps.next()) {
	   
			
	    	 
	         int  id= ps.getInt(1);
	         String email= ps.getString(2);
	         String problemType = ps.getString(3);
	         String problemDescription = ps.getString(4);
	cnt.setId(id);
	cnt.setEmail(email);
	cnt.setProblem_Type(problemType);
	cnt.setProblem_Description(problemDescription);
	
		
	        
	        System.out.println(cnt+"output in dao ");
	       
	        ll.add(cnt);
	         
	
	        
	    }    		 
	        }catch(Exception e){
			      
			      e.printStackTrace();
			   }
		
		return ll;

	      }
	public int update(TicketDetails t) {
		// TODO Auto-generated method stub
		int k=0;
	
		System.out.println(t+"in dao");
		try {
		 Connection connection =Connectionss.m();
		//Statement stmt =connection.createStatement();
		System.out.println("Daoimp");
		//String  sql = "update contacts set email =? where id=?";
		System.out.println("query");
		  PreparedStatement ps=connection.prepareStatement("update tickets set group=? where problem_Type=?");
		  ps.setString(1,t.getEmail());
		  ps.setString(2,t.getProblem_Type());
		  System.out.println(" after query updated data"); 
		
	k=ps.executeUpdate();
	 System.out.println(k);

	}catch(Exception e) {
			
			e.printStackTrace();
		}
		return k;
	}

	public List<TicketDetails> viewRow(int id) {
		List<TicketDetails> ll=new ArrayList<TicketDetails>();
	TicketDetails cnt=new TicketDetails();
	try {
	Connection connection =Connectionss.m();
	System.out.println("dao imp");
	PreparedStatement s = connection.prepareStatement("SELECT * FROM tickets where id=?");
	System.out.println("after ");
	s.setInt(1,id);
	ResultSet ps=s.executeQuery();
   
      while(ps.next()) {
   
		
    		               
         int  id1= ps.getInt(1);
         String email= ps.getString(2);
         String problemType = ps.getString(3);
         String problemDescription = ps.getString(4);
         String group=ps.getString(5);
cnt.setId(id1);
cnt.setEmail(email);
cnt.setProblem_Type(problemType);
cnt.setProblem_Description(problemDescription);
cnt.setGroup(group);

	
        
        System.out.println(cnt+"output in dao ");
       
        ll.add(cnt);
         

        
    }    		 
        }catch(Exception e){
		      
		      e.printStackTrace();
		   }
	
	return ll;

	}

	public int Delete(TicketDetails t) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		  int j=0;//http://localhost:8081/contactss/demoServlet?id=1&emailid=pmoun@gmail.com
		try {
		
		
			    
				  		 
			 Connection connection =Connectionss.m();  
		//ContactDetails cnt=new ContactDetails();
			//Connection connection;
			 System.out.println("dao before");
			  
			PreparedStatement  ps=connection.prepareStatement("delete from tickets where id=?");
			
			 System.out.println("afters");
			ps.setInt(1,t.getId());
				
		j=	ps.executeUpdate();
		System.out.println(" executte delete");
		 
		if (j!=0)
		    
		  System.out.println(" dao delete data"); 
	   }catch(Exception  e){
	      
	      e.printStackTrace();
	   }
return j;
	
		
	}

	public int DeleteAll() {
		// TODO Auto-generated method stub
		int j=0;
		try {
		 Connection connection =Connectionss.m();  
			
				 System.out.println("dao before");
				  
				PreparedStatement  ps=connection.prepareStatement("DELETE FROM tickets ");
				
				 System.out.println("afters");
				//ps.setInt(1,t.getId());
					
			j=	ps.executeUpdate();
			System.out.println(" executte delete");
			
			if (j!=0)
			    
			  System.out.println(" dao delete data"); 
		   }catch(Exception  e){
		      
		      e.printStackTrace();
		   }
	return j;
		
		
	}



	


}
