package com.cg.tms.dao;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import com.cg.tms.dto.TicketBean;
import com.cg.tms.dto.TicketCategory;
public class TicketDAOImpl implements TicketDAO
{
private static Map<String,String> ticketCategory=new HashMap<String,String>();
private static Map<String,TicketBean> ticketLog=new HashMap<>();
public static Map<String,String> getTicketCategoryEntries()
{
	ticketCategory.put("tc001", "software installation");
	ticketCategory.put("tc002", "mailbox creation");
	ticketCategory.put("tc003", "mailbox issues");
	return ticketCategory;
}

	@Override
	public boolean raiseNewTicket(TicketBean ticketBean) 
	{
		ticketLog.put(ticketBean.getTicketNo(), ticketBean);
		return true;
     
	}
	@Override
	public List<TicketCategory> listTicketCategory()
	{
		List<TicketCategory> list=new LinkedList(ticketCategory.values());
		return list;
	}

	public static Map<String, String> getTicketCategory() {
		return ticketCategory;
	}

	public static Map<String, TicketBean> getTicketLog() {
		return ticketLog;
	}

	public String getCategory(String name)
	{
		for(Entry<String,String> entry:ticketCategory.entrySet())
		{
			if(entry.getKey().equals(name))
				return entry.getValue();
		}
		return null;
		
	}
	
	
	

}
