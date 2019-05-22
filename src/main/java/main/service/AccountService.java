package main.service;

import javax.inject.Inject;

import main.domain.Account;
import main.repo.AccountRepo;
import main.util.JSONUtil;

public class AccountService {

	@Inject
	JSONUtil json;

	@Inject
	AccountRepo repo;

	public AccountService() {
	}

	private int count;

	public String addAccount(String accountJSON) {
		Account account = this.json.fromJSON(accountJSON, Account.class);
		account.setAccountNumber(count++);
		return this.json.toJSON(this.repo.getAccounts().put(count, account));
	}

	public void setJson(JSONUtil json) {
		this.json = json;
	}

	public void setRepo(AccountRepo repo) {
		this.repo = repo;
	}

	public String getAccount(int number) {
		return this.json.toJSON(this.repo.getAccounts().get(number));
	}

}