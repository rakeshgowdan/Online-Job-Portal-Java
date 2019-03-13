package com.niit.JobBean;

public class Job {

	private String Location;
	private String Farea;
	private String Jpost;
	private int Vacancy;
	private String salary;
	private String Idate;
	private String Itime;
	private String Iplace;
	private String skills;
	public String getLocation() {
		return Location;
	}
	public void setLocation(String location) {
		Location = location;
	}
	public String getFarea() {
		return Farea;
	}
	public void setFarea(String farea) {
		Farea = farea;
	}
	@Override
	public String toString() {
		return "Job [Location=" + Location + ", Farea=" + Farea + ", Jpost=" + Jpost + ", Vacancy=" + Vacancy
				+ ", salary=" + salary + ", Idate=" + Idate + ", Itime=" + Itime + ", Iplace=" + Iplace + ", skills="
				+ skills + "]";
	}
	public String getJpost() {
		return Jpost;
	}
	public void setJpost(String jpost) {
		Jpost = jpost;
	}
	public int getVacancy() {
		return Vacancy;
	}
	public void setVacancy(int vacancy) {
		Vacancy = vacancy;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	public String getIdate() {
		return Idate;
	}
	public void setIdate(String idate) {
		Idate = idate;
	}
	public String getItime() {
		return Itime;
	}
	public void setItime(String itime) {
		Itime = itime;
	}
	public String getIplace() {
		return Iplace;
	}
	public void setIplace(String iplace) {
		Iplace = iplace;
	}
	public String getSkills() {
		return skills;
	}
	public void setSkills(String skills) {
		this.skills = skills;
	}
	
	
}
