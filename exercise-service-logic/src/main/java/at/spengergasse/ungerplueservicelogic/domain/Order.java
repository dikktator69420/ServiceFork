package at.spengergasse.ungerplueservicelogic.domain;

import org.springframework.data.annotation.Id;

import java.time.LocalDate;
import java.util.List;

public record Order(
        @Id Long id,
        String orderNumber,
        LocalDate placementDate,
        OrderStatus orderStatus,
        Customer customer,
        List<OrderLineItem> orderLineItems
) {
}
