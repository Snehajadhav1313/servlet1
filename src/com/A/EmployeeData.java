package com.A;

public class EmployeeData {
	int id;
	private String fname;
	private String lname;
	private String phN;
	private String gender;
	private String pincode;
	private String add;
	private String pass;
	private String usname;

	public EmployeeData() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EmployeeData(int id, String fname, String lname, String phN, String gender, String pincode, String add,
			String pass, String usname) {
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.phN = phN;
		this.gender = gender;
		this.pincode = pincode;
		this.add = add;
		this.pass = pass;
		this.usname = usname;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getPhN() {
		return phN;
	}

	public void setPhN(String phN) {
		this.phN = phN;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getAdd() {
		return add;
	}

	public void setAdd(String add) {
		this.add = add;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getUsname() {
		return usname;
	}

	public void setUsname(String usname) {
		this.usname = usname;
	}

	
}
