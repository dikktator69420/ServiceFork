package at.spengergasse.ungerplueservicelogic.persistence;

import at.spengergasse.ungerplueservicelogic.domain.Invoice;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface InvoiceRepository {
    Optional<Invoice> findById(Long id);
    List<Invoice> findAll();
}
