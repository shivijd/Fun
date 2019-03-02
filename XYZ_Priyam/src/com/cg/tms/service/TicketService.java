package com.cg.tms.service;

import java.util.List;

import com.cg.tms.dto.TicketBean;
import com.cg.tms.dto.TicketCategory;

public interface TicketService {
	boolean raiseNewTicket(TicketBean ticketBean);

	List<TicketCategory> listTicketCategory();
	public String getCategory(String id);
}
