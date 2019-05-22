package main.service;

import javax.inject.Inject;

import main.domain.Account;
import main.repo.AccountRepo;
import main.repo.AccountRepoMap;
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

	public void setJson(JSONUtil json) {
		this.json = json;
	}

	public void setRepo(AccountRepo repo) {
		this.repo = repo;
	}

	public String getAccount(int number) {
		return this.json.toJSON(this.repo.getAccount(number));
	}

}
