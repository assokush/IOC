package com.ioco.invoice.dto;

import com.ioco.invoice.model.LineItem;
import lombok.Data;

import java.util.Date;

/**
 * Created by user on 7/15/2021.
 */
@Data
public class InvoiceDTO {

    private String client;
    private long vatRate;
    private Date invoiceDate;
    private LineItem lineItem;
}
