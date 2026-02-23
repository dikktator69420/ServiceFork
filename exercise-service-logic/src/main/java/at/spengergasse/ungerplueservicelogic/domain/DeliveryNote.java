package at.spengergasse.ungerplueservicelogic.domain;

import org.springframework.data.annotation.Id;

import java.time.LocalDate;
import java.util.List;

public record DeliveryNote(
        @Id Long id,
        String deliveryNoteNumber,
        LocalDate issueDate,
        DeliveryNoteStatus deliveryNoteStatus,
        Invoice invoice,
        Order order,
        Customer customer,
        List<DeliveryNoteLineItem> deliveryNoteLineItems
) {
}
