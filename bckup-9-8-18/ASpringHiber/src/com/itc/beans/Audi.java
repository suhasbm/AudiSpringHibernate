package com.itc.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="audi")
public class Audi implements Serializable{
	
	@Id
	@Column(name ="eventid")
	private int eventid;
	
	@Column(name ="eventname")
	private String eventname;
	
	@Column(name ="category")
	private String category;
	
	@Column(name ="ticketprice")
	private int ticketprice;
	
	@Column(name ="quantity")
	private int quantity;
	
	@Column(name ="eventdate")
	private String eventdate;
	
	
	public int getEventid() {
		return eventid;
	}
	public void setEventid(int eventid) {
		this.eventid = eventid;
	}
	public String getEventname() {
		return eventname;
	}
	public void setEventname(String eventname) {
		this.eventname = eventname;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getTicketprice() {
		return ticketprice;
	}
	public void setTicketprice(int ticketprice) {
		this.ticketprice = ticketprice;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getEventdate() {
		return eventdate;
	}
	public void setEventdate(String eventdate) {
		this.eventdate = eventdate;
	}
	public Audi(int eventid, String eventname, String category, int ticketprice, int quantity, String eventdate) {
		super();
		this.eventid = eventid;
		this.eventname = eventname;
		this.category = category;
		this.ticketprice = ticketprice;
		this.quantity = quantity;
		this.eventdate = eventdate;
	}
	public Audi() {
		super();
		// TODO Auto-generated constructor stub
	}


	}
