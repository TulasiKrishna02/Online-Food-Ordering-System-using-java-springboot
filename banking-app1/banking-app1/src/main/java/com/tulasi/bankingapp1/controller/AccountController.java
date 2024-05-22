package com.tulasi.bankingapp1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tulasi.bankingapp1.dto.AccountDto;
import com.tulasi.bankingapp1.service.AccountService;
@RestController
@RequestMapping("/api/accounts")
public class AccountController {
	@Autowired
	private AccountService accountService;
	
	@PostMapping
	public ResponseEntity<AccountDto> addAccount(@RequestBody  AccountDto accountDto){
		
		return new ResponseEntity<>(accountService.createAccount(accountDto),HttpStatus.CREATED);
	}
	
	
	
	
	

}
