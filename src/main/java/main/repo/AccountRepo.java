package main.repo;

import main.domain.Account;

public interface AccountRepo {
	public String addAccount(String account);
	
	public Account getAccount(int id);
	
	public String deleteAccount(int id);
	
	public Account updateAccount(int id, Account account);

	public String getAllAccounts();
}
