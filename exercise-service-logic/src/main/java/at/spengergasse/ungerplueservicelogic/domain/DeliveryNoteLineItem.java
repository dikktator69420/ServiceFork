package at.spengergasse.ungerplueservicelogic.domain;

public record DeliveryNoteLineItem(
        Article article,
        String articleNumber,
        String name,
        String description,
        Long quantity,
        Long unitPriceInCents
) {
}
