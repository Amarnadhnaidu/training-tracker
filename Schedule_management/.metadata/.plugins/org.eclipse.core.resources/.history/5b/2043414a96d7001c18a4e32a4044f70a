package in.hcl.schedule_management.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Schedule {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long employeeId;
	private String employeeName;
	private String programName;
	@JsonFormat(pattern="yyyy-mm-dd")
	private Date startDate;
	@JsonFormat(pattern="yyyy-mm-dd")
	private Date endDate;
	@JsonFormat(pattern="yyyy-mm-dd")
	private Date createdAt;
	@JsonFormat(pattern="yyyy-mm-dd")
	private Date updatedAt;
	public Schedule(long employeeId, String employeeName, String programName, Date startDate, Date endDate,
			Date createdAt, Date updatedAt) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.programName = programName;
		this.startDate = startDate;
		this.endDate = endDate;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}
	public long getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(long employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getProgramName() {
		return programName;
	}
	public void setProgramName(String programName) {
		this.programName = programName;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public Date getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
	
	@PrePersist
	public void onCreate() {
		this.createdAt = new Date();
	}
	
	@PreUpdate
	public void onUdate() {
		this.updatedAt = new Date();
	}

}
