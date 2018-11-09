package com.dao_tickets;

import java.util.List;


import com.madal.TicketDetails;

public interface Dao {
	public int add(TicketDetails t);
    public List<TicketDetails>  views();
    public int update(TicketDetails t);
    public List<TicketDetails>  viewRow(int id);
    public int  Delete(TicketDetails t);
    public int DeleteAll();
}
