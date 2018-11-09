package com.service_tickets;

import java.util.List;

import com.dao_tickets.Daoimp;
import com.madal.TicketDetails;

public class Serviceimp implements Servicess{
Daoimp d=new Daoimp();
	public int  ticketAdd(TicketDetails t) {
		return d.add(t);
	}
	public List<TicketDetails> ticketView() {
		// TODO Auto-generated method stub
		System.out.println("service imp");
		return d.views();
	}
	public int ticketUpdate(TicketDetails cd) {
		// TODO Auto-generated method stub
		return d.update(cd);
	}
	public List<TicketDetails> ticketViewRow(int id) {
		// TODO Auto-generated method stub
		return d.viewRow(id);
	}
	public int ticketdelete(TicketDetails t) {
		// TODO Auto-generated method stub
		return d.Delete(t);
	}
	public int allTicketDelete() {
		// TODO Auto-generated method stub
		return d.DeleteAll();
	}

}
