package at.spengergasse.ungerplueservicelogic.service;

import at.spengergasse.ungerplueservicelogic.domain.Article;
import at.spengergasse.ungerplueservicelogic.domain.Customer;
import at.spengergasse.ungerplueservicelogic.domain.Order;
import at.spengergasse.ungerplueservicelogic.domain.OrderStatus;
import at.spengergasse.ungerplueservicelogic.persistence.OrderRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class OrderService {
    private final OrderRepository orderRepository;
    private final DateTimeFactory dateTimeFactory;

    public OrderService(OrderRepository orderRepository, DateTimeFactory dateTimeFactory) {
        this.orderRepository = orderRepository;
        this.dateTimeFactory = dateTimeFactory;
    }

    public IncompleteOrdersReport createIncompleteOrdersReport(Customer c, LocalDateTime start, LocalDateTime end) {
        List<Order> orders = orderRepository.findAllByStatusInAndPlacementDateBetweenAndId(List.of(OrderStatus.PARTIALLY, OrderStatus.PLACED), start, end, c.id());

        IncompleteOrdersReport report = new IncompleteOrdersReport();

        orders.stream()
                .map(this::createIncompleteOrderReportItem)
                .forEach(report::addItem);

        return report;
    }

    public IncompleteOrderReportItem createIncompleteOrderReportItem(Order order) {
        return null;
    }

    public IncompleteOrderArticle createIncompleteOrderArticle(Article article) {
        return null;
    }
}
