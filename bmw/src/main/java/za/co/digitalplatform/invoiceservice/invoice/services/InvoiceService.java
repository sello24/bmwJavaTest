package za.co.digitalplatform.invoiceservice.invoice.services;


import java.util.Optional;

import za.co.digitalplatform.invoiceservice.invoice.entities.Invoice;

public interface InvoiceService {
    //add invoice
    Invoice addInvoice(Invoice invoice);
    //view all invoice
    Iterable<Invoice> viewAllInvoices();
    //view invoice by id
    Optional<Invoice> viewInvoice(Long id);
}
