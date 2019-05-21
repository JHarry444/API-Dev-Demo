package repo;

import java.util.HashMap;
import java.util.Map;

import domain.Account;

public class AccountRepo {

	private Map<Integer, Account> accounts = new HashMap<>();

	public Map<Integer, Account> getAccounts() {
		return accounts;
	}

}
