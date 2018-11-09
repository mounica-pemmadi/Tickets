package com.madal;

public class TicketDetails {
	@Override
	public String toString() {
		return "TicketDetails [id=" + id + ", email=" + email + ", problem_Type=" + problem_Type
				+ ", problem_Description=" + problem_Description + ", group=" + group + "]";
	}
	private int id;
	private String email;
	private String problem_Type;
	private String problem_Description;
	private String group;
	public String getGroup() {
		return group;
	}
	public void setGroup(String group) {
		this.group = group;
	}
	public String getProblem_Type() {
		return problem_Type;
	}
	public void setProblem_Type(String problem_Type) {
		this.problem_Type = problem_Type;
	}

	public String getProblem_Description() {
		return problem_Description;
	}
	public void setProblem_Description(String problem_Description) {
		this.problem_Description = problem_Description;
	}

	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	

}
