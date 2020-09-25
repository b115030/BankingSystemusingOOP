package bankingProjDemo;

public class UserDetail extends UserAccountDetail{
//	int basicAmount;
	public UserDetail(int y) {
		// TODO Auto-generated constructor stub
		super(y);
//		this.basicAmount = y;
	}

	private String name;
	private int age;
	private String emailid;
	
	
	public void setName(String newName) {
		this.name = newName;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	
	public String getName() {
		return name;
	}
	
	public String getEmailid() {
		return emailid;
	}
	
	public int getAge() {
		return age;
	}
	

}
