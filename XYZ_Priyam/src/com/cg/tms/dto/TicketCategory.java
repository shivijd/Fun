package com.cg.tms.dto;

public class TicketCategory
{
	private String ticketCategoryId;
	private String categoryName;
	
	
	
	public TicketCategory() {
		super();
	}
	public TicketCategory(String ticketCategoryid, String categoryName)
	{
		this.ticketCategoryId = ticketCategoryid;
		this.categoryName = categoryName;
	}
	
	
	public String getTicketCategoryid() {
		return ticketCategoryId;
	}
	public void setTicketCategoryid(String ticketCategoryid) {
		this.ticketCategoryId = ticketCategoryid;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	
	@Override
	public String toString() {
		return "TicketCategory [ticketCategoryid=" + ticketCategoryId + ", categoryName=" + categoryName + "]";
}


}
