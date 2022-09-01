package com.lti.vehicleloansystem;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.lti.dao.AddressRepository;
import com.lti.dao.ApplicantRepository;
import com.lti.dao.LoanRepository;
import com.lti.dao.UserRepository;
import com.lti.dao.VehicleRepository;
import com.lti.entity.Address;
import com.lti.entity.Applicant;
import com.lti.entity.Loan;
import com.lti.entity.User;
import com.lti.entity.Vehicle;
import com.lti.services.VehicleLoanService;

@SpringBootTest
class VehicleLoanSystemAppTests {

	@Autowired
	private UserRepository userRepo;
	
	@Autowired
	private ApplicantRepository applicantRepo;
	
	@Autowired
	private VehicleRepository vehicleRepo;
	
	@Autowired
	private LoanRepository loanRepo;
	
	@Autowired
	private AddressRepository addressRepo;
	
	@Autowired
	private VehicleLoanService vService;
	
	private Collection<Vehicle> vehicle_List = new ArrayList<Vehicle>();
	
	private Collection<Loan> loan_List = new ArrayList<Loan>();
	
	@Test
	public void testRegisterUserService() {
		
		User user = new User();
		user.setUserId(102);
		user.setPassword("wordpass");
		Assertions.assertTrue(vService.registerUser(user) instanceof User);
		
	}
	
	@Test
	void testAddUser() {
		
		User user = new User();
		user.setUserId(103);
		user.setPassword("zaq1xsw2");
		userRepo.save(user);
		Assertions.assertNotNull(userRepo.findById(103).get());
		
	}

	@Test
	public void testReadAllUser() {
		List<User> user_List = userRepo.findAll();
		Assertions.assertTrue(user_List.size() > 0);
	}
	
	@Test
	public void testSingleUser() {
		User user = userRepo.findById(101).get();
		Assertions.assertEquals("welcome123", user.getPassword());
	}
	
	@Test
	public void testUpdateUser() {
		User user = userRepo.findById(101).get();
		user.setPassword("iamgdz");
		userRepo.save(user);
		assertNotEquals("welcome123", userRepo.findById(101).get().getPassword());
	}
	

	@Test
	void testRegisterApplicantService() {
		
		Applicant applicant = new Applicant();
		
		applicant.setUserId(102);
		applicant.setName("Gaurav");
		applicant.setAge(21);
		applicant.setGender("male");
		applicant.setEmployment("yes");
		applicant.setExistingEmi(1000);
		applicant.setSalary(100000);
		applicant.setPhoneNo(987867548);
		applicant.setEmailId("gaurav@gmail.com");
		applicant.setAadharNo(123456789);
		applicant.setPanNo("ijbh1234y");
		
		Assertions.assertTrue(vService.registerApplicant(applicant) instanceof Applicant);
		
	}

	@Test
	void testAddApplicant() {
		
		Applicant applicant = new Applicant();
		
		applicant.setUserId(102);	
		applicant.setName("Gaurav");
		applicant.setAge(21);
		applicant.setGender("male");
		applicant.setEmployment("yes");
		applicant.setExistingEmi(1000);
		applicant.setSalary(100000);
		applicant.setPhoneNo(987867548);
		applicant.setEmailId("gaurav@gmail.com");
		applicant.setAadharNo(123456789);
		applicant.setPanNo("ijbh1234y");
		
		applicantRepo.save(applicant);
		Assertions.assertNotNull(applicantRepo.findByUserId(102));
		
	}
	
	@Test
	public void testReadAllApplicant() {
		List<Applicant> applicant_List = applicantRepo.findAll();
		Assertions.assertTrue(applicant_List.size() > 0);
	}
	
	@Test
	public void testSingleApplicant() {
		Assertions.assertNotNull(applicantRepo.findById(1).get());
	}

	@Test
	void testAddVehicleDetailsService() {
		
		Vehicle vehicle = new Vehicle();
		
		vehicle.setUserId(102);
		vehicle.setManufacturer("Royal Enfield");
		vehicle.setVehicleType("Cruiser");
		vehicle.setModel("Hunter 350");
		vehicle.setExShowroomPrice(166000);
		vehicle.setOnRoadPrice(164000);
		
		Assertions.assertTrue(vService.addVehicleDetails(vehicle) instanceof Vehicle);
		
	}
	
	@Test
	void testAddVehicleDetails() {
		
		Vehicle vehicle = new Vehicle();
		
		vehicle.setUserId(102);
		vehicle.setManufacturer("Royal Enfield");
		vehicle.setVehicleType("Cruiser");
		vehicle.setModel("Meteor");
		vehicle.setExShowroomPrice(101000);
		vehicle.setOnRoadPrice(100000);
		
		vehicleRepo.save(vehicle);
		Assertions.assertNotNull(vehicleRepo.findByUserId(102));
		
	}
	
	@Test
	public void testReadAllVehicles() {
		List<Vehicle> vehicle_List = vehicleRepo.findAll();
		Assertions.assertTrue(vehicle_List.size() > 0);
	}
	
	@Test
	void testAddLoanDetailsService() {
		
		Loan loan = new Loan();
		
		loan.setUserId(102);
		loan.setAccountType("current");
		loan.setAmount(8000);
		loan.setLoanTenure(3);
		loan.setRateOfInterest(5);
		loan.setEmi(8000);
		loan.setLoanStatus("pending");
		
		Assertions.assertTrue(vService.addLoanDetails(loan) instanceof Loan);
		
	}
	
	@Test
	void testAddLoanDetails() {
		
		Loan loan = new Loan();
		
		loan.setUserId(102);
		loan.setAccountType("current");
		loan.setAmount(7000);
		loan.setLoanTenure(2);
		loan.setRateOfInterest(5);
		loan.setEmi(7000);
		loan.setLoanStatus("pending");
		

		loanRepo.save(loan);
		Assertions.assertNotNull(loanRepo.findByUserId(102));
		
	}
	
	@Test
	public void testReadAllLoan() {
		List<Loan> loan_List = loanRepo.findAll();
		Assertions.assertTrue(loan_List.size() > 0);
	}
	
	@Test()
	void testAddAddressDetailsService() {
		
		Address address = new Address();
		
		address.setUserId(102);
		address.setState("Maharashtra");
		address.setCity("Pune");
		address.setArea("Pimple Saudagar");
		address.setHouseNo("E-4");
		address.setPinCode(411027);
		
		Assertions.assertTrue(vService.addApplicantAddress(address) instanceof Address);
		
	}
	
	@Test()
	void testAddAddressDetails() {
		
		Address address = new Address();
		
		address.setUserId(102);
		address.setState("Maharashtra");
		address.setCity("Pune");
		address.setArea("Pimpri-Chinchwad");
		address.setHouseNo("E-4");
		address.setPinCode(411027);
		
		addressRepo.save(address);
		Assertions.assertNotNull(addressRepo.findByUserId(102));
		
	}

	@Test
	public void testReadAllAddress() {
		List<Address> address_List = addressRepo.findAll();
		Assertions.assertTrue(address_List.size() > 0);
	}
	
	@Test
	public void testViewUserService() {
		
		Assertions.assertTrue(!vService.viewAllUser().isEmpty() && 
				              vService.viewAllUser() instanceof List &&
				              vService.viewAllUser().get(0) instanceof User);
         
	}
	
	@Test
	public void testViewApplicantService() {
		
		Assertions.assertTrue(!vService.viewAllApplicant().isEmpty() && 
				              vService.viewAllApplicant() instanceof List &&
				              vService.viewAllApplicant().get(0) instanceof Applicant);
         
	}
	
	@Test
	public void testViewLoanService() {
		
		Assertions.assertTrue(!vService.viewAllLoans().isEmpty() && 
				              vService.viewAllLoans() instanceof List &&
				              vService.viewAllLoans().get(0) instanceof Loan);
         
	}
	
	@Test
	public void testViewVehicleService() {
		
		Assertions.assertTrue(!vService.viewAllVehicles().isEmpty() && 
				              vService.viewAllVehicles() instanceof List &&
				              vService.viewAllVehicles().get(0) instanceof Vehicle);
       
	}
	
}
