package spring.mvc.Entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class RequestManpower {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Integer requestid;
	String firstname;
	String lastname;
	String gender;
	Date dob;
	String address;
	String city;
	Integer postalcode;
	String contactnumber;
	String worktype;
	
	String nameOfLastExame;
	String nameOfGroup;
	String institute;
	String passingYear;
	String grade;
	String experience;	
	@Column(name="status")
	String status="pending";
	public RequestManpower() {
		super();
		// TODO Auto-generated constructor stub
	}
	public RequestManpower(Integer requestid, String firstname, String lastname, String gender, Date dob,
			String address, String city, Integer postalcode, String contactnumber, String worktype,
			String nameOfLastExame, String nameOfGroup, String institute, String passingYear, String grade,
			String experience, String status) {
		super();
		this.requestid = requestid;
		this.firstname = firstname;
		this.lastname = lastname;
		this.gender = gender;
		this.dob = dob;
		this.address = address;
		this.city = city;
		this.postalcode = postalcode;
		this.contactnumber = contactnumber;
		this.worktype = worktype;
		this.nameOfLastExame = nameOfLastExame;
		this.nameOfGroup = nameOfGroup;
		this.institute = institute;
		this.passingYear = passingYear;
		this.grade = grade;
		this.experience = experience;
		this.status = status;
	}
	public Integer getRequestid() {
		return requestid;
	}
	public void setRequestid(Integer requestid) {
		this.requestid = requestid;
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
	public String getWorktype() {
		return worktype;
	}
	public void setWorktype(String worktype) {
		this.worktype = worktype;
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
