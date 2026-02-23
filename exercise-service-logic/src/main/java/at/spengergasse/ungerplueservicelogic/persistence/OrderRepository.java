package at.spengergasse.ungerplueservicelogic.persistence;

import at.spengergasse.ungerplueservicelogic.domain.Order;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface OrderRepository {
    Optional<Order> findById(Long id);
    List<Order> findAll();
}
