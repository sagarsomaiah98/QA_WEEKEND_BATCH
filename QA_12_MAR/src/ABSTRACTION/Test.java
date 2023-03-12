package ABSTRACTION;

public class Test extends Abstract_Example{

	public static void main(String[] args) {
		Test t = new Test();
		t.loan();
		t.creditcard();
		t.kyc();
		t.savings();

	}

	@Override
	public void loan() {
		System.out.println("loan interest rate is 4");
		
	}

	@Override
	public void creditcard() {
		System.out.println("annual charges is 100$");
		
	}

	@Override
	public void kyc() {
		System.out.println("SSN");
		
	}

}
