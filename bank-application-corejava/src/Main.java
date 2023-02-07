import java.util.Scanner;

import javax.imageio.plugins.tiff.ExifGPSTagSet;

public class Main {

	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		Account[] accounts = new Account[5];
		accounts[0] = new Account(1, "sarva", 12000, "9515972413", "sarvasaisrinath.9@gmail.com");
		accounts[1] = new Account(1, "srikanth", 14000, "69999999", "puppp9@gmail.com");


		boolean bool = true;
		int i = 0;
		while (bool) {
			displayMainMenu();
			char ch = sc.next().charAt(0);
			switch (ch) {
			case '1': {
				displayCreateMenu();
				char ch2 = sc.next().charAt(0);
				switch (ch2) {
				case '1': {
					System.out.println("Enter the details");
					System.out.println("Enter Id");
					int id = sc.nextInt();
					System.out.println("Enter Name");
					String name = sc.next();
					System.out.println("Enter balance");
					double balance = sc.nextDouble();
					System.out.println("Enter mobile");
					String mobile = sc.next();
					System.out.println("Enter email");
					String email = sc.next();
					accounts[i] = new Account(id, name, balance, mobile, email);
					i += 1;
					System.out.println("Account Created successfully");
					break;
				}
				case '2': {
					break;
				}
				default:
					System.out.println("Enter correct choice");
					break;
				}
				break;
			}
			case '2': {
				displayUpdateMenu();
				char ch2 = sc.next().charAt(0);
				System.out.println("Enter the  accno");
				int accno = sc.nextInt();
				switch (ch2) {
				case '1': {
					System.out.println("Enter the deposite amount");
					double amount = sc.nextDouble();
					double actual = accounts[accno-1].getBalance();
					double newBal = amount + actual;
					accounts[accno-1].setBalance(newBal);
					System.out.println("Balance Updated to " + newBal);
					break;
				}
				case '2': {
					System.out.println("Enter the withdraw  amount");
					double amount = sc.nextDouble();
					double actual = accounts[accno-1].getBalance();
					if (actual >= amount) {
						double newBal = amount - actual;
						accounts[accno-1].setBalance(newBal);
						System.out.println("Balance Updated to " + newBal);
					} else
						System.out.println("Insuffiecient bal");
					break;
				}
				case '3': {
					System.out.println("Enter the target accountNo");
					int taccno = sc.nextInt();
					double actual = accounts[accno-1].getBalance();
					double tactual = accounts[taccno-1].getBalance();
					System.out.println("Enter transfer amount");
					double amount = sc.nextDouble();
					if (actual >= amount) {
						accounts[accno-1].setBalance(actual - amount);
						accounts[taccno-1].setBalance(tactual + amount);
						System.out.println("The amount transfered succesfully");

					} else {
						System.out.println("Insufficient balance");
					}
					break;
				}
				case '4': {
					System.out.println("Enter new mobile");
					String mobile = sc.next();
					accounts[accno-1].setMobile(mobile);

					break;
				}
				case '5': {
					System.out.println("Enter new email");
					String email = sc.next();
					accounts[accno-1].setEmail(email);
					break;
				}
				case '6': {
					break;
				}
				default:
					break;
				}
				break;
			
			}
			case '3': {
				
				displayRetrieveMenu();
				char ch1= sc.next().charAt(0);
				switch (ch1) {
				case '1': {
					System.out.println("Enter the accno");
					int accno = sc.nextInt();

					System.out.println(accounts[accno-1].toString());
					break;
				}
				case '2': {
                    
					break;
				}
				}
			}
			case '4': {
				displayDeleteMenu();
				int accno=sc.nextInt();
				accounts[accno-1]=null;
				System.out.println("Deleted succesfully");
				break;
			}
			case '5': {
				System.out.println("Exited");
				System.exit(0);
				break;
			}
			default:
				System.out.println("Enter correct choice");
				break;
			}
		}
	}


	public static void displayMainMenu() {
		System.out.println("1.create" + "2.update" + "3.retreive" + "4.delete" + "5.exit");
	}

	public static void displayCreateMenu() {
		System.out.println("1.open account" + "2.main menu");

	}

	public static void displayUpdateMenu() {
		System.out.println(
				"1.deposit" + "2.withdraw" + "3.transfer" + "4.mobile change" + "5.email change" + "6.mainmenu");
	}

	public static void displayRetrieveMenu() {
		System.out.println("1.show balance" + "2.main");

	}

	public static void displayDeleteMenu() {
		System.out.println("1.delete");
	}
}
