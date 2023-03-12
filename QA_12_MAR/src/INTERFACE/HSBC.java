package INTERFACE;

public class HSBC implements CentralBank {

	public static void main(String[] args) {
		HSBC h = new HSBC();
		h.savings();
		h.loan();
		h.creditcard();
		

	}

	@Override
	public void savings() {
		System.out.println("HSBC savings account min is 25000$");
		
	}

	@Override
	public void loan() {
		System.out.println("HSBC loan is 4.0%");
		
	}

	@Override
	public void creditcard() {
		System.out.println("HSBC annual charges is 100$");
		
	}

	
	@Override
	public void kyc() {
		// TODO Auto-generated method stub
		
	}


}
