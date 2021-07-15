package com.ioco.invoice.repository;

import com.ioco.invoice.model.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by user on 7/15/2021.
 */

public interface InvoiceRepository extends JpaRepository<Invoice, Long> {

}
