package com.cg.tms.dao;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import com.cg.tms.dto.TicketBean;
import com.cg.tms.dto.TicketCategory;
import com.cg.tms.exception.ListIsEmptyException;

public class TicketDAOImpl implements TicketDAO {

	private static Map<String,String> ticketCategory=new HashMap<String,String>();
	
	public static Map<String,String> getTicketCategoryEntries(){
		ticketCategory.put("tc001", "Software Installation");
		ticketCategory.put("tc002", "MailBox Creation");
		ticketCategory.put("tc003", "Mail Box Issues");
		
		return ticketCategory;
		
	}
	public static Map<String,TicketBean> ticketLog=new HashMap<String,TicketBean>();
	
	
	@Override
	public boolean raiseNewTicket(TicketBean ticketBean) {
		TicketBean tb=ticketLog.put(ticketBean.getTicketNo(), ticketBean);
		if(tb==null)
		return true;
		return false;
	}

	@Override
	public List<TicketCategory> listTicketCategory() throws ListIsEmptyException {
		List<TicketCategory> ls=new LinkedList<TicketCategory>();
		TicketCategory tc;
		for(Map.Entry<String, String> m:getTicketCategoryEntries().entrySet())
		{
			tc=new TicketCategory(m.getKey(),m.getValue());
			ls.add(tc);			
		}
		if(ls.isEmpty())
		{
			throw new ListIsEmptyException();
		}
		return ls;
	}

}
