package bankingProjDemo;

public class UserAccountDetail {
	int basicAmt;

	public UserAccountDetail(int x) {
		this.basicAmt=x;
	}
	
	public int getBasicAmt() {
		return basicAmt;
	}
	
	public int additionalAmt(int totalAmt) {
		return totalAmt-basicAmt;
	}
	
	public void showC() {
		System.out.println("--class UsreAccountDetail");
	}
	
	public int rateAmt(int r) {
		int res=0;
		try {
			res = this.basicAmt/r;
		}
		catch(Exception e) {
			System.out.println("exception generated , try later !"+e);
		}
		finally {			
			return res;
		}
	}

}
