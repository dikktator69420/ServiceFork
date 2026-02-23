package at.spengergasse.ungerplueservicelogic.domain;

import org.springframework.data.annotation.Id;

import java.time.LocalDate;
import java.util.List;

public record Invoice(
    @Id Long id,
    String invoiceNumber,
    LocalDate issueDate,
    LocalDate dueDate,
    LocalDate settlementDate,
    InvoiceStatus invoiceStatus,
    Order order,
    Customer customer,
    List<InvoiceLineItem> invoiceLineItems
) {
}
