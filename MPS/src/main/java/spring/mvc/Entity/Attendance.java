package spring.mvc.Entity;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Attendance {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator="attendance_entity_seq_gen")
	@SequenceGenerator(name="attendance_entity_seq_gen", sequenceName="Attendance_SEQ")
	Integer id;
	Integer employeeId;
	String employeeName;
	@Temporal(value = TemporalType.DATE)
	Date today;
	@Temporal(value = TemporalType.TIME)
	Date startingTime;
	@PrePersist
	private void timeregisterDate() {
		startingTime = new Date();
		today = new Date();
	}

	String department;
	String designation;
//	Date closingTime;
	String status;
	public Attendance() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Attendance(Integer id, Integer employeeId, String employeeName, Date today, Date startingTime,
			String department, String designation, String status) {
		super();
		this.id = id;
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.today = today;
		this.startingTime = startingTime;
		this.department = department;
		this.designation = designation;
		this.status = status;
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
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public Date getToday() {
		return today;
	}
	public void setToday(Date today) {
		this.today = today;
	}
	public Date getStartingTime() {
		return startingTime;
	}
	public void setStartingTime(Date startingTime) {
		this.startingTime = startingTime;
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
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
}
