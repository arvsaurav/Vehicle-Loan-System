package com.lti.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lti.entity.Address;
import com.lti.entity.Applicant;
import com.lti.entity.Loan;
import com.lti.entity.User;
import com.lti.entity.Vehicle;
import com.lti.services.VehicleLoanService;

@CrossOrigin(origins = "http://localhost:4200/")
@RestController
public class VehicleLoanController {

	@Autowired
	private VehicleLoanService vService;
	
	@PostMapping("/adduser")
	public User registerUser(@RequestBody User user) {
		return vService.registerUser(user);
	}
	
	@GetMapping("/user/{id}") 
	public Optional<User> getUserById(@PathVariable int id) {
		return vService.getUserById(id);
	}
	
	@GetMapping("/users")
	public List<User> viewAllUser() {
		return vService.viewAllUser();
	}
	
	@PutMapping("/user/{userId}")
	public User updateUser(@PathVariable("userId") int userId,
			@RequestBody User modifiedUser) {
		User updateUser = vService.updateUser(userId, modifiedUser);
		return updateUser;
	}
	
	@GetMapping("/applicant/{id}") 
	public Optional<Applicant> getApplicantById(@PathVariable int id) {
		return vService.getApplicantById(id);
	}
	
	@PostMapping("/addapplicant")
	public Applicant registerApplicant(@RequestBody Applicant applicant) {
		return vService.registerApplicant(applicant);
	}
	
	@PutMapping("/applicant/{applicantId}")
	public Applicant updateApplicant(@PathVariable("applicantId") int applicantId, 
			@RequestBody Applicant modifiedApplicant) {
		Applicant updateApplicant = vService.updateApplicant(applicantId,  modifiedApplicant);
		return updateApplicant;
	}
	
	@DeleteMapping("/applicant/{applicantId}")
	public Applicant deleteApplicant(@PathVariable("applicantId") int applicantId) {
		Applicant deletedApplicant = vService.deleteApplicant(applicantId);
		return deletedApplicant;
	}
	
	@GetMapping("/applicants")
	public List<Applicant> viewAllApplicant() {
		return vService.viewAllApplicant();
	}
	
	@PostMapping("/addaddress")
	public Address addApplicantAddress(@RequestBody Address applicantAddress) {
		return vService.addApplicantAddress(applicantAddress);
	}
	
	@PutMapping("/address/{addressId}")
	public Address updateApplicantAddress(@PathVariable("addressId") int addressId, 
			@RequestBody Address modifiedAddress) {
		Address updateAddress = vService.updateApplicantAddress(addressId,  modifiedAddress);
		return updateAddress;
	}
	
	@GetMapping("/address/{addressId}") 
	public Optional<Address> getAddressById(@PathVariable int addressId) {
		return vService.getAddressById(addressId);
	}
	
	@GetMapping("/addresses")
	public List<Address> viewAllAddress() {
		return vService.viewAllAddress();
	}
	
	@DeleteMapping("/address/{addressId}")
	public Address deleteAddress(@PathVariable("addressId") int addressId) {
		Address deletedAddress = vService.deleteAddress(addressId);
		return deletedAddress;
	}
	
	@PostMapping("/addloan")
	public Loan addLoanDetails(@RequestBody Loan loan) {
		return vService.addLoanDetails(loan);
	}
	
	@GetMapping("/loans")
	public List<Loan> viewAllLoans() {
		return vService.viewAllLoans();
	}
	
	@PutMapping("/loan/{loanId}")
	public Loan updateLoanDetails(@PathVariable("loanId") int loanId, 
			@RequestBody Loan modifiedLoan) {
		Loan updateLoan = vService.updateLoanDetails(loanId,  modifiedLoan);
		return updateLoan;
	}
	
	@GetMapping("/loan/{loanId}") 
	public Optional<Loan> getLoanById(@PathVariable int loanId) {
		return vService.getLoanById(loanId);
	}
	
	@DeleteMapping("/loan/{loanId}")
	public Loan deleteLoan(@PathVariable("loanId") int loanId) {
		Loan deletedLoan = vService.deleteLoan(loanId);
		return deletedLoan;
	}
	
	@PostMapping("/addvehicle")
	public Vehicle addVehicleDetails(@RequestBody Vehicle vehicle) {
		return vService.addVehicleDetails(vehicle);
	}
	
	@GetMapping("/vehicles")
	public List<Vehicle> viewAllVehicles() {
		return vService.viewAllVehicles();
	}
	
	@PutMapping("/vehicle/{vehicleId}")
	public Vehicle updateVehicleDetails(@PathVariable("vehicleId") int vehicleId, 
			@RequestBody Vehicle modifiedVehicle) {
		Vehicle updateVehicle = vService.updateVehicleDetails(vehicleId,  modifiedVehicle);
		return updateVehicle;
	}
	
	@GetMapping("/vehicle/{vehicleId}") 
	public Optional<Vehicle> getVehicleById(@PathVariable int vehicleId) {
		return vService.getVehicleById(vehicleId);
	}
	
	@DeleteMapping("/vehicle/{vehicleId}")
	public Vehicle deleteVehicle(@PathVariable("vehicleId") int vehicleId) {
		Vehicle deletedVehicle = vService.deleteVehicle(vehicleId);
		return deletedVehicle;
	}
	
}
