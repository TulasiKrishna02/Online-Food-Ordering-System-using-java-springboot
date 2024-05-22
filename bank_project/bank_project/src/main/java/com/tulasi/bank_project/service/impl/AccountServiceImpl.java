package com.tulasi.bank_project.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tulasi.bank_project.dto.AccountDto;
import com.tulasi.bank_project.entity.Account;
import com.tulasi.bank_project.mapper.AccountMapper;
import com.tulasi.bank_project.repository.AccountRepository;
import com.tulasi.bank_project.service.AccountService;

@Service
public class AccountServiceImpl implements AccountService{
	@Autowired
	private AccountRepository accountRepository;
	
	public AccountServiceImpl(AccountRepository accountRepository) {
		super();
		this.accountRepository = accountRepository;
	}

	@Override
	public AccountDto createAccount(AccountDto accountDto) {
		Account account=AccountMapper.mapToAccount(accountDto);
		Account savedaccount=accountRepository.save(account);
		
		return AccountMapper.mapToAccountDto(savedaccount);
		
	}

}
