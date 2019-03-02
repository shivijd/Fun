package com.cg.tms.service;

import java.util.List;

import com.cg.tms.dao.TicketDAO;
import com.cg.tms.dao.TicketDAOImpl;
import com.cg.tms.dto.TicketBean;
import com.cg.tms.dto.TicketCategory;
import com.cg.tms.exception.ListIsEmptyException;

public class TicketServiceImpl implements TicketService {

	TicketDAO daoRef= new TicketDAOImpl();
	
	@Override
	public boolean raiseNewTicket(TicketBean ticketBean) {
		
		return daoRef.raiseNewTicket(ticketBean);
	}

	@Override
	public List<TicketCategory> listTicketCategory() throws ListIsEmptyException {
		
		return daoRef.listTicketCategory();
	}

}
