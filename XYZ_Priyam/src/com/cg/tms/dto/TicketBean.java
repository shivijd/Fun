package com.cg.tms.dto;

public class TicketBean
{
private String ticketNo;
private TicketCategory ticketCategory;
private String ticketDescription;
private String ticketPriority;
private String ticketStatus;
private String itimdComments;
//private static int c;



//public TicketBean(String ticketNo, TicketCategory ticketCategory, String ticketDescription, String ticketPriority,
//		String ticketStatus, String itimdComments)
//{
////	int c;
////	c = (int)(Math.random()*1000);
//	this.ticketNo = ticketNo;
////c= (int) (Math.random()*1000);
////	this.ticketNo = String.valueOf(c);
//	this.ticketCategory = ticketCategory;
//	this.ticketDescription = ticketDescription;
//	this.ticketPriority = ticketPriority;
//	this.ticketStatus = ticketStatus;
//	this.itimdComments = itimdComments;
//}

public TicketBean() {
	super();
}
public TicketBean(String ticketNo, TicketCategory ticketCategory, String ticketDescription, String ticketPriority,
		String ticketStatus, String itimdComments) {
	super();
	this.ticketNo = ticketNo;
	this.ticketCategory = ticketCategory;
	this.ticketDescription = ticketDescription;
	this.ticketPriority = ticketPriority;
	this.ticketStatus = ticketStatus;
	this.itimdComments = itimdComments;
}

public String getTicketNo() {
	return ticketNo;
}
public void setTicketNo(String ticketNo) {
	this.ticketNo = ticketNo;
}
public TicketCategory getTicketCategory() {
	return ticketCategory;
}
public void setTicketCategory(TicketCategory ticketCategory) {
	this.ticketCategory = ticketCategory;
}
public String getTicketDescription() {
	return ticketDescription;
}
public void setTicketDescription(String ticketDescription) {
	this.ticketDescription = ticketDescription;
}
public String getTicketPriority() {
	return ticketPriority;
}
public void setTicketPriority(String ticketPriority) {
	this.ticketPriority = ticketPriority;
}
public String getTicketStatus() {
	return ticketStatus;
}
public void setTicketStatus(String ticketStatus) {
	this.ticketStatus = ticketStatus;
}
public String getItimdComments() {
	return itimdComments;
}
public void setItimdComments(String itimdComments) {
	this.itimdComments = itimdComments;
}
@Override
public String toString() {
	return "TicketBean [ticketNo=" + ticketNo + ", ticketCategory=" + ticketCategory + ", ticketDescription="
			+ ticketDescription + ", ticketPriority=" + ticketPriority + ", ticketStatus=" + ticketStatus
			+ ", itimdComments=" + itimdComments + "]";
}

}
