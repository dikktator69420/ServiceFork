package at.spengergasse.ungerplueservicelogic.domain;

public record InvoiceLineItem(
        Article article,
        String articleNumber,
        String name,
        String description,
        Long quantity,
        Long unitPriceInCents
) {
}
