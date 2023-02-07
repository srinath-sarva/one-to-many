
public class Account {
	private int accno;
	private String name;
	private double balance;
	private String mobile;
	private String email;
	public int getAccno() {
		return accno;
	}
	public void setAccno(int accno) {
		this.accno = accno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Account(int accno, String name, double balance, String mobile, String email) {
		super();
		this.accno = accno;
		this.name = name;
		this.balance = balance;
		this.mobile = mobile;
		this.email = email;
	}
	@Override
	public String toString() {
		return "Account [accno=" + accno + ", name=" + name + ", balance=" + balance + ", mobile=" + mobile + ", email="
				+ email + "]";
	}
	

}
