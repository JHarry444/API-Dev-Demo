package main;

import java.util.Map;

import com.google.gson.Gson;

import domain.Account;
import repo.AccountRepo;
import service.AccountService;

public class App {
	public static void main(String[] args) {
		Account account = new Account("Jordan", "Harrison", 0);
		AccountService service = new AccountService();
		service.addAccount(account);
		Gson gson = new Gson();
		String mapToJSON = gson.toJson(AccountRepo.getInstance().getAccounts());
		System.out.println(mapToJSON);
		Map<Integer, Account> accounts = gson.fromJson(mapToJSON, Map.class);
		System.out.println(accounts);
	}
}
