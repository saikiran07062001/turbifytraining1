package com.infinite.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Product1")
public class Product {
	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO, generator = "CUST_GEN")
	@Column(name = "productid") // database id
	private int pid;
	@Column(name = "productname")
	private String pname;
	@Column(name = "price")
	private int price;

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
