package za.co.digitalplatform.invoiceservice.invoice.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import za.co.digitalplatform.invoiceservice.invoice.entities.Invoice;

@Repository
public interface InvoiceRepository  extends CrudRepository<Invoice,Long> {

}
