package com.cg.tms.service;

import java.util.List;

import com.cg.tms.dto.TicketBean;
import com.cg.tms.dto.TicketCategory;
import com.cg.tms.exception.ListIsEmptyException;

public interface TicketService {

	boolean raiseNewTicket(TicketBean ticketBean);
	List<TicketCategory> listTicketCategory() throws ListIsEmptyException;
	
}
