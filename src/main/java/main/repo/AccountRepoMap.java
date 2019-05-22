package main.repo;

import java.util.HashMap;
import java.util.Map;

import javax.inject.Inject;

import main.domain.Account;
import main.util.JSONUtil;

public class AccountRepoMap implements AccountRepo {

	private Map<Integer, Account> accounts = new HashMap<>();

	private int count;

	@Inject
	private JSONUtil json;

	@Override
	public String addAccount(String account) {
		this.accounts.put(this.count++, this.json.fromJSON(account, Account.class));
		return "{\"message\": \"account has been sucessfully added\"}";
	}

	@Override
	public Account getAccount(int id) {
		return this.accounts.get(id);
	}

	@Override
	public String deleteAccount(int id) {
		this.accounts.remove(id);
		return "{\"message\": \"account sucessfully deleted\"}";
	}

	@Override
	public Account updateAccount(int id, Account account) {
		this.accounts.put(id, account);
		return this.accounts.get(id);
	}

	@Override
	public String getAllAccounts() {
		return this.json.toJSON(this.accounts.values());
	}

}
