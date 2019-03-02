package com.cg.tms.service;

import java.util.List;
import java.util.Map.Entry;

import com.cg.tms.dao.TicketDAO;
import com.cg.tms.dto.TicketBean;
import com.cg.tms.dto.TicketCategory;

public class TicketServiceImpl implements TicketService {

      TicketDAO ticketDAO;
      
	
	public TicketServiceImpl(TicketDAO ticketDAO) {
		super();
		this.ticketDAO = ticketDAO;
	}

	@Override
	public boolean raiseNewTicket(TicketBean ticketBean) {
		ticketDAO.raiseNewTicket(ticketBean);
		return true;
	}

	@Override
	public List<TicketCategory> listTicketCategory() {
		
		return ticketDAO.listTicketCategory();
	}
	
	public String getCategory(String id)
	{
		return ticketDAO.getCategory(id);
		
	}

}
