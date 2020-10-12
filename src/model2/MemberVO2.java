package model2;

public class MemberVO2 {
	String name,id,password,address;

	public MemberVO2(String name, String id, String password, String address) {
		super();
		this.name = name;
		this.id = id;
		this.password = password;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
