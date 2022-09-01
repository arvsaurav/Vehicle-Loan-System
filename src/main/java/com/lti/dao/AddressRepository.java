package com.lti.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lti.entity.Address;
import com.lti.entity.Applicant;

@Repository
public interface AddressRepository extends JpaRepository<Address, Integer> {
	
	public List<Address> findByUserId(int userId);

}
