package com.cg.tms.ui;

import java.text.SimpleDateFormat;

import java.util.Date;

import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import com.cg.tms.dto.*;
import com.cg.tms.exception.ListIsEmptyException;
import com.cg.tms.service.TicketService;
import com.cg.tms.service.TicketServiceImpl;

public class main {//Change class name 

	public static void main(String[] args) {

		TicketService serRef = new TicketServiceImpl();
		List<TicketCategory> ls;
		Scanner sc = new Scanner(System.in);
		int x = 1;
		int mainChoice;
		System.out.println("Welcom");
		System.out.println("1. Raise");
		System.out.println("2. Exit");
		mainChoice = Integer.parseInt(sc.nextLine());
		switch (mainChoice) {
		case 1: {

			try
			{
				ls = serRef.listTicketCategory();
				System.out.println("Select Category From BElow:");
				for (TicketCategory t : ls) {

					System.out.println(x + ": " + t.getCategoryName());
					x++;
				}
				System.out.println("Enter option:");
				int choice = Integer.parseInt(sc.nextLine());
				String tc = "";
				String tid = "";
				switch (choice) {
				case 1: {
					tid = ls.get(0).getTicketCategoryId();
					tc = ls.get(0).getCategoryName();
					break;
				}
				case 2: {
					tid = ls.get(1).getTicketCategoryId();
					tc = ls.get(1).getCategoryName();
					break;
				}
				case 3: {
					tid = ls.get(2).getTicketCategoryId();
					tc = ls.get(2).getCategoryName();
					break;
				}
				default: {
					System.out.println("wrong");
					System.exit(0);
				}
				}

				System.out.println("description lo");
				String desc = sc.nextLine();

				System.out.println("priority lo (1: low/2: medium/3: high)");
				int pr = Integer.parseInt(sc.nextLine());
				String prio = "";
				switch (pr) {
				case 1:
					prio = "low";
					break;
				case 2:
					prio = "medium";
					break;
				case 3:
					prio = "high";
					break;
				default: {
					// throw new sjdihfij();
					System.out.println("wrong");
					System.exit(0);
				}
				}
				String ticketStatus = "new";

				TicketCategory ticketCategory = new TicketCategory(tid, tc);
				TicketBean tb = new TicketBean(ticketCategory, desc, prio, ticketStatus);

				SimpleDateFormat month_date = new SimpleDateFormat("dd MMMM yyyy hh:mm a", Locale.ENGLISH);
				Date date = new Date();
				String currdate = month_date.format(date);

				boolean f = serRef.raiseNewTicket(tb);
				if (f == true)
					System.out.println("Ticket Number " + tb.getTicketNo() + " Logged Successfully at " + currdate);
				break;
			}
			catch(ListIsEmptyException e)
			{
				System.err.println("List is empty");
			}
			}
			

		case 2:
			System.exit(0);
		}

	}
}
