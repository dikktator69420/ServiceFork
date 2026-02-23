package at.spengergasse.ungerplueservicelogic.service;

import at.spengergasse.ungerplueservicelogic.persistence.ArticleRepository;
import org.springframework.stereotype.Service;

@Service
public class ArticleService {

    private final ArticleRepository articleRepository;

    public ArticleService(ArticleRepository articleRepository) {
        this.articleRepository = articleRepository;
    }
}
