package spring.mvc.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class SalaryFields {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Integer id;
	Integer employeeId;
	String firstname;
	String lastname;
	String department;
	String designation;
	//-----------------//
	Double basicSalary;
	Double houseRent;
	Double medicalAllownce;
	Double transportAllownce;
	
	Double tax;
	Double providentfund;
	Double absentDeduction;
	Double totalSalary;
	public SalaryFields() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SalaryFields(Integer id, Integer employeeId, String firstname, String lastname, String department,
			String designation, Double basicSalary, Double houseRent, Double medicalAllownce, Double transportAllownce,
			Double tax, Double providentfund, Double absentDeduction, Double totalSalary) {
		super();
		this.id = id;
		this.employeeId = employeeId;
		this.firstname = firstname;
		this.lastname = lastname;
		this.department = department;
		this.designation = designation;
		this.basicSalary = basicSalary;
		this.houseRent = houseRent;
		this.medicalAllownce = medicalAllownce;
		this.transportAllownce = transportAllownce;
		this.tax = tax;
		this.providentfund = providentfund;
		this.absentDeduction = absentDeduction;
		this.totalSalary = totalSalary;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public Double getBasicSalary() {
		return basicSalary;
	}
	public void setBasicSalary(Double basicSalary) {
		this.basicSalary = basicSalary;
	}
	public Double getHouseRent() {
		return houseRent;
	}
	public void setHouseRent(Double houseRent) {
		this.houseRent = houseRent;
	}
	public Double getMedicalAllownce() {
		return medicalAllownce;
	}
	public void setMedicalAllownce(Double medicalAllownce) {
		this.medicalAllownce = medicalAllownce;
	}
	public Double getTransportAllownce() {
		return transportAllownce;
	}
	public void setTransportAllownce(Double transportAllownce) {
		this.transportAllownce = transportAllownce;
	}
	public Double getTax() {
		return tax;
	}
	public void setTax(Double tax) {
		this.tax = tax;
	}
	public Double getProvidentfund() {
		return providentfund;
	}
	public void setProvidentfund(Double providentfund) {
		this.providentfund = providentfund;
	}
	public Double getAbsentDeduction() {
		return absentDeduction;
	}
	public void setAbsentDeduction(Double absentDeduction) {
		this.absentDeduction = absentDeduction;
	}
	public Double getTotalSalary() {
		return totalSalary;
	}
	public void setTotalSalary(Double totalSalary) {
		this.totalSalary = totalSalary;
	}
	
	
	

}
