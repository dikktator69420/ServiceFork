package at.spengergasse.ungerplueservicelogic.domain;

public record OrderLineItem(
        Article article,
        String articleNumber,
        String name,
        String description,
        Long quantity,
        Long unitPriceInCents
) {
    public Long priceDifference(){
        return unitPriceInCents-article.currentPriceInCents();
    }
}
