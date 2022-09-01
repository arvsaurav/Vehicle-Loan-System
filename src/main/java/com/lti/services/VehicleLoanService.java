package com.lti.services;

import java.util.List;
import java.util.Optional;

import com.lti.entity.Address;
import com.lti.entity.Applicant;
import com.lti.entity.Loan;
import com.lti.entity.User;
import com.lti.entity.Vehicle;

public interface VehicleLoanService {
	
	public User registerUser(User user);
	
	public List<User> viewAllUser();
	
	public Optional<User> getUserById(int id);
	
	public User updateUser(int id, User user);
	
	public Applicant registerApplicant(Applicant applicant);
	
	public List<Applicant> viewAllApplicant();

	public Optional<Applicant> getApplicantById(int id);
	
	public Applicant updateApplicant(int applicantId, Applicant applicant);

	public Applicant deleteApplicant(int applicantId);	
	
	public Address addApplicantAddress(Address applicantAddress);

	public Address updateApplicantAddress(int addressId, Address address);

	public Optional<Address> getAddressById(int id);

	public Loan addLoanDetails(Loan loanDetails);

	public List<Loan> viewAllLoans();
	
	public Loan updateLoanDetails(int loanId, Loan loan);

	public Optional<Loan> getLoanById(int loanId);

	public Vehicle addVehicleDetails(Vehicle vehicleDetails);

	public List<Vehicle> viewAllVehicles();
	
	public Vehicle updateVehicleDetails(int vehicleId, Vehicle vehicle);

	public Optional<Vehicle> getVehicleById(int vehicleId);

	public Loan deleteLoan(int loanId);

	public Vehicle deleteVehicle(int vehicleId);

	public List<Address> viewAllAddress();

	public Address deleteAddress(int addressId);

	public List<Applicant> getApplicantByUserId(int userId);

	public List<Address> getAddressByUserId(int userId);

	public List<Loan> getLoanByUserId(int userId);

	public List<Vehicle> getVehicleByUserId(int userId);

}
