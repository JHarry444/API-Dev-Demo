package main.repo;

import java.util.HashMap;
import java.util.Map;

import main.domain.Account;

public class AccountRepoMap {

	private Map<Integer, Account> accounts = new HashMap<>();

	public Map<Integer, Account> getAccounts() {
		return accounts;
	}
	private AccountRepoMap() {
		
	}
	
	private static AccountRepoMap repo = new AccountRepoMap();
	
	public static AccountRepoMap getInstance() {
		return repo; 
	}

}
