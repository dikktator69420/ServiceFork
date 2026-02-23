package at.spengergasse.ungerplueservicelogic.persistence;

import at.spengergasse.ungerplueservicelogic.domain.DeliveryNote;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface DeliveryNoteRepository {
    Optional<DeliveryNote> findById(Long id);
    List<DeliveryNote> findAll();
}
