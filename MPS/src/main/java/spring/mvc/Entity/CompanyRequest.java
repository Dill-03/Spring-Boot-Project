package spring.mvc.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class CompanyRequest {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO, generator="my_entity_seq_gen")
	@SequenceGenerator(name="my_entity_seq_gen", sequenceName="COMPANY_SEQ") 
	Integer companyId;
	String companyname;
	String workertype;
	String contractduration;
	String mail;
	String phone;
	@Column(name="status")
	String status="pending";
	public CompanyRequest() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CompanyRequest(Integer companyId, String companyname, String workertype, String contractduration,
			String mail, String phone, String status) {
		super();
		this.companyId = companyId;
		this.companyname = companyname;
		this.workertype = workertype;
		this.contractduration = contractduration;
		this.mail = mail;
		this.phone = phone;
		this.status = status;
	}
	public Integer getCompanyId() {
		return companyId;
	}
	public void setCompanyId(Integer companyId) {
		this.companyId = companyId;
	}
	public String getCompanyname() {
		return companyname;
	}
	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}
	public String getWorkertype() {
		return workertype;
	}
	public void setWorkertype(String workertype) {
		this.workertype = workertype;
	}
	public String getContractduration() {
		return contractduration;
	}
	public void setContractduration(String contractduration) {
		this.contractduration = contractduration;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
}
