package service;

import domain.Account;
import repo.AccountRepo;

public class AccountService {
	
	private AccountRepo repo = AccountRepo.getInstance();
	private int count;
	
	public Account addAccount(Account account) {
		account.setAccountNumber(count++);
		return this.repo.getAccounts().put(count, account);
	}
	
	public Account getAccount(int number) {
		return this.repo.getAccounts().get(number);
	}

}
