package com.tulasi.bankingapp1.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tulasi.bankingapp1.dto.AccountDto;
import com.tulasi.bankingapp1.entity.Account;
import com.tulasi.bankingapp1.mapper.AccountMapper;
import com.tulasi.bankingapp1.repository.AccountRepository;
import com.tulasi.bankingapp1.service.AccountService;
@Service
public class AccountServiceImpl implements AccountService{
	@Autowired
	private AccountRepository accountRepository;

	@Override
	public AccountDto createAccount(AccountDto accountDto) {

     Account account = AccountMapper.mapToAccount(accountDto);
     Account savedAccount=accountRepository.save(account);
		
		
		return AccountMapper.mapToAccountDto(savedAccount);
	}

}
