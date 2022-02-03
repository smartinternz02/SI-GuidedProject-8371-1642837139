package com.aishwarya.app.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.aishwarya.app.model.Balance;

@Repository
public interface BalanceRepo extends CrudRepository<Balance, Integer>{
	@Query(value="select sum(bal) from balance where ballog=:logger",nativeQuery=true)
	public int Balsum(Long logger);
}