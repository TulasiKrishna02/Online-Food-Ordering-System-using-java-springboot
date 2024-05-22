package com.tulasi.bankingapp1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tulasi.bankingapp1.entity.Account;

public interface AccountRepository extends JpaRepository<Account, Long>{
	
}
