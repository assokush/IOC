package com.ioco.invoice.services;

import com.ioco.invoice.exception.InvoiceNotFoundException;
import com.ioco.invoice.model.Invoice;
import com.ioco.invoice.repository.InvoiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by user on 7/15/2021.
 */

@Component
public class InvoiceService {


    private InvoiceRepository invoiceRepository;

    @Autowired
    public InvoiceService(InvoiceRepository invoiceRepository) {
        this.invoiceRepository = invoiceRepository;
    }


    public void saveInvoice(Invoice invoice){
        invoiceRepository.save(invoice);
    }


    public List<Invoice> findAllInvoice(){
        return invoiceRepository.findAll();
    }


     public Invoice findInvoice(long invoiceId){
         return invoiceRepository.findById(invoiceId).orElseThrow(() -> new InvoiceNotFoundException(String.valueOf(invoiceId)));

     }
}
