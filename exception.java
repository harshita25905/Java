package exception;

class InsufficientFundsException extends Exception{
	public InsufficientFundsException(String args) {
		super(msg);
	}
}

class InvalidAmountException extends RuntimeException
{
	public InvalidAmountException(String msg) {
		super(msg);
	}
}public class main {
	private String acc_name;
	private double bal;
	public main(String name,double openbal)throws InvalidAmountException{
		if(openbal<0) {
			throw new InvalidAmountException("Opening ball cant be negative");
		}
		this.acc_name=name;
		this.bal=openbal;
	}
public void withdraw(double amt,int pin)throws InsufficientFundsException
{
	if(amt<=0) {
		throw new InsufficientFundsException("Withdraw must be positive");
	}
	if(amt>bal) {
		throw new InsufficientFundsException("InsufficientFundsException funds"+(amt-bal));
	}
	bal=bal-amt;
	System.out.println("Withdraw amt"+amt+"Remaining bal ")
}
public void deposit (double amt) throws InvalidAmountException{
	if (amt<=0)
{
		throw new InvalidAmountException("Deposit must be positive");
		}
	bal=bal+amt;
}
public double getbal() {
	return bal;
}
public static void main(String[] args) {
	Main rahul=new Main("Rahul",1000.45)
}
}
