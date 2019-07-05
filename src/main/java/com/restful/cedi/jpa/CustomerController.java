package com.restful.cedi.jpa;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CustomerController {

	//	@Autowired
	private final CustomerService cService;

	@Autowired
	private CustomerRepository customerRepository;

	@Autowired
	CustomerController(CustomerService cService) {
		this.cService = cService;
	}

	public CustomerRepository getRepository() {
		return customerRepository;
	}

	public void setRepository(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}

	@GetMapping(value="getAll")
	public List<Customer> getAll() {
		System.out.println(cService.getAllCustomers());
		return customerRepository.findAll();
	}


	@GetMapping(value="/lastnames")
	public List<Customer> getLastNames() {
		System.out.println(cService.getCustomer("Bauer"));
		return cService.getCustomer("Bauer");
	}

	@GetMapping(value="/index")
	public void index(){
		customerRepository.save(new Customer("John", "Banks", UUID.randomUUID()));
		customerRepository.save(new Customer("Joe", "Banks 2", UUID.randomUUID()));
		customerRepository.save(new Customer("Jose", "Janks", UUID.randomUUID()));
		customerRepository.save(new Customer("Jon", "Wanks 2", UUID.randomUUID()));
		customerRepository.save(new Customer("jessse", "leroy", UUID.randomUUID()));
		customerRepository.save(new Customer("Johnonson", "Andrew 2", UUID.randomUUID()));
	}


	@GetMapping("/customers/{id}")
	Customer getCustomerById(@PathVariable Long id) {
		return customerRepository.findById(id).get();
	}

	@PostMapping("/customers")
	Customer createOrSaveCustomer(@RequestBody Customer newCustomer) {
		return customerRepository.save(newCustomer);
	}


	//	@RestController
	//	@RequestMapping(value = "/employee-management", produces = { MediaType.APPLICATION_JSON_VALUE })
	//	public class EmployeeRESTController
	//	{
	//		@Autowired
	//		private EmployeeRepository repository;
	//
	//		public EmployeeRepository getRepository() {
	//			return repository;
	//		}
	//
	//		public void setRepository(EmployeeRepository repository) {
	//			this.repository = repository;
	//		}

	//		@GetMapping(value = "/employees")
	//		public List<Employee> getAllEmployees() {
	//			return repository.findAll();
	//		}
	//
	//		@PostMapping("/employees")
	//		Employee createOrSaveEmployee(@RequestBody Employee newEmployee) {
	//			return repository.save(newEmployee);
	//		}
	//
	//		@GetMapping("/employees/{id}")
	//		Employee getEmployeeById(@PathVariable Long id) {
	//			return repository.findById(id).get();
	//		}

	@PutMapping("/customers/{id}")
	Customer updateCustomer(@RequestBody Customer newCustomer, @PathVariable Long id) {

		return customerRepository.findById(id).map(customer -> {
			customer.setFirstName(newCustomer.getFirstName());
			customer.setLastName(newCustomer.getLastName());
			customer.setUuid(newCustomer.getUuid());

			return customerRepository.save(customer);

		}).orElseGet(() -> {
			newCustomer.setId(id);
			return customerRepository.save(newCustomer);
		});
	}

	@DeleteMapping("/employees/{id}")
	void deleteEmployee(@PathVariable Long id) {
		customerRepository.deleteById(id);
	}


}