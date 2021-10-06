package com.ebit.data.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Client {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Client_data")
	@SequenceGenerator(name = "Client_data", sequenceName = "Client_SEQ", schema = "PACE", allocationSize = 1)
	@NotNull
	private int clientid;
	@NotNull
	private String clientname;
	@NotNull
	@Column(length = 500)
	@Size(min = 15, max = 15)
	private String gstin;
	
	@ManyToOne(fetch=FetchType.LAZY)
	private CA ca;
	
	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Client(@NotNull int clientid, @NotNull String clientname, @NotNull @Size(min = 15, max = 15) String gstin,
			CA ca) {
		super();
		this.clientid = clientid;
		this.clientname = clientname;
		this.gstin = gstin;
		this.ca = ca;
	}

	public int getClientid() {
		return clientid;
	}

	public void setClientid(int clientid) {
		this.clientid = clientid;
	}

	public String getClientname() {
		return clientname;
	}

	public void setClientname(String clientname) {
		this.clientname = clientname;
	}

	public String getGstin() {
		return gstin;
	}

	public void setGstin(String gstin) {
		this.gstin = gstin;
	}

	public CA getCa() {
		return ca;
	}

	public void setCa(CA ca) {
		this.ca = ca;
	}

	@Override
	public String toString() {
		return "Client [clientid=" + clientid + ", clientname=" + clientname + ", gstin=" + gstin + ", ca=" + ca + "]";
	}	
}

