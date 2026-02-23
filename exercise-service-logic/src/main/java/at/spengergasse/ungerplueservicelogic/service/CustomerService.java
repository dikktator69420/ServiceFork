package at.spengergasse.ungerplueservicelogic.service;

import at.spengergasse.ungerplueservicelogic.persistence.CustomerRepository;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }
}
