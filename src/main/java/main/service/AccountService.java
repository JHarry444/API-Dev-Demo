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
	
	public String addAccount(String accountJSON) {
		return this.repo.addAccount(accountJSON);
	}
	
	public String deleteAccount(int id) {
		return this.repo.deleteAccount(id);
	}

	public String getAccount(int number) {
		return this.json.toJSON(this.repo.getAccount(number));
	}

	public String getAllAccounts() {
		return this.repo.getAllAccounts();
	}

	public void setJson(JSONUtil json) {
		this.json = json;
	}

	public void setRepo(AccountRepo repo) {
		this.repo = repo;
	}

	public String updateAccount(int id, String account) {
		return this.repo.updateAccount(id, this.json.fromJSON(account, Account.class));
	}

}
