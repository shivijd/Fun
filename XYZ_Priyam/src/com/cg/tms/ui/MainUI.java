package com.cg.tms.ui;

import java.util.Scanner;

import com.cg.tms.dao.TicketDAO;
import com.cg.tms.dao.TicketDAOImpl;
import com.cg.tms.dto.TicketCategory;
import com.cg.tms.service.TicketService;
import com.cg.tms.service.TicketServiceImpl;

public class MainUI {
	private static TicketDAO ticketDAO=new TicketDAOImpl();
	private static TicketService ticketService = new TicketServiceImpl(ticketDAO);
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		
		

	}
	
	public static void raiseTicket(){
		
		System.out.println("Enter the ticket Category");
		String categoryid=scanner.nextLine();
		String categoryname=ticketService.getCategory(categoryid);
		TicketCategory ticketCategory=new TicketCategory(categoryid,categoryname);
		System.out.println("Enter Ticket Description");
		String Description=scanner.nextLine();
		System.out.println("Ticked Priority");
		String priority=scanner.nextLine();
		String status="New";
		ticketDAO.
		
		
		TicketBean(String ticketNo, TicketCategory ticketCategory, String ticketDescription, String ticketPriority,
				String ticketStatus, String itimdComments)
		
		
		
		
		
	}

}
