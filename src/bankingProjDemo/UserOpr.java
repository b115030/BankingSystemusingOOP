package bankingProjDemo;

public interface UserOpr {
	void selectAcc();
	int calculateReward(int x, int y);
	String typeOfAcc();
	
	static final int saving=1;
	static final int current=2;
	static final int sal=3;
}
