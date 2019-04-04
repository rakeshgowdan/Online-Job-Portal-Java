package com.niit.JobBean;

public class TotalApplication {

	private String CompanyName;
	private String JobPost;
	private String Email;
	private String FullName;
	private String MobileNo;
	private String Skills;
	private String Applied;
	private String Approved;
	private String Id;
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public String getApplied() {
		return Applied;
	}
	@Override
	public String toString() {
		return "TotalApplication [CompanyName=" + CompanyName + ", JobPost=" + JobPost + ", Email=" + Email
				+ ", FullName=" + FullName + ", MobileNo=" + MobileNo + ", Skills=" + Skills + ", Applied=" + Applied
				+ ", Approved=" + Approved + "]";
	}
	public void setApplied(String applied) {
		Applied = applied;
	}
	public String getApproved() {
		return Approved;
	}
	public void setApproved(String approved) {
		Approved = approved;
	}
	public String getCompanyName() {
		return CompanyName;
	}
	public void setCompanyName(String companyName) {
		CompanyName = companyName;
	}
	public String getJobPost() {
		return JobPost;
	}
	public void setJobPost(String jobPost) {
		JobPost = jobPost;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getFullName() {
		return FullName;
	}
	public void setFullName(String fullName) {
		FullName = fullName;
	}
	public String getMobileNo() {
		return MobileNo;
	}
	public void setMobileNo(String mobileNo) {
		MobileNo = mobileNo;
	}
	public String getSkills() {
		return Skills;
	}
	public void setSkills(String skills) {
		Skills = skills;
	}
}
