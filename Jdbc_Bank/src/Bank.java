
public class Bank {

	private int accno;
	private String cname;
	private double balance;
	private String username;
	private String passcode;
	public int getAccno() {
		return accno;
	}
	public void setAccno(int accno) {
		this.accno = accno;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPasscode() {
		return passcode;
	}
	public void setPasscode(String passcode) {
		this.passcode = passcode;
	}
	public Bank(int accno, String cname, double balance, String username, String passcode) {
		super();
		this.accno = accno;
		this.cname = cname;
		this.balance = balance;
		this.username = username;
		this.passcode = passcode;
	}
	
	}
