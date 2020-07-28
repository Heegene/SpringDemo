package kr.or.connect.mvcexam.dto;

public class User {
	private String name;
	private String email;
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		// toString 오버라이딩하면 안에 들어있는 정보들을 볼 때 편함 하나씩 꺼내지 않아도됨 
		return "User [getName()=" + getName() + ", getEmail()=" + getEmail() + ", getAge()=" + getAge() + "]";
	}
	
	

}
