package repo;

import java.util.HashMap;
import java.util.Map;

import domain.Account;

public class AccountRepo {

	private Map<Integer, Account> accounts = new HashMap<>();

	public Map<Integer, Account> getAccounts() {
		return accounts;
	}
	
	private AccountRepo() {
		
	}
	
	private static AccountRepo repo = new AccountRepo();
	
	public static AccountRepo getInstance() {
		return repo; 
	}

}
