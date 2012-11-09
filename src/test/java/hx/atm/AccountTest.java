package hx.atm;

import static org.junit.Assert.*;

import org.junit.Test;

public class AccountTest {

	@Test
	public void create_a_new_account_balance_should_be_1000() {
		Account account = new Account();
		assertEquals("Expected balance 1000",1000,account.getBalance());
	}
	
	
	@Test
	public void deposit_1000_should_return_current_balance_plus_1000() {
		Account account = new Account();
		account.deposit(1000);
		assertEquals("Expected balance 2000",2000,account.getBalance());
	}
	
	
	
	@Test
	public void extract_1000_should_return_1000() {
		Account account = new Account();
		account.extract(1000);
		assertEquals("Expected balance 0",0,account.getBalance());
	}

}
