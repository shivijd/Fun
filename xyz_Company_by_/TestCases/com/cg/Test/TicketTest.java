package com.cg.Test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.cg.tms.dao.TicketDAO;
import com.cg.tms.dao.TicketDAOImpl;
import com.cg.tms.dto.TicketBean;
import com.cg.tms.dto.TicketCategory;

public class TicketTest {
	TicketDAO daoRef;
    @Before
	public void before()
	{
		daoRef=new TicketDAOImpl();
	}
	
	
	@Test
	public void test() {
		
		TicketCategory ticketCategory=new TicketCategory("tc007", "Software Issue");
		TicketBean tb=new TicketBean(ticketCategory,"Extra Details","low","new");
		boolean flag;
		flag=daoRef.raiseNewTicket(tb);
		assertTrue(flag);
		
		assertEquals(flag,true);
		
		assertFalse(!flag);
	
	}

	@After
	public void Finish()
	{
		daoRef=null;
	}
}
