package in.shivu.service;

import java.util.List;

import in.shivu.entity.AccountDto;

public interface AccountService {
	
	AccountDto createAccount(AccountDto account);
	
	AccountDto getAccountById(Long id);
	
	AccountDto deposite(Long id, double amount);
	
	AccountDto withdraw(Long id,double  amount);
	
	List<AccountDto> getAllAccounts();
	
	void deleteAccount(Long id);

}
