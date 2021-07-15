package com.ioco.invoice.controller;

import com.ioco.invoice.dto.InvoiceDTO;
import com.ioco.invoice.model.Invoice;
import com.ioco.invoice.model.LineItem;
import com.ioco.invoice.services.InvoiceService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.List;

/**
 * Created by user on 7/15/2021.
 */
@RestController
@RequestMapping(value = "/invoices")
public class InvoiceController {

     private InvoiceService invoiceService;
     private Logger logger = LoggerFactory.getLogger(InvoiceController.class);

      @Autowired
        public InvoiceController(InvoiceService invoiceService) {
           this.invoiceService = invoiceService;
        }

    //Api register as a invoice
      @PostMapping(value = "/invoices")
      public void addInvoice(@RequestBody InvoiceDTO invoiceDto) {
        logger.info("userDto " + "" + invoiceDto.toString());
        Invoice invoice = new Invoice(invoiceDto.getClient(), invoiceDto.getVatRate(), invoiceDto.getInvoiceDate(), invoiceDto.getLineItem());
        invoiceService.saveInvoice(invoice);
   }


    //Api to view all invoices
    @GetMapping(value = "/invoices")
     public List<Invoice> viewAllInvoices(){
        return invoiceService.findAllInvoice();
    }


    //Api to view all invoices
    @GetMapping(value = "/invoices/{invoiceId}")
    public Invoice viewInvoice(@PathVariable("invoiceId") Long invoiceId){
        return invoiceService.findInvoice(invoiceId);
    }
}
