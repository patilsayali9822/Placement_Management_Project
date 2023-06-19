package com.tns.entity.modules;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Student 
{
	@Id    
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private String college;
	private Integer roll;
	private String qualification;
	private String course;
	private Integer year;
	private String certificate;
	private Integer hallticketno;
	
	public Student(Integer id, String name, String college, Integer roll, String qualification, String course,
			Integer year, String certificate, Integer hallticketno) {
		super();
		this.id = id;
		this.name = name;
		this.college = college;
		this.roll = roll;
		this.qualification = qualification;
		this.course = course;
		this.year = year;
		this.certificate = certificate;
		this.hallticketno = hallticketno;
	}
	public Student() {
		super();
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	public Integer getRoll() {
		return roll;
	}
	public void setRoll(Integer roll) {
		this.roll = roll;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public Integer getYear() {
		return year;
	}
	public void setYear(Integer year) {
		this.year = year;
	}
	public String getCertificate() {
		return certificate;
	}
	public void setCertificate(String certificate) {
		this.certificate = certificate;
	}
	public Integer getHallTicketNo() {
		return hallticketno;
	}
	public void setHallTicketNo(Integer hallticketno) {
		this.hallticketno = hallticketno;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", college=" + college + ", roll=" + roll + ", qualification="
				+ qualification + ", course=" + course + ", year=" + year + ", certificate=" + certificate
				+ ", hallticketno=" + hallticketno + "]";
	}
	
}
