package com.ebit.data.demo.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.NotNull;

@Entity
public class CA {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CA_data")
	@SequenceGenerator(name = "CA_data", sequenceName = "CA_SEQ", schema = "PACE", allocationSize = 1)
	@NotNull
	private int caid;
	@NotNull
	private String name;
	@NotNull
	private String groupid;
	
	@OneToMany(mappedBy="ca")  
	private List<Client> client;
	
	public CA() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CA(@NotNull int caid, @NotNull String name, @NotNull String groupid) {
		super();
		this.caid = caid;
		this.name = name;
		this.groupid = groupid;
	}
	public int getCaid() {
		return caid;
	}
	public void setCaid(int caid) {
		this.caid = caid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGroupid() {
		return groupid;
	}
	public void setGroupid(String groupid) {
		this.groupid = groupid;
	}
	@Override
	public String toString() {
		return "CA [caid=" + caid + ", name=" + name + ", groupid=" + groupid + "]";
	}
}
