package com.lti.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lti.entity.Loan;

@Repository
public interface LoanRepository extends JpaRepository<Loan, Integer> {

}
