package com.onlinegrocery.entity;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PaymentMasterEntity {
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id

	private int id;
	private String name;
	private long accno;
	private long password;
	private long ccno;
	private int cccvv;
	private String ccexpiry;  
	private long dbno;
	private int dbcvv;
	private String dbexpiry; 
	private String upiid;
	private int upipin;
	public PaymentMasterEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "PaymentMasterEntity [id=" + id + ", name=" + name + ", accno=" + accno + ", password=" + password
				+ ", ccno=" + ccno + ", cccvv=" + cccvv + ", ccexpiry=" + ccexpiry + ", dbno=" + dbno + ", dbcvv="
				+ dbcvv + ", dbexpiry=" + dbexpiry + ", upiid=" + upiid + ", upipin=" + upipin + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getAccno() {
		return accno;
	}
	public void setAccno(long accno) {
		this.accno = accno;
	}
	public long getPassword() {
		return password;
	}
	public void setPassword(long password) {
		this.password = password;
	}
	public long getCcno() {
		return ccno;
	}
	public void setCcno(long ccno) {
		this.ccno = ccno;
	}
	public int getCccvv() {
		return cccvv;
	}
	public void setCccvv(int cccvv) {
		this.cccvv = cccvv;
	}
	public String getCcexpiry() {
		return ccexpiry;
	}
	public void setCcexpiry(String ccexpiry) {
		this.ccexpiry = ccexpiry;
	}
	public long getDbno() {
		return dbno;
	}
	public void setDbno(long dbno) {
		this.dbno = dbno;
	}
	public int getDbcvv() {
		return dbcvv;
	}
	public void setDbcvv(int dbcvv) {
		this.dbcvv = dbcvv;
	}
	public String getDbexpiry() {
		return dbexpiry;
	}
	public void setDbexpiry(String dbexpiry) {
		this.dbexpiry = dbexpiry;
	}
	public String getUpiid() {
		return upiid;
	}
	public void setUpiid(String upiid) {
		this.upiid = upiid;
	}
	public int getUpipin() {
		return upipin;
	}
	public void setUpipin(int upipin) {
		this.upipin = upipin;
	}
	public PaymentMasterEntity(int id, String name, long accno, long password, long ccno, int cccvv, String ccexpiry,
			long dbno, int dbcvv, String dbexpiry, String upiid, int upipin) {
		super();
		this.id = id;
		this.name = name;
		this.accno = accno;
		this.password = password;
		this.ccno = ccno;
		this.cccvv = cccvv;
		this.ccexpiry = ccexpiry;
		this.dbno = dbno;
		this.dbcvv = dbcvv;
		this.dbexpiry = dbexpiry;
		this.upiid = upiid;
		this.upipin = upipin;
	}
	
}