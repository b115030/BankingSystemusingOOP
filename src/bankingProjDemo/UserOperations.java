package bankingProjDemo;
import java.util.*;

public class UserOperations extends UserDetail implements UserOpr {

	int bAmt;
	UserOperations(int x) {
		super(x);
		this.bAmt = x;
	}
	
	String typOfAcc;
	
	@Override
	public int calculateReward(int deposit_amount, int rate) {
		return deposit_amount * rate; 
	}

	@Override
	public void selectAcc() {
		// TODO Auto-generated method stub
		System.out.println("You can choose type of account from category as follows : ");
		System.out.println("1 > Saving");
		System.out.println("2 > Current");
		System.out.println("3 > Salaried");
		
		Scanner scan = new Scanner(System.in);
//		if(!scan.hasNext() instanceof boolean) {
			switch(scan.nextInt()) {
				case UserOpr.saving: 
					System.out.println("saving account created");
					typOfAcc="saving";
					break;
					
				case UserOpr.current:
					System.out.println("current account created");
					typOfAcc="current";
					break;
					
				case UserOpr.sal:
					System.out.println("salary account created");
					typOfAcc="salary";
					break;
					
				default:
					typOfAcc="No Acc";
					System.out.println("invalid input - no account created!");
			}
//		}
	}

	@Override
	public String typeOfAcc() {
		// TODO Auto-generated method stub
		return typOfAcc;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		UserOperations userOprObj = new UserOperations(1000);
		
		userOprObj.setName("xyz");
		userOprObj.setAge(25);
		userOprObj.setEmailid("abc@xyz.com");
		
		String u_name = userOprObj.getName();
		String e_id = userOprObj.getEmailid();
		int age = userOprObj.getAge();
		
		userOprObj.selectAcc();
		System.out.println("Final Amt : "+userOprObj.calculateReward(100, 2));
		System.out.println(userOprObj.typeOfAcc());
		
		System.out.println("Account contain amt : "+userOprObj.getBasicAmt());
		System.out.println("additional amt deposited : "+userOprObj.additionalAmt(3000));
		
		System.out.println("Rate > "+userOprObj.rateAmt(0));
	}

}
