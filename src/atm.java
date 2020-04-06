import java.util.Scanner;
@SuppressWarnings("unused")
public class atm {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int balance = 100;
		
		System.out.println ("Welcome to ATM. Would you like to deposit, withdrawl, or check account balance?");
		String bankOptions = scanner.nextLine();
		
		switch (bankOptions) {
			case "deposit":
				System.out.println ("Enter the amount you would like to deposit.");
				String depositAmountString = scanner.nextLine();
				int depositAmount = Integer.parseInt(depositAmountString);
				balance = balance + depositAmount;
				System.out.println ("Your new balance is " +balance);
				break;
				
			case "withdrawl":
				System.out.println ("Enter the amount you would like to withdrawl.");
				String withdrawlAmountString = scanner.nextLine();
				int withdrawlAmount = Integer.parseInt(withdrawlAmountString);
					if (balance >= withdrawlAmount) {
						balance = balance - withdrawlAmount;
						System.out.println ("Your new balance is " +balance);
					}
					else {
						System.out.println ("insufficient balance");
					}		
			break;
			
			case "check account balance":
				System.out.println ("Your balance is " +balance);
			break;
		
		}
	}

}
