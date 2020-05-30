package novice.assignments2.bankaccount;

public class TestAccount {

	public static void main(String[] args) {
		Account acc1 = new Account(1001);
		System.out.println("Before -->\t" + acc1);
		acc1.credit(1500);
		acc1.debit(1000);
		System.out.println("After  -->\t" + acc1);
		System.out.println();
	
		Account acc2 = new Account(1002, 5000);
		System.out.println(acc2);
		acc2.debit(6000);		
		
	}

}
