package at.spengergasse.ungerplueservicelogic.service;

import at.spengergasse.ungerplueservicelogic.persistence.DeliveryNoteRepository;
import org.springframework.stereotype.Service;

@Service
public class DeliveryNoteService {
    private final DeliveryNoteRepository deliveryNoteRepository;

    public DeliveryNoteService(DeliveryNoteRepository deliveryNoteRepository) {
        this.deliveryNoteRepository = deliveryNoteRepository;
    }
}
