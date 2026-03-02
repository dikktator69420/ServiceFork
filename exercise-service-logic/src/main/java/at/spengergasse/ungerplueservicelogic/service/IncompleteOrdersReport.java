package at.spengergasse.ungerplueservicelogic.service;

import at.spengergasse.ungerplueservicelogic.domain.Customer;

import java.util.ArrayList;
import java.util.List;

public record IncompleteOrdersReport(
        List<IncompleteOrderReportItem> orders
) {
    public IncompleteOrdersReport(){this(new ArrayList<>());}

    public IncompleteOrdersReport addItem(IncompleteOrderReportItem item) {
        orders.add(item);
        return this;
    }
}
