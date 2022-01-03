package spring.mvc.Entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Manpower {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Integer employeeId;
	String firstname;
	String lastname;
	String gender;
	Date dob;
	String address;
	String city;
	Integer postalcode;
	String contactnumber;
	String designation;
	Date joiningdate;
	String department;
	Double salary;
	
	String nameOfLastExame;
	String nameOfGroup;
	String institute;
	String passingYear;
	String grade;
	String experience;
	String status;
	public Manpower() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Manpower(Integer employeeId, String firstname, String lastname, String gender, Date dob, String address,
			String city, Integer postalcode, String contactnumber, String designation, Date joiningdate,
			String department, Double salary, String nameOfLastExame, String nameOfGroup, String institute,
			String passingYear, String grade, String experience, String status) {
		super();
		this.employeeId = employeeId;
		this.firstname = firstname;
		this.lastname = lastname;
		this.gender = gender;
		this.dob = dob;
		this.address = address;
		this.city = city;
		this.postalcode = postalcode;
		this.contactnumber = contactnumber;
		this.designation = designation;
		this.joiningdate = joiningdate;
		this.department = department;
		this.salary = salary;
		this.nameOfLastExame = nameOfLastExame;
		this.nameOfGroup = nameOfGroup;
		this.institute = institute;
		this.passingYear = passingYear;
		this.grade = grade;
		this.experience = experience;
		this.status = status;
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Integer getPostalcode() {
		return postalcode;
	}
	public void setPostalcode(Integer postalcode) {
		this.postalcode = postalcode;
	}
	public String getContactnumber() {
		return contactnumber;
	}
	public void setContactnumber(String contactnumber) {
		this.contactnumber = contactnumber;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public Date getJoiningdate() {
		return joiningdate;
	}
	public void setJoiningdate(Date joiningdate) {
		this.joiningdate = joiningdate;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public String getNameOfLastExame() {
		return nameOfLastExame;
	}
	public void setNameOfLastExame(String nameOfLastExame) {
		this.nameOfLastExame = nameOfLastExame;
	}
	public String getNameOfGroup() {
		return nameOfGroup;
	}
	public void setNameOfGroup(String nameOfGroup) {
		this.nameOfGroup = nameOfGroup;
	}
	public String getInstitute() {
		return institute;
	}
	public void setInstitute(String institute) {
		this.institute = institute;
	}
	public String getPassingYear() {
		return passingYear;
	}
	public void setPassingYear(String passingYear) {
		this.passingYear = passingYear;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getExperience() {
		return experience;
	}
	public void setExperience(String experience) {
		this.experience = experience;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
}
