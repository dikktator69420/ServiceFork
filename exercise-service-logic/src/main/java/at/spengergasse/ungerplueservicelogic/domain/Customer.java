package at.spengergasse.ungerplueservicelogic.domain;

import org.springframework.data.annotation.Id;

public record Customer(
        @Id Long id,
        String customerNumber,
        String name
) {
}
