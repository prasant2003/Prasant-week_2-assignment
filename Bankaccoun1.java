package Assignment2;

public class Bankaccoun1 {
		String AccountHoldername;
		double bal;
		public Bankaccoun1(String AccountHoldername,double bal) {
			this.AccountHoldername=AccountHoldername;
			this.bal=bal;
		}
		public void deposite(double amount) {
			if(amount>0) {
				bal+=amount;
				System.out.println("deposited "+amount+" sucessfully .New bal is "+bal);
			}
			else {
				System.out.println("Enter valid amount");
			}
		}
		public void withdraw(double amount) {
			if(amount>bal) {
				System.out.println("Insuuficient balance");
			}
			else if(amount<0){
				System.out.println("Withdraw amount must be positive");
			}
			else {
				bal-=amount;
				System.out.println("Amount withdraw sucessfully.Total bal:"+bal);
			}
		}
		public void display() {
			System.out.println("Account holder:"+AccountHoldername);
			System.out.println("Total bal:"+bal);
		}

		public static void main(String[] args) {
			Bankaccoun1 b1=new Bankaccoun1("Prasant Ku Panda", 15000.369);
			b1.display();
			b1.deposite(10000.33);
			b1.withdraw(8000.21);
			b1.display();

		}

	}

