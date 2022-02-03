package com.aishwarya.app.repository;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.aishwarya.app.model.*;

@Repository("userRepository")
public interface UserRepo extends CrudRepository<User, String> {
	User findByEmailIdIgnoreCase(String emailId);
	@Query("select userid from User")
	public long[] ids();
}
