package at.spengergasse.ungerplueservicelogic.persistence;

import at.spengergasse.ungerplueservicelogic.domain.Customer;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CustomerRepository {
    Optional<Customer> findById(Long id);
    List<Customer> findAll();
}
