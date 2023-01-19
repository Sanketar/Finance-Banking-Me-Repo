package com.project.staragile.banking;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;


public interface AccountRepository extends JpaRepository<Account,Integer>{

	Optional<Account> findById(int policyId);
	
}
