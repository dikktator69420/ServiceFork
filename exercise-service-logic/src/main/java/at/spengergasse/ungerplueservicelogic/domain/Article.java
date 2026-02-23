package at.spengergasse.ungerplueservicelogic.domain;

import org.springframework.data.annotation.Id;

public record Article(
    @Id Long id,
    String articleNumber,
    String name,
    String description,
    Long currentPriceInCents,
    Long itemsInStock
) {
}
