package com.tulasi.bankingapp1.mapper;

import com.tulasi.bankingapp1.dto.AccountDto;
import com.tulasi.bankingapp1.entity.Account;

public class AccountMapper {
	
	public static Account mapToAccount(AccountDto accountDto) {
		
		Account account=new Account(
				
				accountDto.getId(),
				accountDto.getAccountHolderName(),
				accountDto.getBalance()
				);
		return account;
		
	}
	
	public static AccountDto mapToAccountDto(Account account) {
		
		AccountDto accountDto=new AccountDto(
				
				account.getId(),
				account.getAccountHolderName(),
				account.getBalance()
				
				
				);
		
		return accountDto;
		
	}

}
