package io.presentations.SpringBootStarter.Client;

public class Customer {
	private String name;
	private String id;
	private long Ph_no;
	
	public Customer() {
		
	   }
	public Customer(String name, String id, long ph_no) {
		super();
		this.name = name;
		this.id = id;
		Ph_no = ph_no;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public long getPh_no() {
		return Ph_no;
	}

	public void setPh_no(long ph_no) {
		Ph_no = ph_no;
	}
 }