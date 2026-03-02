package at.spengergasse.ungerplueservicelogic.persistence;

import at.spengergasse.ungerplueservicelogic.domain.Order;
import at.spengergasse.ungerplueservicelogic.domain.OrderStatus;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Repository
public interface OrderRepository {
    Optional<Order> findById(Long id);
    List<Order> findAll();
    List<Order>  findAllByStatusInAndPlacementDateBetweenAndId(List<OrderStatus> statuses, LocalDateTime start, LocalDateTime end, Long Id);
    //assuming that not fully delivered also includes not delivered at all
}
