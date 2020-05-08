package com.example.hackerearth.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.hackerearth.entity.Provider;

@Repository
public interface ProviderRepository extends  JpaRepository <Provider, Long>  {

	Provider findByName(@Param("name") String name);
	
	List<Provider> findByNameIs(String name);
	List<Provider> findByNameEquals(String name);
	List<Provider> findByNameStartingWith(String prefix);
	//List<Provider> findByLowest_price(Integer lowest_price );
	List<Provider> findByRating(Float rating);



}






