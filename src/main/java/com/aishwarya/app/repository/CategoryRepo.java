package com.aishwarya.app.repository;

	import org.springframework.data.repository.CrudRepository;
	import org.springframework.stereotype.Repository;

	import com.aishwarya.app.model.Categories;

	@Repository
	public interface CategoryRepo extends CrudRepository<Categories, Integer>{

	}

