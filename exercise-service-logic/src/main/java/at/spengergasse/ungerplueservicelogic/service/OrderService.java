package at.spengergasse.ungerplueservicelogic.service;

import at.spengergasse.ungerplueservicelogic.persistence.OrderRepository;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    private final OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }
}
