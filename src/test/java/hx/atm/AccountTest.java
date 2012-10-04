package hx.atm;

import static org.junit.Assert.*;

import org.junit.Test;

public class AccountTest {

	@Test
	public void create_a_new_account_balance_should_be_1000() {
		Account account = new Account();
		assertEquals("Expected balance 1000",1000,account.getBalance());
	}

}
