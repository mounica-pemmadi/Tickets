package com.service_tickets;

import java.util.List;


import com.madal.TicketDetails;

public interface Servicess {
	public int  ticketAdd(TicketDetails t);
	public List<TicketDetails>ticketView();
	public List<TicketDetails>ticketViewRow(int id);
    public int ticketUpdate(TicketDetails cd);
    public int  ticketdelete(TicketDetails cd);
    public int  allTicketDelete();
  

}
