package in.shivu.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.shivu.entity.Account;
import in.shivu.entity.AccountDto;
import in.shivu.entity.AccountMapper;
import in.shivu.repository.AccountRepository;
import in.shivu.service.AccountService;

@Service
public class AccountServiceImpl implements AccountService{
	
	private AccountRepository accountRepository;
	
	@Autowired
	public AccountServiceImpl(AccountRepository accountRepository) {
		super();
		this.accountRepository = accountRepository;
	}

	@Override
	public AccountDto createAccount(AccountDto accountDto) {
		// TODO Auto-generated method stub
		Account account = AccountMapper.mapToAccount(accountDto);
		Account savedAccount = accountRepository.save(account);
		return AccountMapper.mapToAccountDto(savedAccount);
	}

	@Override
	public AccountDto getAccountById(Long id) {
		
		Account account = accountRepository.
				findById(id).
				orElseThrow(() -> new RuntimeException("account does not exist"));
		
		// TODO Auto-generated method stub
		return AccountMapper.mapToAccountDto(account);
	}

	@Override
	public AccountDto deposite(Long id, double amount) {
		// TODO Auto-generated method stub
		Account account = accountRepository.
				findById(id).
				orElseThrow(() -> new RuntimeException("account does not exist"));
		
		double total = account.getBalance()+ amount;
		account.setBalance(total);
		Account savedAccount = accountRepository.save(account);
		return AccountMapper.mapToAccountDto(savedAccount);
		
	
	}

	@Override
	public AccountDto withdraw(Long id, double amount) {
		// TODO Auto-generated method stub
		Account account = accountRepository.
				findById(id).
				orElseThrow(() -> new RuntimeException("account does not exist"));
		
		if(account.getBalance() < amount) {
			throw new RuntimeException("Insufficient balance ");
		}
		
		double total = account.getBalance() - amount;
		account.setBalance(total);
		Account savedAccount = accountRepository.save(account);
		
		return AccountMapper.mapToAccountDto(savedAccount);
	}

	@Override
	public List<AccountDto> getAllAccounts() {
		List<Account> accounts = accountRepository.findAll();
		return accounts.stream().map((account)-> AccountMapper.mapToAccountDto(account)).
		collect(Collectors.toList());
		
		// TODO Auto-generated method stub
	
	}

	@Override
	public void deleteAccount(Long id) {
		// TODO Auto-generated method stub
		Account account = accountRepository.
				findById(id).
				orElseThrow(() -> new RuntimeException("account does not exist"));
		
		accountRepository.deleteById(id);
		
		
	}

}
